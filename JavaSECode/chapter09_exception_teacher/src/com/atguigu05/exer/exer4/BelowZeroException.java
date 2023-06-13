package com.atguigu05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:31
 * @Version 1.0
 */
public class BelowZeroException  extends Exception{
    static final long serialVersionUID = -33875169939948L;
    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
