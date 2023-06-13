package com.atguigu.tetris.shape;


import com.atguigu.tetris.data.Data;
import com.atguigu.tetris.square.Square;
import com.atguigu.tetris.square.Tetromino;

public class T extends Tetromino {
    public T() {
        squares.add(new Square(0, 4, Data.T));
        squares.add(new Square(0, 3, Data.T));
        squares.add(new Square(0, 5, Data.T));
        squares.add(new Square(1, 4, Data.T));
        coordinateList.add(new Coordinate(0,0, 0,-1, 0,1, 1, 0));
        coordinateList.add(new Coordinate(0,0, -1,0, 1,0, 0,-1));
        coordinateList.add(new Coordinate(0,0, 0,1,  0,-1, -1,0));
        coordinateList.add( new Coordinate(0,0, 1,0, -1,0, 0,1));
    }
}
