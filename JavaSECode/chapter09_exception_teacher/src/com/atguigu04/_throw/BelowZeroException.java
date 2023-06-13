package com.atguigu04._throw;

/**
 * ClassName: BelowZeroException
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:49
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -3387516999948L;
    public BelowZeroException(){

    }

    public BelowZeroException(String name){
        super(name);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
