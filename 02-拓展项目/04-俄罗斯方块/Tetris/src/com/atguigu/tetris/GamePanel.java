package com.atguigu.tetris;


import com.atguigu.tetris.data.Data;
import com.atguigu.tetris.help.Help;
import com.atguigu.tetris.square.Square;
import com.atguigu.tetris.square.Tetromino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 俄罗斯方块游戏面板
 *
 */
public class GamePanel extends JPanel {
	/** 正在下落方块 */
	private Tetromino tetromino;
	/** 下一个下落方块 */
	private Tetromino nextOne;
	/** 行数 */
	public static final int ROWS = 20;
	/** 列数 */
	public static final int COLS = 10;
	/** 墙,整个游戏画布是10*20的大小  宽是10  高是20 主要用来绘制落下的俄罗斯方块组成的图形，如果某个元素为null，表示该行没有填充完整，即不能消除该行*/
	private Square[][] wall = new Square[ROWS][COLS];
	JFrame frame;
	public static final int CELL_SIZE = 26;

	public GamePanel(JFrame frame) {
		this.frame = frame;
	}
	public void action(){
		startAction();
		repaint();
		KeyAdapter l = new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				//按键盘F1显示帮助
				if(key == KeyEvent.VK_F1){
					Help.showDialog(frame);
				}
				//按键盘Q退出游戏
				if(key == KeyEvent.VK_Q){
					System.exit(0);//退出当前的Java进程
				}
				//如果游戏结束，按S重新开始
				if(gameOver){
					if(key==KeyEvent.VK_S){
						startAction();
					}
					return;
				}
				//如果暂停并且按键是[C]就继续动作
				if(pause){//pause = false
					if(key==KeyEvent.VK_C){    continueAction();    }
					return;
				}
				//否则处理其它按键
				switch(key){
					case KeyEvent.VK_RIGHT: moveRightAction(); break;
					case KeyEvent.VK_LEFT: moveLeftAction(); break;
					case KeyEvent.VK_DOWN: quickDown() ; break;
					case KeyEvent.VK_UP: rotateAction() ; break;
					case KeyEvent.VK_P: pauseAction() ; break;
				}
				repaint();
			}
		};
		this.requestFocus();
		this.addKeyListener(l);
	}
	private Timer timer;
	/** 分数 */
	private int score;
	/** 消掉的行数 */
	private int lines;
	private boolean pause;
	private boolean gameOver;
	/** Tetris 类中添加的方法, 用于启动游戏 */
	public void startAction(){
		//每次启动游戏都清空
		clearWall();
		//随机生成方块
		tetromino = Tetromino.randomTetromino();
		//随机生成下一个方块
		nextOne = Tetromino.randomTetromino();
		//行数
		lines = 0;
		//分数
		score = 0;
		//暂停键  默认是false，表示不暂停
		pause=false;
		//游戏是否结束，默认不结束
		gameOver=false;
		//计时器
		timer = new Timer();
		//定时任务，延迟500毫秒后，执行第一次task，然后每隔500毫秒执行一次task
		timer.schedule(new TimerTask(){
			public void run() {
				slowDropAction();
				repaint();
			}
		}, 500, 500);
	}
	private void clearWall(){
		//将墙的每一行的每个格子清理为null
		for(int row=0; row<ROWS; row++){
			Arrays.fill(wall[row], null);
		}
	}
	@Override
	public void paint(Graphics g){
		//绘制背景墙
		g.drawImage(Data.background, 0, 0, null);
		g.translate(15, 15);//当前位置右移15，下移15，绘制坐标系
		paintTetromino(g);//绘制正在下落的方块
		paintWall(g);//画墙
		paintNextOne(g);
		paintScore(g);
	}
	/**
	 * 绘制俄罗斯方块
	 * @param g
	 */
	private void paintTetromino(Graphics g) {
		List<Square> squares = tetromino.getSquares();
		for(int i = 0; i< squares.size(); i++){
			Square c = squares.get(i);
			int x = c.getCol() * CELL_SIZE-1;
			int y = c.getRow() * CELL_SIZE-1;
			g.drawImage(c.getImage(), x, y, null);
		}
	}

	//绘制落下的俄罗斯方块组成的图形
	private void paintWall(Graphics g){
		for(int row=0; row<wall.length; row++){
			//迭代每一行, i = 0 1 2 ... 19
			Square[] line = wall[row];
			//line.length = 10
			for(int col=0; col<line.length; col++){
				Square square = line[col];
				int x = col*CELL_SIZE;
				int y = row*CELL_SIZE;
				if(square ==null){
				}else{
					g.drawImage(square.getImage(), x-1, y-1, null);
				}
			}
		}
	}
	/**
	 * 绘制下一个俄罗斯方块
	 * @param g
	 */
	private void paintNextOne(Graphics g) {
		List<Square> squares = nextOne.getSquares();
		for(int i = 0; i< squares.size(); i++){
			Square c = squares.get(i);
			int x = (c.getCol()+10) * CELL_SIZE-1;
			int y = (c.getRow()+1) * CELL_SIZE-1;
			g.drawImage(c.getImage(), x, y, null);
		}
	}
	public static final int FONT_COLOR = 0x667799;
	public static final int FONT_SIZE = 0x20;

	/**
	 * 绘制分数
	 * @param g
	 */
	private void paintScore(Graphics g) {
		Font f = getFont();//获取当前的 面板默认字体
		Font font = new Font(
				f.getName(), Font.BOLD, FONT_SIZE);
		int x = 290;
		int y = 162;
		g.setColor(new Color(FONT_COLOR));
		g.setFont(font);
		String str = "SCORE:"+this.score;
		g.drawString(str, x, y);
		y+=56;
		str = "LINES:"+this.lines;
		g.drawString(str, x, y);
		y+=56;
		str = "[P]Pause";
		if(pause){str = "[C]Continue";}
		if(gameOver){    str = "[S]Start!";}
		g.drawString(str, x, y);
	}

	public void moveRightAction(){
		tetromino.moveRight();
		if(outOfBound() || coincide()){
			tetromino.moveLeft();
		}
	}
	public void moveLeftAction(){
		tetromino.moveLeft();
		if(outOfBound() || coincide()){
			tetromino.moveRight();
		}
	}

	/**
	 * 检查方块是否出届
	 * @return
	 */
	private boolean outOfBound(){
		List<Square> squares = tetromino.getSquares();
		for(int i = 0; i< squares.size(); i++){
			Square square = squares.get(i);
			int col = square.getCol();
			if(col<0 || col>=COLS){
				return true;//出界了
			}
		}
		return false;
	}

	private boolean coincide(){
		List<Square> squares = tetromino.getSquares();
		//for each 循环、迭代，简化了"数组迭代书写"
		for(Square square : squares){//增强版for循环
			int row = square.getRow();
			int col = square.getCol();
			if(row<0 || row>=ROWS || col<0 || col>=COLS ||
					wall[row][col]!=null){
				return true; //墙上有格子对象，发生重合
			}
		}
		return false;
	}
	/** 旋转动作 */
	public void rotateAction(){
		tetromino.rotate();
		if(outOfBound() || coincide()){
			tetromino.rotateLeft();
		}
	}
	/**
	 * 缓慢下落
	 * 完成功能：如果能够下落就下落，否则就落地即可，
	 * 新的方块出现并开始落下。
	 */
	public void slowDropAction(){
		//如果可以下落，则继续下落
		if(tetrominoCanDrop()){
			tetromino.slowDrop();
			return;
		}
		//不能下落的时候表示到底部或者碰到了已经存在的方块了，需要把当前的方块也放到wall数组中去。
		tetrominoLandToWall();
		//消除当前已经满的行
		destroyLines();//消除满的行
		//判断游戏是否结束
		isGameOver();
		//把下一个俄罗斯方块置为当前的方块
		tetromino = nextOne;
		//随机生成下一个方块
		nextOne = Tetromino.randomTetromino();
	}
	/** 检查当前的4格方块能否继续下落 */
	public boolean tetrominoCanDrop(){
		List<Square> squares = tetromino.getSquares();
		for(int i = 0; i< squares.size(); i++){
			Square square = squares.get(i);
			int row = square.getRow(); int col = square.getCol();
			//第一个条件判断是否触底
			// 第二个条件判断，是否正下方的第一个方格是否已经存在数组wall中
			// 若存在，表示已经有方块了，则不能继续下落
			if(row == ROWS-1 || wall[row+1][col] != null){
				return false;
			}
		}
		return true;
	}
	/** 4格方块着陆到墙上,此时存储到二维数组wall中 */
	public void tetrominoLandToWall(){
		List<Square> squares = tetromino.getSquares();
		for(int i = 0; i< squares.size(); i++){
			Square square = squares.get(i);
			int row = square.getRow();
			int col = square.getCol();
			wall[row][col] = square;
		}
	}
	public void deleteRow(int row){
		for(int i=row; i>=1; i--){
			//复制 [i-1] -> [i]
			System.arraycopy(wall[i-1], 0, wall[i], 0, COLS);
		}
		Arrays.fill(wall[0], null);
	}
	private static final int[] SCORE_TABLE={0,1,10,30,200};
	/** 销毁已经满的行，并且计分
	 * 1）迭代每一行
	 * 2）如果（检查）某行满是格子了 就销毁这行
	 **/
	public void destroyLines(){
		int lines = 0;
		for(int row = 0; row<wall.length; row++){
			if(fullSquares(row)){
				deleteRow(row);
				lines++;
			}
		}
		this.lines += lines;
		this.score += SCORE_TABLE[lines];
	}
	public boolean fullSquares(int row){
		Square[] line = wall[row];
		for(int i=0; i<line.length; i++){
			if(line[i]==null){//如果有空格式就不是满行
				return false;
			}
		}
		return true;
	}

	/**
	 * 继续游戏
	 */
	public void continueAction(){
		timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				slowDropAction();
				repaint();
			}
		}, 500, 500);
		pause = false;
		repaint();
	}
	/**
	 * 快速下落
	 */
	public void quickDown(){
		while(tetrominoCanDrop()){
			tetromino.slowDrop();
		}
		tetrominoLandToWall();
		destroyLines();
		isGameOver();
		tetromino = nextOne;
		nextOne = Tetromino.randomTetromino();
	}
	/**
	 * 暂停游戏
	 */
	public void pauseAction(){
		timer.cancel(); //停止定时器
		pause = true;
		repaint();
	}
	/**
	 * 检查游戏是否结束
	 */
	public void isGameOver(){
		if(wall[0][4]==null){
			return;
		}
		gameOver = true;
		timer.cancel();
		JOptionPane.showMessageDialog(null, "GAME OVER!点击S重新开始游戏", "GAME OVER", JOptionPane.PLAIN_MESSAGE);
		repaint();
	}
}