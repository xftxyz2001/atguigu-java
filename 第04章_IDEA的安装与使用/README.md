# 第04章_IDEA的安装与使用（上）

讲师：尚硅谷-宋红康（江湖人称：康师傅）

官网：[http://www.atguigu.com](http://www.atguigu.com/)

***

## 本章专题与脉络

<img src="images/第1阶段：Java基本语法-第04章.png" alt="第1阶段：Java基本语法-第04章" style="zoom:50%;" />

***

**【Why IDEA ?】**

![image-20221018105217845](images/image-20221018105217845.png)

<img src="images/2022-10-18_11-00-29.jpg" alt="2022-10-18_11-00-29" style="zoom:80%;" />

> 【注】JetBrains官方说明：
>
> 尽管我们采取了多种措施确保受访者的代表性，但结果可能会略微偏向 JetBrains 产品的用户，因为这些用户更有可能参加调查。

此外，2022年，某美国软件开发商在对近千名专业的Java开发者调研后，发布了《2022年Java开发者生产力报告》。报告提到：JetBrains 的 IntelliJ IDEA是最受欢迎的 Java IDE，占 `48%`，其次是 Eclipse，占 24%，Visual Studio Code 占 18%。

***

本着"`工欲善其事必先利其器`"的精神，本章从IDEA的介绍、安装、设置入手，讲解IDEA中项目的创建、快捷键与模板的使用、断点调试、常用插件等。

## 1. 认识IntelliJ IDEA

### 1.1 JetBrains  公司介绍

IDEA，是 JetBrains (https://www.jetbrains.com/)公司的产品，该公司成立于2000年，总部位于捷克的布拉格，致力于为开发者打造最高效智能的开发工具。

<img src="images/1576217376761.png" alt="1576217376761" style="zoom:80%;" />

公司旗下还有其它产品，比如：

* WebStorm：用于开发 JavaScript、HTML5、CSS3 等前端技术
* PyCharm：用于开发 python
* PhpStorm：用于开发 PHP
* RubyMine：用于开发 Ruby/Rails
* AppCode：用于开发 Objective - C/Swift
* CLion：用于开发 C/C++
* DataGrip：用于开发数据库和 SQL
* Rider：用于开发.NET
* GoLand：用于开发 Go

用于开发 Android的Android Studio，也是Google 基于 IDEA 社区版进行迭代的。

![1593264471351](images/1593264471351.png)

### 1.2 IntelliJ IDEA  介绍

IDEA，全称 `IntelliJ IDEA`，是 Java 语言的集成开发环境，目前已经（基本）`代替`了Eclipse的使用。IDEA 在业界被公认为是最好的 Java 开发工具（之一），因其`功能强悍`、`设置人性化`，而深受Java、大数据、移动端程序员的喜爱。

IntelliJ IDEA 在 2015 年的官网上这样介绍自己：

> Excel at enterprise, mobile and web development with Java, Scala and Groovy,with all the latest modern technologies and frameworks available out of thebox.
>

![image-20221018104714861](images/image-20221018104714861.png)

### 1.3 IDEA的主要优势：(vs Eclipse)

**功能强大：**

① 强大的整合能力。比如：Git、Maven、Spring等

<img src="images/内置的工具和支持的框架.png" alt="1576218068631" style="zoom: 67%;" />

② 开箱即用的体验（集成版本控制系统、多语言支持的框架随时可用，无需额外安装插件）

**符合人体工程学：**

① 高度智能（快速的智能代码补全、实时代码分析、可靠的重构工具）

![image-20221018104821144](images/image-20221018104821144.png)

② 提示功能的快速、便捷、范围广

![img](images/clip_imrage002.jpg)

![image-20221018104942633](images/image-20221018104942633.png)

③ 好用的快捷键和代码模板

④ 精准搜索

### 1.4 IDEA  的下载

- 下载网址： https://www.jetbrains.com/idea/download/#section=windows


- IDEA 分为两个版本： `旗舰版(Ultimate)`和 `社区版(Community)`。


- IDEA的大版本每年迭代一次，大版本下的小版本（如：2022.x）迭代时间不固定，一般每年3个小版本。


![image-20220606191620253](images/image-20220606191620253.png)

两个不同版本的详细对比，可以参照官网：
https://www.jetbrains.com/idea/features/editions_comparison_matrix.html

官网提供的详细使用文档：
https://www.jetbrains.com/help/idea/meet-intellij-idea.html

## 2. 卸载与安装

### 2.1 卸载过程

这里以卸载2022.1.2版本为例说明。在【控制面板】找到【卸载程序】

<img src="images/image-20221019120032582.png" alt="image-20221019120032582" style="zoom: 80%;" />

右键点击或左键双击IntelliJ IDEA 2022.1.2进行卸载：

<img src="images/image-20221019121258294.png" alt="image-20221019121258294" style="zoom:80%;" />

如果需要保留下述数据，就不要打√。如果想彻底删除IDEA所有数据，那就打上√。

<img src="images/image-20221019122135368.png" alt="image-20221019122135368" style="zoom:80%;" />

<img src="images/image-20221019122323575.png" alt="image-20221019122323575" style="zoom:80%;" />

<img src="images/image-20221019122349195.png" alt="image-20221019122349195" style="zoom:80%;" />

软件卸载完以后，还需要删除其它几个位置的残留：

![image-20221019161147552](images/image-20221019161147552.png)

![image-20221019161226843](images/image-20221019161226843.png)

### 2.2 安装前的准备

![image-20221018110944516](images/image-20221018110944516.png)

* 64 位 Microsoft Windows 11、10、8
* 最低 2 GB 可用 RAM，推荐 8 GB 系统总 RAM
* 2.5 GB 硬盘空间，推荐 SSD
* 最低屏幕分辨率 1024x768

从安装上来看，IntelliJ IDEA 对硬件的要求`似乎不是很高`。可是在实际开发中并不是这样的，因为 IntelliJ IDEA 执行时会有大量的缓存、索引文件，所以如果你正在使用 Eclipse / MyEclipse，想通过 IntelliJ IDEA 来解决计算机的卡、慢等问题，这基本上是不可能的，本质上你应该对自己的硬件设备进行升级。

### 2.3 安装过程

1、下载完安装包，双击直接安装![image-20220606191800719](images/image-20220606191800719.png)

2、欢迎安装

![image-20220606191825728](images/image-20220606191825728.png)

3、是否删除电脑上低版本的IDEA（如果有，可以选择忽略）

![image-20220606191838180](images/image-20220606191838180.png)

- 如果电脑上有低版本的IDEA，可以选择删除或保留。

- 这里没有卸载旧版本，如果需要卸载，记得勾选下面的保留旧的设置和配置。

4、选择安装目录

![image-20220606191942308](images/image-20220606191942308.png)

选择安装目录，目录中要避免中文和空格。

![image-20220606192004081](images/image-20220606192004081.png)

5、创建桌面快捷图标等

![image-20220606192053432](images/image-20220606192053432.png)

确认是否与.java、.groovy、.kt 格式文件进行关联。这里建议不关联。

6、在【开始】菜单新建一个文件夹（这里需要确认文件夹的名称），来管理IDEA的相关内容。

![image-20220606192126130](images/image-20220606192126130.png)

![image-20220606192135684](images/image-20220606192135684.png)

7、完成安装

![image-20220606192148284](images/image-20220606192148284.png)

重启以后，单击登录：![image-20220615164056349](images/image-20220615164056349.png)

### 2.4 注册

首先，需要通过用户协议：

<img src="images/image-20221019170223226.png" alt="image-20221019170223226" style="zoom:80%;" />

是否同意发送用户数据（特性、使用的插件、硬件与软件配置等），建议选择：不发送。

<img src="images/image-20221019170301256.png" alt="image-20221019170301256" style="zoom:80%;" />

接着，会提示我们进行注册。

- 选择1：试用30天。在IDEA2022.1.2版本中，需要先登录，才能开启试用。

  <img src="images/image-20221019170638164.png" alt="image-20221019170638164" style="zoom:80%;" />

- 选择2：付费购买旗舰版

  <img src="images/image-20221019170740875.png" alt="image-20221019170740875" style="zoom:80%;" />

  <img src="images/image-20221019170820975.png" alt="image-20221019170820975" style="zoom:50%;" />

- 选择3：（推荐）
  - 大家参照《`.\03-资料\01-IDEA 2022.1 注册文档\IntelliJ IDEA2022.1注册文档.docx`》操作即可。
  - 由于存在时效性，如果失效，大家可以自行搜索注册方式即可。

### 2.5 闪退问题

问题描述：2022.1启动不了，双击桌面图标，没有响应。

解决办法：

打开`C:\Users\songhk\AppData\Roaming\JetBrains\IntelliJIdea2022.1\idea64.exe.vmoptions` 这个文件。

![image-20220606195927066](images/image-20220606195927066.png)

内容如下所示：

![image-20220606195938517](images/image-20220606195938517.png)

删除红框的数据以后，再登录即可正常进入。

![image-20220606200011927](images/image-20220606200011927.png)

原因：之前使用过的比如2021.2.2版本，pojie了。新版IEDA太智能了，把现有的启运参数也都复制过去了。又因为最新的IDEA，不兼容pojie程序-javaagent:D:\develop_tools\IDEA\IntelliJ IDEA 2021.2.2\bin\jetbrains-agent.jar了，所以报错了，所以JVM结束了，所以没有启动画面，凉凉了。

## 3. HelloWorld的实现

### 3.1 新建Project - Class

选择"New Project"：

<img src="images/image-20221019174051967.png" alt="image-20221019174051967" style="zoom:80%;" />

指名工程名、使用的JDK版本等信息。如下所示：

![image-20221019174355370](images/image-20221019174355370.png)

接着创建Java类：

![image-20221019174505876](images/image-20221019174505876.png)

![image-20221019174551606](images/image-20221019174551606.png)

### 3.2 编写代码

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,World!");
    }
}
```

### 3.3 运行

![image-20221019174716442](images/image-20221019174716442.png)

![image-20221019174801370](images/image-20221019174801370.png)

## 4. JDK相关设置

### 4.1 项目的JDK设置

`File-->Project Structure...-->Platform Settings -->SDKs`

![image-20221019174847921](images/image-20221019174847921.png)

![image-20221019175030852](images/image-20221019175030852.png)

- 注1：SDKs全称是Software Development Kit ，这里一定是选择JDK的安装根目录，不是JRE的目录。
- 注2：这里还可以从本地添加多个JDK。使用“+”即可实现。

### 4.2 out目录和编译版本

`File-->Project Structure...-->Project Settings -->Project`

![image-20221019175358200](images/image-20221019175358200.png)

## 5. 详细设置

### 5.1 如何打开详细配置界面

1、显示工具栏

![image-20221019175536721](images/image-20221019175536721.png)

2、选择详细配置菜单或按钮

![image-20221019175620422](images/image-20221019175620422.png)

![image-20221019175953767](images/image-20221019175953767.png)

### 5.2 系统设置

#### 1、默认启动项目配置

![image-20221019180050832](images/image-20221019180050832.png)

启动IDEA时，默认自动打开上次开发的项目？还是自己选择？

如果去掉Reopen projects on startup前面的对勾，每次启动IDEA就会出现如下界面：

![image-20221019180304644](images/image-20221019180304644.png)

#### 2、取消自动更新

Settings-->Appearance & Behavior->System Settings -> Updates

![image-20221019180428323](images/image-20221019180428323.png)

默认都打√了，建议检查IDE更新的√去掉，检查插件更新的√选上。

### 5.3 设置整体主题

#### 1、选择主题

![image-20221019180637822](images/image-20221019180637822.png)

#### 2、设置菜单和窗口字体和大小

![1655136527800](images/1655136527800.png)

#### 3、设置IDEA背景图

![image-20221018204241748](images/image-20221018204241748.png)

选择一张合适的图片作为背景，即可。

![image-20221018204305159](images/image-20221018204305159.png)

### 5.4 设置编辑器主题样式

#### 1、编辑器主题

![1655136655026](images/1655136655026.png)

#### 2、字体大小

![1655136907073](images/1655136907073.png)

更详细的字体与颜色如下：

![image-20221019182625234](images/image-20221019182625234.png)

> 温馨提示：如果选择某个font字体，中文乱码，可以在fallback font（备选字体）中选择一个支持中文的字体。
>

#### 3、注释的字体颜色

![image-20220616121435182](images/image-20220616121435182.png)

- Block comment：修改多行注释的字体颜色
- Doc Comment –> Text：修改文档注释的字体颜色
- Line comment：修改单行注释的字体颜色

### 5.5 显示行号与方法分隔符

![1655137441471](images/1655137441471.png)

### 5.6 代码智能提示功能

![1655137649491](images/1655137649491.png)

IntelliJ IDEA 的代码提示和补充功能有一个特性：`区分大小写`。 如果想不区分大小写的话，就把这个对勾去掉。`建议去掉勾选`。

### 5.7 自动导包配置

* 默认需要自己手动导包，Alt+Enter快捷键

![1655138308426](images/1655138308426.png)

* 自动导包设置
  * 动态导入明确的包：Add unambiguous imports on the fly，该设置具有全局性；
  * 优化动态导入的包：Optimize imports on the fly，该设置只对当前项目有效；

![1655138465774](images/1655138465774.png)

### 5.8 设置项目文件编码（一定要改）

![image-20220615190832482](images/image-20220615190832482.png)

说明： Transparent native-to-ascii conversion主要用于转换ascii，显式原生内容。一般都要勾选。

### 5.9 设置控制台的字符编码

![image-20221019003153265](images/image-20221019003153265.png)

### 5.10 修改类头的文档注释信息

![image-20221018114632127](images/image-20221018114632127.png)

比如：

```java
/**
* ClassName: ${NAME}
* Package: ${PACKAGE_NAME}
* Description: 
* @Author 尚硅谷-宋红康
* @Create ${DATE} ${TIME} 
* @Version 1.0   
*/
```

常用的预设的变量，这里直接贴出官网给的：

```java
${PACKAGE_NAME} - the name of the target package where the new class or interface will be created. 
${PROJECT_NAME} - the name of the current project. 
${FILE_NAME} - the name of the PHP file that will be created. 
${NAME} - the name of the new file which you specify in the New File dialog box during the file creation. 
${USER} - the login name of the current user. 
${DATE} - the current system date. 
${TIME} - the current system time. 
${YEAR} - the current year. 
${MONTH} - the current month. 
${DAY} - the current day of the month. 
${HOUR} - the current hour. 
${MINUTE} - the current minute. 
${PRODUCT_NAME} - the name of the IDE in which the file will be created. 
${MONTH_NAME_SHORT} - the first 3 letters of the month name. Example: Jan, Feb, etc. 
${MONTH_NAME_FULL} - full name of a month. Example: January, February, etc.

```

### 5.11 设置自动编译

`Settings-->Build,Execution,Deployment-->Compiler`

<img src="images/1655109415450.png" alt="1655109415450" style="zoom: 67%;" />

### 5.12 设置为省电模式 (可忽略)

![image-20220616121851207](images/image-20220616121851207.png)

IntelliJ IDEA 有一种叫做`省电模式`的状态，开启这种模式之后 IntelliJ IDEA 会`关掉代码检查`和`代码提示`等功能。所以一般也可认为这是一种`阅读模式`，如果你在开发过程中遇到突然代码文件不能进行检查和提示，可以来看看这里是否有开启该功能。

### 5.13 取消双击shift搜索

因为我们按shift切换中英文输入方式，经常被按到，总是弹出搜索框，太麻烦了。可以取消它。

<img src="images/1659191272699.png" alt="1659191272699" style="zoom:80%;" />

- 方式1：适用于IDEA 2022.1.2版本

在2022.1版本中，采用如下方式消双击shift出现搜索框：搜索double即可，勾选Disable double modifier key shortcuts，禁用这个选项。

![1659190132458](images/1659190132458.png)

- 方式2：适用于IDEA 2022.1.2之前版本

双击shift 或 ctrl + shift + a，打开如下搜索窗口：

![1577243967254](images/1577243967254.png)

选择registry...，找到"ide.suppress.double.click.handler"，把复选框打上勾就可以取消双击shift出现搜索框了。

![1577244045320](images/1577244045320.png)

## 6. 工程与模块管理

### 6.1 IDEA项目结构

**层级关系：**

```
project(工程) - module(模块) - package(包) - class(类)
```

**具体的：**

```
一个project中可以创建多个module

一个module中可以创建多个package

一个package中可以创建多个class
```

> 这些结构的划分，是为了方便管理功能代码。

### 6.2 Project和Module的概念

在 IntelliJ IDEA 中，提出了Project和Module这两个概念。

<img src="images/image-20220523014358169.png" alt="image-20220523014358169" style="zoom:80%;" />

在 IntelliJ IDEA 中Project是`最顶级的结构单元`，然后就是Module。目前，主流的大型项目结构基本都是多Module的结构，这类项目一般是`按功能划分`的，比如：user-core-module、user-facade-module和user-hessian-module等等，模块之间彼此可以`相互依赖`，有着不可分割的业务关系。因此，对于一个Project来说：

- 当为单Module项目的时候，这个单独的Module实际上就是一个Project。
- 当为多Module项目的时候，多个模块处于同一个Project之中，此时彼此之间具有`互相依赖`的关联关系。
- 当然多个模块没有建立依赖关系的话，也可以作为单独一个“小项目”运行。

### 6.3 Module和Package

在一个module下，可以声明多个包（package），一般命名规范如下：

```
1.不要有中文
2.不要以数字开头
3.给包取名时一般都是公司域名倒着写,而且都是小写
  比如：尚硅谷网址是www.atguigu.com
  那么我们的package包名应该写成：com.atguigu.子名字。
```

### 6.4 创建Module

建议创建“Empty空工程”，然后创建多模块，每一个模块可以独立运行，相当于一个小项目。JavaSE阶段不涉及到模块之间的依赖。后期再学习模块之间的依赖。

步骤：

（1）选择创建模块

![1655167625885](images/1655167625885.png)

（2）选择模块类型：这里选择创建Java模块，给模块命名，确定存放位置

![1659191966074](images/1659191966074.png)

（4）模块声明在工程下面

![1659192028623](images/1659192028623.png)

### 6.5 删除模块

（1）移除模块

![1659192150052](images/1659192150052.png)

![1659192180062](images/1659192180062.png)

（2）彻底删除模块

![1659192241224](images/1659192241224.png)

### 6.6 导入老师的模块

（1）将老师的模块`teacher_chapter04`整个的复制到自己IDEA项目的路径下

![1659192514219](images/1659192514219.png)

接着打开自己IDEA的项目，会在项目目录下看到拷贝过来的module，只不过不是以模块的方式呈现。

![1659192692658](images/1659192692658.png)

（2）查看Project Structure，选择import module

![image-20220615213827271](images/image-20220615213827271.png)

![image-20220615214746952](images/image-20220615214746952.png)

（3）选择要导入的module：

![1659192850055](images/1659192850055.png)

![image-20220615214916374](images/image-20220615214916374.png)

（4）接着可以一路Next下去，最后选择Overwrite

![1659192928140](images/1659192928140.png)

![1659192995900](images/1659192995900.png)

最后点击OK即可了。

### 6.7 同时打开两个IDEA项目工程

#### 1、两个IDEA项目工程效果

有些同学想要把上课练习代码和作业代码分开两个IDEA项目工程。

![image-20211229111753237](images/image-20211229111753237.png)

![image-20211229111906342](images/image-20211229111906342.png)

#### 2、新建一个IDEA项目

注意：第一次需要新建，之后直接打开项目工程即可

![1655170522054](images/1655170522054.png)

![1655170341953](images/1655170341953.png)

![1655170765902](images/1655170765902.png)

#### 3、打开两个IDEA项目

![image-20211229112314671](images/image-20211229112314671.png)

![image-20211229112343470](images/image-20211229112343470.png)

![1655173351720](images/1655173351720.png)

### 6.8 导入前几章非IDEA工程代码

**1、创建chapter01、chapter02、chapter03等章节的module**

将相应章节的源文件粘贴到module的src下。

![image-20220615220728669](images/image-20220615220728669.png)

![image-20220615220755529](images/image-20220615220755529.png)

打开其中各个源文件，会发现有乱码。比如：

![image-20220615220846097](images/image-20220615220846097.png)

**2、设置编码**

当前项目是UTF-8。如果原来的.java文件都是GBK的（如果原来.java文件有的是GBK，有的是UTF-8就比较麻烦了）。

可以单独把这两个模块设置为GBK编码的。

![image-20220615220544760](images/image-20220615220544760.png)

改为GBK，确认即可。如图：

![image-20220615220950214](images/image-20220615220950214.png)

## 7. 代码模板的使用

### 7.1 查看Postfix Completion模板(后缀补全)

![1655173712802](images/1655173712802.png)

### 7.2 查看Live Templates模板(实时模板)

![img](images/wps2.jpg)

### 7.3 常用代码模板

#### 1、非空判断

* 变量.null：if(变量 == null)
* 变量.nn：if(变量 != null) 
* 变量.notnull：if(变量 != null) 
* ifn：if(xx  == null)
* inn：if(xx  != null)

#### 2、遍历数组和集合

* 数组或集合变量.fori：for循环
* 数组或集合变量.for：增强for循环
* 数组或集合变量.forr：反向for循环
* 数组或集合变量.iter：增强for循环遍历数组或集合

#### 3、输出语句

- sout：相当于System.out.println
- soutm：打印当前方法的名称
- soutp：打印当前方法的形参及形参对应的实参值
- soutv：打印方法中声明的最近的变量的值
- 变量.sout：打印当前变量值
- 变量.soutv：打印当前变量名及变量值

#### 4、对象操作

- 创建对象
  - Xxx.new  .var ：创建Xxx类的对象，并赋给相应的变量
  - Xxx.new  .field：会将方法内刚创建的Xxx对象抽取为一个属性
- 强转
  - 对象.cast：将对象进行强转
  - 对象.castvar：将对象强转后，并赋给一个变量

#### 5、静态常量声明

* psf：public static final
* psfi：public static final int
* psfs：public static final String
* prsf：private static final

### 7.4 自定义代码模板

#### 7.4.1 自定义后缀补全模板

![image-20221018143204667](images/image-20221018143204667.png)

![image-20221018143606913](images/image-20221018143606913.png)

#### 7.4.2 自定义Live Templates

例如：定义sop代表System.out.print();语句

①在Live Templates中增加模板

![1576467339631](images/1576467339631.png)

②先定义一个模板的组，这样方便管理所有自定义的代码模板

![1576467395084](images/1576467395084.png)

③在模板组里新建模板

![1576467478993](images/1576467478993.png)

④定义模板（以输出语句为例）

![1576467712251](images/1576467712251.png)

- Abbreviation：模板的缩略名称
- Description：模板的描述
- Template text：模板的代码片段
- 模板应用范围。比如点击Define。选择如下：应用在java代码中。

![1576467768103](images/1576467768103.png)

**其它模板1：单元测试模板：**

```java
@Test
public void test$var1$(){
    $var2$
}
```

![image-20220612124137427](images/image-20220612124137427.png)

**其它模板2：创建多线程**

```java
new Thread(){
    public void run(){
        $var$
    }
};
```

![image-20220612124221967](images/image-20220612124221967.png)

**其它模板3：冒泡排序**

```java
for(int $INDEX$ = 1; $INDEX$ < $ARRAY$.length; $INDEX$++) {
    for(int $INDEX2$ = 0; $INDEX2$ < $ARRAY$.length-$INDEX$; $INDEX2$++) {
        if($ARRAY$[$INDEX2$] > $ARRAY$[$INDEX2$+1]){
            $ELEMENT_TYPE$ temp = $ARRAY$[$INDEX2$];
            $ARRAY$[$INDEX2$] = $ARRAY$[$INDEX2$+1];
            $ARRAY$[$INDEX2$+1] = temp;
        }
    }
}
```

![image-20220612124541378](images/image-20220612124541378.png)


[第04章_IDEA的安装与使用（下）](./README2.md)
