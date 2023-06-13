# 第11章：随堂复习与企业真题（常用类与基础API）

***

## 一、随堂复习

### 1. String类

- String的声明：final修饰、实现了Comparable接口
- String的不可变性
- String的两种定义方式：① 字面量的定义方式 String s = "hello" ② new 的方式：String s = new String("hello");
  - String的内存解析：字符串常量池、堆内存的使用
  - String s = new String("hello");在内存中创建的对象的个数。
- String的连接操作：+
  - 常量 + 常量 、变量 + 常量 、变量+变量、concat(String otherString)
  - String intern()
- 熟悉String的构造器、与其他结构之间的转换、常用方法
  - 编码和解码
    - 编码：字符、字符串 --> 字节、字节数组。对应着编码集
    - 解码：字节、字节数组 --> 字符、字符串。对应着解码集
    - 规则：解码集必须使用当初编码时使用的编码集。只要不一致，就可能出现乱码！
- String相关的算法问题。

### 2. StringBuffer、StringBuilder类

- [面试题]String、StringBuffer、StringBuilder的区别
- 知道什么场景下使用StringBuffer、StringBuilder

### 3. jdk8之前的日期、时间API

- System的currentTimeMillis()
- 两个Date的使用
- SimpleDateFormat用于格式化、解析
- Calendar日历类的使用

### 4. jdk8中新的日期、时间API

- LocalDate、LocalTime、LocalDateTime -->类似于Calendar
- Instant  -->类似于Date
- DateTimeFormatter --->类似于SimpleDateFormat

### 5. 比较器(重点)

- 自然排序涉及到Comparable
  - compareTo(Object obj)
- 定制排序涉及到Comparator
  - compare(Object obj1,Object obj2)

### 6. 其它API

了解



## 二、企业真题

### 2.1 String

#### 1. 以下两种方式创建的String对象有什么不同？（*团）

```java
String str = new String("test");

String str = "test";
```

略

#### 2. String s = new String("xyz");创建了几个String Object? （新*陆）

两个

#### 3. String a="abc" String b="a"+"bc" 问a==b?（网*邮箱）

是！

#### 4. String 中 “+” 怎样实现?（阿*）

常量 + 常量 ：略

变量 + 常量 、变量+变量：创建一个StringBuilder的实例，通过append()添加字符串，最后调用toString()返回一个字符串。（toString()内部new 一个String的实例）



#### 5. Java中String是不是final的？（凡*科技）

```
类似问题：
> String被哪些类继承？（网*邮箱）
> 是否可以继承String类?（湖南*利软件）
> String 是否可以继承?（阿*）
```

是

#### 6. String为啥不可变，在内存中的具体形态？（阿*）

规定不可变。

String：提供字符串常量池。

#### 7. String 可以在 switch中使用吗?(上海*睿)

可以。从jdk7开始可以使用

#### 8. String中有哪些方法?列举几个（闪*购）

。。。

#### 9. subString()到底做了什么?(银*数据)

String str = "hello";

String subStr = str.subString(1,3);  //底层是new的方式返回一个subStr，实体内容是"el"

### 2.2 String、StringBuffer、StringBuilder

#### 1. Java中操作字符串有哪些类？他们之间有什么区别。（南*电网）

```
类似问题：
> String 和 StringBuffer区别？(亿*国际、天*隆、*团)
> StringBuilder和StrignBuffer的区别？（平*金服）
> StringBuilder和StringBuffer的区别以及实现？（*为）
```

```
> String:不可变的字符序列;底层使用char[] （jdk8及之前），底层使用byte[] （jdk9及之后）
> StringBuffer:可变的字符序列;JDK1.0声明，线程安全的，效率低;底层使用char[] （jdk8及之前），底层使用byte[] （jdk9及之后）
> StringBuilder:可变的字符序列;JDK5.0声明，线程不安全的,效率高;底层使用char[] （jdk8及之前），底层使用byte[] （jdk9及之后）
```

#### 2. String的线程安全问题（闪*购）

线程不安全的

#### 3. StringBuilder和StringBuffer的线程安全问题（润*软件）

略



###  2.3 Comparator与Comparable

#### 1. 简单说说 Comparable 和 Comparator 的区别和场景？（软**力）

略

#### 2. Comparable 接口和 Comparator 接口实现比较（阿*）

略