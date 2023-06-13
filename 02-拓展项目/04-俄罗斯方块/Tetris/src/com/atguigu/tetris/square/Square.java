package com.atguigu.tetris.square;

import java.awt.*;

/**
 * 格子
 * 每一个小方块，就有所在的行 列 和图片
 */
public class Square {
	//方格当前所在行
	private int row;
	//方格当前所在列
	private int col;
	//格子图片颜色
	private Image image;

	public Square() {
	}

	public Square(int row, int col, Image image) {
		super();
		this.row = row;
		this.col = col;
		this.image = image;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}


	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	/**
	 * 方格向右移动
	 */
	public void moveRight(){
		col++;
	}

	/**
	 * 方格向左移动
	 */
	public void moveLeft(){
		col--;
	}
	/**
	 * 方格向下移动
	 */
	public void moveDown(){
		row++;
	}

	@Override
	public String toString() {
		return "["+row+","+col+"]";
	}
}