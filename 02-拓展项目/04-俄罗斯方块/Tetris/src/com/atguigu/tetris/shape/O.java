package com.atguigu.tetris.shape;


import com.atguigu.tetris.data.Data;
import com.atguigu.tetris.square.Square;
import com.atguigu.tetris.square.Tetromino;

public class O extends Tetromino {
    public O() {
        squares.add(new Square(0, 4, Data.O));
        squares.add(new Square(0, 5, Data.O));
        squares.add(new Square(1, 4, Data.O));
        squares.add(new Square(1, 5, Data.O));
        coordinateList.add(new Coordinate(0,0, 0,1, 1,0, 1,1 ));
    }
}
