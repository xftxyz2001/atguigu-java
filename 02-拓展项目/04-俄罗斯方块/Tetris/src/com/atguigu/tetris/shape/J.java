package com.atguigu.tetris.shape;


import com.atguigu.tetris.data.Data;
import com.atguigu.tetris.square.Square;
import com.atguigu.tetris.square.Tetromino;

public class J extends Tetromino {
    public J() {
        squares.add(new Square(0, 4, Data.J));
        squares.add(new Square(0, 3, Data.J));
        squares.add(new Square(0, 5, Data.J));
        squares.add(new Square(0, 5, Data.J));
        coordinateList.add(new Coordinate(0,0, 0,-1, 0,1, 1,1));
        coordinateList.add(new Coordinate(0,0, -1,0, 1,0, 1,-1));
        coordinateList.add(new Coordinate(0,0, 0,1, 0,-1, -1,-1));
        coordinateList.add(new Coordinate(0,0, 1,0, -1,0, -1,1 ));

    }
}
