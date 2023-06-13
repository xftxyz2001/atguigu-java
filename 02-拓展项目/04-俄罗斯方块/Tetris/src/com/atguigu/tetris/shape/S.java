package com.atguigu.tetris.shape;


import com.atguigu.tetris.data.Data;
import com.atguigu.tetris.square.Square;
import com.atguigu.tetris.square.Tetromino;

public class S extends Tetromino {

    public S() {
        squares.add(new Square(0, 4, Data.S));
        squares.add(new Square(0, 5, Data.S));
        squares.add(new Square(1, 3, Data.S));
        squares.add(new Square(1, 4, Data.S));
        coordinateList.add( new Coordinate(0,0, 0,1, 1,-1, 1,0 ));
        coordinateList.add( new Coordinate(0,0, -1,0, 1,1, 0,1 ));
    }
}
