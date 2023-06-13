package com.atguigu.tetris.data;

import javax.imageio.ImageIO;
import java.awt.*;

public class Data {
    public static Image background;//背景图片
    public static Image I;
    public static Image J;
    public static Image L;
    public static Image S;
    public static Image Z;
    public static Image O;
    public static Image T;
    static{
        try{
            background = ImageIO.read(
                    Data.class.getResource("../image/tetris.png"));
            T=ImageIO.read(Data.class.getResource("../image/T.png"));
            I=ImageIO.read(Data.class.getResource("../image/I.png"));
            S=ImageIO.read(Data.class.getResource("../image/S.png"));
            Z=ImageIO.read(Data.class.getResource("../image/Z.png"));
            L=ImageIO.read(Data.class.getResource("../image/L.png"));
            J=ImageIO.read(Data.class.getResource("../image/J.png"));
            O=ImageIO.read(Data.class.getResource("../image/O.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
