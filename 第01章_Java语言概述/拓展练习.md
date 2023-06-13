# 第01章_Java语言概述拓展练习

讲师：尚硅谷-宋红康

网址：www.atguigu.com

***


### 1、System.out.println()和System.out.print()有什么区别？

```
System.out.println();  //打印完后，会换行。 

System.out.print(); //打印完后，不会换行。
```



### 2、一个".java"源文件中是否可以包括多个类？有什么限制？

```
答：可以。但最多只有一个类名声明为public，与文件名相同。
```



拓展：程序中若只有一个public修饰的类，且此类含main方法。那么类名与源文件名可否不一致？

```
答：不能。
```



### 3、Something类的文件名叫OtherThing.java是否可以？

```java
class Something {
  public static void main(String[] something_to_do) {    
	System.out.println("Do something ...");
  }
}
```

答案: 正确。从来没有人说过Java的class名字必须和其文件名相同。但public class的名字必须和文件名相同。



### 4、为什么要设置path？

```
答：目的是为了在控制台的任何文件路径下，都可以调用jdk指定目录下的所有指令。
```



### 5、JDK,JRE和JVM的关系是什么？以及JDK、JRE包含的主要结构有哪些

```
1）JDK包含JRE，JRE包含JVM。

 2）JDK = JRE + Java开发工具
   JRE = JVM + Java SE 核心类库
```



### 6、Java的注释方式有哪几种，格式为何？

```
单行注释： //
多行注释： /*    */
文档注释： /**   */
```



### 7、（拓展）请对public static void main(String[] args)的每一个单词做解释？

public：公共的，用它修饰的类或成员在任意位置可见  

static：静态的，用它修饰的方法，可以不用创建对象就可以调用  

void：表示该方法没有返回值  

main：Java的主方法名，JavaSE的程序入口  

String[]：字符串数组，这是main方法的形参类型，可以通过命令行参数传值  

args：这是main方法的形参名，如果要在main中使用命令行参数，可以遍历该args数组。  

说明：刚开始学习Java上面每个单词意思不需要掌握。只需要知道这是程序入口，`"死记硬背"下来即可`。

> 以上知识不要求本章掌握，后续面向对象章节中会依次进行讲解。
>

