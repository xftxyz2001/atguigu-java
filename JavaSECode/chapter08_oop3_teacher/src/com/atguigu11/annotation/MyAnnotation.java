package com.atguigu11.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: MyAnnotation
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:17
 * @Version 1.0
 */
@Target({TYPE, FIELD, METHOD,CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "hello";
}
