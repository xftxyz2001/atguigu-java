package com.atguigu.tetris.shape;


import com.atguigu.tetris.data.Data;
import com.atguigu.tetris.square.Square;
import com.atguigu.tetris.square.Tetromino;

public class L extends Tetromino {
    public L() {
        squares.add(new Square(0, 4, Data.L));
        squares.add(new Square(0, 3, Data.L));
        squares.add(new Square(0, 5, Data.L));
        squares.add(new Square(1, 3, Data.L));
        coordinateList.add(new Coordinate(0,0, 0,-1, 0,1, 1,-1 ));
        coordinateList.add(new Coordinate(0,0, -1,0, 1,0, -1,-1));
        coordinateList.add(new Coordinate(0,0, 0,1, 0,-1, -1,1));
        coordinateList.add(new Coordinate(0,0, 1,0, -1,0, 1,1));

    }
}
