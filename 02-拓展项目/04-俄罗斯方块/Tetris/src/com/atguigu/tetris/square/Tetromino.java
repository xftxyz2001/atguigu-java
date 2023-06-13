package com.atguigu.tetris.square;



import com.atguigu.tetris.shape.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 产生不同形状的方块
 * "O"形是四个方块组成的一个小正方形，每一是一个对称的图形，可以放在左右两边的位置是最合的。代表的颜色是黄色。
 * "I"形是四个小方块排成一竖排组成的。是所有的7种方块中是最长的一种，只有两种可以改变的形式，就是横过来。代表的颜色是蓝色
 * “S”形是四个小方格两两横着相结合，最再将上面的左侧的那个和底下的右侧的那个上下对齐，有四种可以改变的形式。代表的颜色是红色
 * “Z”形和"S"形一样，都是上面两个和下面两个正方形，不同的是是上面的右侧正方形和下侧左侧的正方形对齐，和“S”形是镜面对称的，代表的颜色是绿色。
 * “L”形是左侧的三个三个小方块竖着摞起来，然后右侧最下面和左侧的对齐，形成的形状特别像英语字母的L。代表的颜色是橙色。
 * “J”形和“L”形的形成方式差不多是一样的，也是三个小正方形竖着叠在一起，不过第四个需要加上的小正方形被放到了左边，和“L”也是一个镜面的对称关系。代表颜色是粉色。
 * “T”形也是一个轴对称图形，是三个小正方形横着排，并且在中间的那个小正方形下面加了一个小方块组成的。因为组成的形状类似字母“T”。代表的颜色是紫色。
 *
 */
public class Tetromino {
	protected List<Square> squares = new ArrayList<>();
	//保存旋转的相对于轴位置状态
	protected List<Coordinate> coordinateList = new ArrayList<>();
	/** 随机生成 4格方块, 使用简单工厂方法模式!
	 * randomTetromino 随机生成一个四格方块 
	 * 这个方面的返回值是多态的!
	 * */
	public static Tetromino randomTetromino(){
		Random r = new Random();
		//随机产生7以内的数字，选择不同的方块形状
		int type = r.nextInt(7);
		switch(type){
		case 0: return new T();
		case 1: return new I();
		case 2: return new J();
		case 3: return new L();
		case 4: return new O();
		case 5: return new S();
		case 6: return new Z();
		}
		return null;
	}

	public List<Square> getSquares() {
		return squares;
	}

	/** 下落 */
	public void slowDrop(){
		for(int i = 0; i< squares.size(); i++){
			squares.get(i).moveDown();
		}
	}

	/**
	 * 右移
	 */
	public void moveRight(){
		for(int i = 0; i< squares.size(); i++){
			this.squares.get(i).moveRight();
		}
	}

	/**
	 * 左移
	 */
	public void moveLeft(){
		for(int i = 0; i< squares.size(); i++){
			squares.get(i).moveLeft();
		}
	}
	private int index = 4;
	/** 在 Tetromino 上添加方法  */
	public void rotate() {
		index++;
		reLocation();
	}

	/**
	 * 重新定位坐标
	 */
	private void reLocation() {
		// index % states.length = 5 % 4 = 1
		Coordinate coordinate = coordinateList.get(index % coordinateList.size());
		// [0] + s1 = [1]
		Square o = squares.get(0);//获取当前的轴
		//轴与相对位置的和作为旋转以后的格子位置
		squares.get(1).setRow(o.getRow() + coordinate.getRow1());
		squares.get(1).setCol(o.getCol() + coordinate.getCol1());
		squares.get(2).setRow(o.getRow() + coordinate.getRow2());
		squares.get(2).setCol(o.getCol() + coordinate.getCol2());
		squares.get(3).setRow(o.getRow() + coordinate.getRow3());
		squares.get(3).setCol(o.getCol() + coordinate.getCol3());
	}
	public void rotateLeft() {
		index--;
		Coordinate coordinate = coordinateList.get(index%coordinateList.size());
		Square o = squares.get(0);//获取当前的轴
		squares.get(1).setRow(o.getRow() + coordinate.getRow1());
		squares.get(1).setCol(o.getCol() + coordinate.getCol1());
		squares.get(2).setRow(o.getRow() + coordinate.getRow2());
		squares.get(2).setCol(o.getCol() + coordinate.getCol2());
		squares.get(3).setRow(o.getRow() + coordinate.getRow3());
		squares.get(3).setCol(o.getCol() + coordinate.getCol3());
	}

}