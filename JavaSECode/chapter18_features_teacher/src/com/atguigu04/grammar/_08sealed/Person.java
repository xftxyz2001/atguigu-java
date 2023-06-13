package com.atguigu04.grammar._08sealed;

/**
 * ClassName: Person
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:10
 * @Version 1.0
 */
//Person是一个密封类，可以被指定的子类所继承。非指定的类不能继承Person类
public sealed class Person permits Student,Teacher,Worker{
}

//要求指定的子类必须是final、sealed、non-sealed三者之一
final class Student extends Person{} //Student类不能被继承了。

sealed class Teacher extends Person permits SeniorTeacher{} //Teacher类只能被指定的子类继承

non-sealed class SeniorTeacher extends Teacher{
}

non-sealed class Worker extends Person{}  //Worker类在继承时，没有任何限制

class WatchWorker extends Worker{}

//class Farmer extends Person{}
