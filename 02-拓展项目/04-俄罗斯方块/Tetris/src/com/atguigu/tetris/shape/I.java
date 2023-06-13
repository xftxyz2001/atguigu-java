package com.atguigu.tetris.shape;


import com.atguigu.tetris.data.Data;
import com.atguigu.tetris.square.Square;
import com.atguigu.tetris.square.Tetromino;

public class I extends Tetromino {
    public I() {
        squares.add(new Square(0, 4, Data.I));
        squares.add(new Square(0, 3, Data.I));
        squares.add(new Square(0, 5, Data.I));
        squares.add(new Square(0, 6, Data.I));
        coordinateList.add(new Coordinate(0,0, 0,1, 0,-1, 0,-2));
        coordinateList.add(new Coordinate(0,0, -1,0, 1,0,2,0));
    }
}
