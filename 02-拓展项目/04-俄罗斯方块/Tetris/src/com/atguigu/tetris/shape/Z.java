package com.atguigu.tetris.shape;

import com.atguigu.tetris.data.Data;
import com.atguigu.tetris.square.Square;
import com.atguigu.tetris.square.Tetromino;

public class Z  extends Tetromino {
    public Z() {
        squares.add(new Square(1, 4, Data.Z));
        squares.add(new Square(0, 3, Data.Z));
        squares.add(new Square(0, 4, Data.Z));
        squares.add(new Square(1, 5, Data.Z));
        coordinateList.add( new Coordinate(0,0, -1,-1, -1,0, 0,1 ));
        coordinateList.add(new Coordinate(0,0, -1,1, 0,1, 1,0 ));
    }
}
