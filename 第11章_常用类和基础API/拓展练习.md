# 第11章_常用类和基础API拓展练习

讲师：尚硅谷-宋红康

网址：www.atguigu.com

***

## 字符串相关练习1：阅读题

### 1、length说明

面试题：字符串的length和数组的length有什么不同？

```
字符串是length()方法，数组是length属性
```

### 2、阅读代码，分析结果

```java
class TEXT{
	public int num;
	public String str;
	
	public TEXT(int num, String str){
		this.num = num;
		this.str = str;
	}
}
public class Exercise2 {
    //tIn是传对象的地址，修改形参的属性，会影响实参
    //intIn是传数据，基本数据类型的形参修改和实参无关
    //Integer和String对象不可变
	public static void f1(TEXT tIn, int intIn, Integer integerIn, String strIn){
		tIn.num =200;
		tIn.str = "bcd";//形参和实参指向的是同一个TEXT的对象，修改了属性，就相当于修改实参对象的属性
		intIn = 200;//基本数据类型的形参是实参的“副本”，无论怎么修改和实参都没关系
		integerIn = 200;//Integer对象和String对象一样都是不可变，一旦修改都是新对象，和实参无关
		strIn = "bcd";
	}
	public static void main(String[] args) {
		TEXT tIn = new TEXT(100, "abc");//tIn.num = 100, tIn.str="abc"
		int intIn = 100;
		Integer integerIn = 100;
		String strIn = "abc";
		
		f1(tIn,intIn,integerIn,strIn);
		
		System.out.println(tIn.num + tIn.str + intIn + integerIn + strIn);
		//200 + bcd + 100 + 100 + abc
	}
}
```

### 3、阅读代码，分析结果

```java
public class Exercise3 {
    public static void stringReplace(String text){
        text = text.replace('j','i');
    }
    public static void bufferReplace(StringBuffer text){
        text.append("C");
        text = new StringBuffer("Hello");
        text.append("World!");
    }

    public static void main(String[] args) {
        String textString = new String("java");
        StringBuffer textBuffer = new StringBuffer("java");

        stringReplace(textString);
        bufferReplace(textBuffer);

        System.out.println(textString + textBuffer);//javajavaC

    }
}
```

### 4、阅读代码，分析结果

```java
public class Exercise4 {
	public static void main(String[] args) {
		String str = new String("world");
		char[] ch = new char[]{'h','e','l','l','o'};
		change(str,ch);
		System.out.println(str);
		System.out.println(String.valueOf(ch));
	}
	public static void change(String str, char[] arr){
		str = "change";
		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = 'c';
		arr[3] = 'd';
		arr[4] = 'e';
	}
    
}
```

### 5、阅读代码，分析结果

```java
public class Exercise5 {
	int a;
	int b;
    String str;
	public void f(){
		a = 0;
		b = 0;
        str = "hello";
		int[] c = {0};
		g(b,c);
		System.out.println(a + " " + b + " " + c[0] + "," + str);
	}
	public void g(int b, int[] c,String s){
		a = 1;
		b = 1;
		c[0] = 1;
        s = "world";
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.f();
	}
}
```

：

```java

public class Exercise5 {
	int a;
	int b;
    String str;
	public void f(){
		a = 0;//成员变量  this.a--> t.a = 0
		b = 0;//成员变量 this.b --> t.b = 0
        str = "hello";//成员变量  this.str -> t.str = "hello"
		int[] c = {0}; //f()方法的局部变量，是一个数组
		g(b,c,str);//this.g(b,c,str);
		System.out.println(a + " " + b + " " + c[0] + "," + str);//101hello
	}
	/*
	 * 形参基本数据类型：传递数据值
	 * 形参引用数据类型：传递地址值，但是字符串对象不可变
	 */
	public void g(int b, int[] c,String s){
		a = 1;//修改成员变量  this.a -> t.a = 1
		b = 1;//修改形参b，局部变量，(1)和成员变量b无关，(2)因为b是基本数据类型，所以和实参b也无关
		c[0] = 1;//c是数组，是引用数据类型，修改元素会影响实参
        s = "world";//s是局部变量， 但是字符串对象不可变，和实参无关
	}
	public static void main(String[] args) {
		Test t = new Test();//t.a = 0, t.b = 0,  t.str = null
		t.f();
	}
}
```

### 6、阅读代码，分析结果

```java
public class Exercise6 {	
	private static void change(String s,StringBuffer sb){
		s = "aaaa";//字符串对象是不可变，一旦修改，就是新对象
		sb.setLength(0);//先把sb里面的内容给清空了
		sb.append("aaaa");//再拼接aaaa
	}
	
	
	public static void main(String[] args) {
		String s = "bbbb";
		StringBuffer sb = new StringBuffer("bbbb");
		change(s,sb);
		System.out.println(s+sb);//bbbbaaaa
	}
}
```

### 7、阅读代码，分析结果

```java
public class Exercise7 {
	String str = new String("good");
	char[] ch = {'a','b','c'};
	
	public static void main(String[] args) {
		Example ex = new Example();//ex.str = good   ex.ch=  abc
		
		ex.change(ex.str,  ex.ch);
		System.out.print(ex.str + " and ");//good + and + gbc
		System.out.print(ex.ch);
	}
	
	public void change(String str, char[] ch){//形参和实参指向同一个数组
		str = "test ok";//字符串对象不可变，形参的修改，和实参无关
		ch[0] = 'g';//形参对元素的修改，直接修改的是实参元素的值
	}
}
```

### 8、阅读代码，分析结果

```java
public class Exercise8 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + "," + b);// ABx , B
	}

	public static void operate(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
        y.append('x');
	}
}
```

### 9、阅读代码，分析结果

```java
public class Exercise9{
	/*
	 * GBK，UTF-8，ISO8859-1所有的字符编码都向下兼容ASCII码
	 */
	public static void main(String[] args) throws Exception {
		String str = "中国";
		System.out.println(str.getBytes("ISO8859-1").length);// 2
		// ISO8859-1把所有的字符都当做一个byte处理，处理不了多个字节
		System.out.println(str.getBytes("GBK").length);// 4 每一个中文都是对应2个字节
		System.out.println(str.getBytes("UTF-8").length);// 6 常规的中文都是3个字节

		/*
		 * 不乱码：（1）保证编码与解码的字符集名称一样（2）不缺字节
		 */
		System.out.println(new String(str.getBytes("ISO8859-1"), "ISO8859-1"));// 乱码
		System.out.println(new String(str.getBytes("GBK"), "GBK"));// 中国
		System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));// 中国
	}
}
```

### 10、阅读代码，分析结果

![1572834413234](images/1572834413234.png)

![1572835014847](images/1572835014847.png)



![1572834430257](images/1572834430257.png)

![1572834653725](images/1572834653725.png)

![1572834908977](images/1572834908977.png)

![1572834804165](images/1572834804165.png)

## 字符串相关练习2：编程题

### 11、找出连续最长数字串

在字符串中找出连续最长数字串，返回这个串的长度，并打印这个最长数字串。

例如：abcd12345cd125se123456789，返回9，打印出123456789

```java
public class Exercise11 {
    public static void main(String[] args) {
        String str = "abcd12345cd125se123456789";

        //去掉最前的字母
        str =	str.replaceAll("^[a-zA-Z]+", "");

        //[a-zA-Z]：表示字母范围
        //+：一次或多次
        String[] strings = str.split("[a-zA-Z]+");

        String max = "";
        for (String string : strings) {
            if(string.length() > max.length()) {
                max = string;
            }
        }
        System.out.println("最长的数字串：" + max + "，它的长度为：" + max.length());
    }
}

```

### 12、去除字符串两端的空格

面试题：不能使用trim()，实现去除字符串两端的空格。

```java
public class Exercise12 {
    public static void main(String[] args) {
        String str ="    he   llo   ";
        System.out.println(myTrim(str));
        System.out.println(myTrim2(str));
        System.out.println(myTrim3(str));
    }

    public static String myTrim3(String str){
        //利用正则表达式
        //^表示开头    \s表示  空白符   *表示0次或多次     |表示或者    $表示结尾
        return str.replaceAll("(^\\s*)|(\\s*$)", "");
    }

    public static String myTrim2(String str){
        while(str.startsWith(" ")){
            str = str.replaceFirst(" ", "");
        }
        while(str.endsWith(" ")){
            str = str.substring(0, str.length()-1);
        }
        return str;
    }

    public static String myTrim(String str){
        char[] array = str.toCharArray();
        int start =0;
        for(int i=0;i<array.length;i++){
            if(array[i] == ' '){
                start++;
            }else{
                break;
            }
        }
        int end = array.length-1;
        for(int i=end;i>=0;i--){
            if(array[i] == ' '){
                end--;
            }else{
                break;
            }
        }

        String result = str.substring(start,end+1);

        return result;
    }
}

```

### 13、字符串反转

面试题：将字符串中指定部分进行反转。比如将“abcdefgho”实现部分反转，结果为”abfedcgho”

```java
public class Exercise13 {
    public static void main(String[] args) {
        String str ="abcdefgho";
        System.out.println(str);
        System.out.println(reverse1(str,2,5));
        System.out.println(reverse2(str,2,5));

    }

    //从第start个字符，到第end个字符
    public static String reverse1(String str,int start,int end){
        char[] array = str.toCharArray();
        for(int i = start,j=end;i< j;i++,j--){
            char temp =array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        String s = new String(array);
        return s;
    }

    //从第start个字符，到第end个字符
    public static String reverse2(String str,int start,int end){
        String left = str.substring(0,start);
        String middle = str.substring(start,end+1);
        String right = str.substring(end+1);
        return left+new StringBuilder(middle).reverse()+right;
    }
}
```

### 14、获取两个字符串中最大相同子串

案例：获取两个字符串中最大相同子串。比如：

   	str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"的最大相同子串是"hello"

 提示：将短的那个串进行长度依次递减的子串与较长的串比较。

```java
public class Exercise14 {
    public static void main(String[] args) {
        String str=findMaxSubString("abcwerthelloyuiodef","cvhellobnm");
        System.out.println(str);
    }

    //提示：将短的那个串进行长度依次递减的子串与较长的串比较。
    public static String findMaxSubString(String str1,String str2){
        String result="";

        String mixStr = str1.length()<str2.length()?str1:str2;
        String maxStr = str1.length()>str2.length()?str1:str2;

        //外循环控制从左到右的下标，内循环控制从右到左的下标
        for(int i=0;i<mixStr.length();i++){
            for(int j=mixStr.length();j>=i;j--){
                String str=mixStr.substring(i, j);
                if(maxStr.contains(str)){
                    //找出最大相同子串
                    if(result.length()<str.length()){
                        result = str;
                    }
                }
            }
        }
        return result;
    }
}
```

### 15、反转键盘录入的字符串

* 代码实现，参考效果如图所示：

![1559729294596](images/1559729294596.png)

```java
public class Exercise15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请键盘输入字符串：");
		String str = input.next();
		
		StringBuilder s = new StringBuilder(str);
		str = s.reverse().toString();
		System.out.println("反转后：" + str);
		input.close();
	}
}

```

### 16、qq格式验证

* 键盘录入QQ号码，验证格式的正确性。

  * 必须是5—12位数字。
  * 0不能开头。

* 效果如图所示：

  ![image-20220124085036154](images/image-20220124085036154.png)
  
  ![image-20220124085054255](images/image-20220124085054255.png)

```java
public class Exercise16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入qq号码：");
		String qq = input.next();
		
		System.out.print("这个qq号是否正确：");
		if(qq.matches("[1-9][0-9]{4,11}+")){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		input.close();
	}
}
```

### 17、字符串查找

* 键盘录入一个大字符串，再录入一个小字符串。
* 统计小字符串在大字符串中出现的次数。

* 代码实现，效果如图所示：

  ![image-20220531193800572](images/image-20220531193800572.png)

```java
public class Exercise17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入大字符串：");
		String big = input.next();
		
		System.out.print("请输入小字符串：");
		String small = input.next();
		
		int index;
		int count = 0;
		while((index = big.indexOf(small))!=-1){
			big = big.substring(index+small.length());
			count++;
		}
		System.out.println(small + "出现了" +count + "次");
		
		input.close();
	}
}

```

### 18、替换某字符串中的某字符串

* 键盘录入一个srcStr字符串，再录入一个delStr字符串。
* 删除该字srcStr符串中的所有delStr字符串。
* 并且统计delStr字符串在srcStr中出现的次数

* 代码实现，部分效果如图所示：

  ![1559729633062](images/1559729633062.png)

```java
public class Exercise18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入原字符串：");
		String src = input.next();
		
		System.out.print("请输入要删除的字符串：");
		String del = input.next();
		
		String result = src.replaceAll(del, "");
		
		int count = (src.length() - result.length())/del.length();
		System.out.println(del+"共出现了：" + count + "次");
		System.out.println("删除" + del + "后字符串：" + result);
		
		input.close();
	}
}

```

### 19、保留两位小数

* 生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。

* 代码实现，效果如图所示：

  ![1559729688451](images/1559729688451.png)

```java
public class Exercise19 {
	public static void main(String[] args) {
		double num = Math.random() * 100;
		System.out.println("随机数为：" +num);
		String str = num + "";
		str = str.substring(0,str.indexOf(".") + 3);
		System.out.println("截取小数点后两位后为：" + str);
	}
}
```

### 20、筛选字符串

* 定义数组，存入多个字符串。
* 删除长度大于5的字符串，打印删除后的数组。

* 代码实现，效果如图所示：

  ![1559729848960](images/1559729848960.png)

```java
public class Exercise20 {
	public static void main(String[] args) {
		String[] arr = {"helloworld","java","song","atguigu","li","yan","Iloveyou"};
		
		System.out.println("原字符串：");
		System.out.println( Arrays.toString(arr));
		int index = 0;
		while(index < arr.length){
			if(arr[index].length()>5){
				System.arraycopy(arr, index+1, arr, index, arr.length-index-1);
				arr = Arrays.copyOf(arr, arr.length-1);
			}else{
				index++;
			}
		}
		System.out.println("删除后：");
		System.out.println(Arrays.toString(arr));
	}
}

```

### 21、判断回文字符串

* 如果一个字符串，从前向后读和从后向前读，都是一个字符串，称为回文串，比如mom，dad，noon。

* 代码实现，效果如图所示：

  ![1559729968829](images/1559729968829.png)

```java
public class Exercise21 {
	@Test
	public void test01() {
		String str = "noon";
		System.out.println(str);
		StringBuilder s = new StringBuilder(str);
		String string = s.reverse().toString();
		System.out.print("回文数：");
		if(str.equals(string)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}

	@Test
	public void test02() {
		String str = "noon";
		System.out.println(str);
		char[] arr = str.toCharArray();
		boolean flag = true;
		for (int left = 0,right=arr.length-1; left <=right; left++,right--) {
			if(arr[left] != arr[right]){
				flag = false;
				break;
			}
		}
		System.out.print("回文数：");
		if(flag){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}

```

### 22、校验密码是否合法

* 校验密码是否合法。

  * 必须至少9个字符。
  * 必须至少2个大写字符。
  * 必须包含小写字母和数字。

* 代码实现，效果如图所示：

   ![1559739211002](images/1559739211002.png)

```java
public class Exercise22{
	@Test
	public void test01(){
		String password = "at1Gui2Gu";
		
		char[] arr = password.toCharArray();
		int upCount = 0;
		int numCount = 0;
		int lowerCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>='A' && arr[i]<='Z'){
				upCount++;
			}else if(arr[i]>='a' && arr[i]<='z'){
				lowerCount++;
			}else if(arr[i]>='0' && arr[i]<='9'){
				numCount++;
			}
		}
		System.out.print(password+"是否合法：");
		if(password.length() >=9 && upCount>=2 && numCount!=0 && lowerCount!=0){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
	}
}

```

### 23、模拟用户登录

（1）定义用户类，属性为用户名和密码。

（2）使用数组存储多个用户对象。

（3）录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。

* 登录失败时，当用户名错误，提示没有该用户。
* 登录失败时，当密码错误时，提示密码有误。

效果如图所示：

![image-20220531194605772](images/image-20220531194605772.png)

![image-20220531194625711](images/image-20220531194625711.png)

```java
public class User {
    private String username;
    private String password;
    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return username + "-" + password;
    }
}
```

```java
public class Exercise23 {
    public static void main(String[] args) {
        User[] all = new User[3];
        all[0] = new User("atguigu","123");
        all[1] = new User("songhongkang","8888");
        all[2] = new User("java","6666");
        System.out.println("库中的用户有：");
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }

        Scanner input =new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = input.next();
        System.out.print("请输入密码：");
        String password = input.next();

        boolean flag = false;
        for (int i = 0; i < all.length; i++) {
            if(all[i].getUsername().equals(username) && all[i].getPassword().equals(password)){
                flag = true;
                break;
            }
        }
        System.out.println("登录结果：" +flag);
        input.close();
    }
}
```

### 24、小数四舍五入

* 定义Handleable接口，具备一个处理字符串数字的抽象方法方法String handleString(String num);
  * 处理方式1：取整数部分。
  * 处理方式2：保留指定位小数，四舍五入。
* 代码实现，效果如图所示：

![1559728887849](images/1559728887849.png)

开发提示：

* 匿名内部类的方式，调用所有抽象方法。

```java
public interface Handleable {
	String handleString(String num);
}

```

```java
public class Exercise24 {
	@Test
	public void test01(){
		String str = "23.23456789";
		System.out.println("原数字：" + str);
		/*
		str = new Handleable() {
			@Override
			public String handleString(String num) {
				//查找小数点.位置
				int index = num.indexOf(".");
				if(index != -1){
					num = num.substring(0, num.indexOf("."));
				}
				return num;
			}
		}.handleString(str);*/
        
        Handleable h = new Handleable() {
			@Override
			public String handleString(String num) {
				//查找小数点.位置
				int index = num.indexOf(".");
				if(index != -1){
					num = num.substring(0, num.indexOf("."));
				}
				return num;
			}
		};
        str = h.handleString(str);
		
		System.out.println("取整后：" + str);
	}
	@Test
	public void test02(){
		String str = "23.99996789";
		System.out.println("原数字：" + str);
		
		final int wei = 4;//截取到小数点后4位，四舍五入
		str = new Handleable() {
			@Override
			public String handleString(String num) {
				BigDecimal big = new BigDecimal(num);
				BigDecimal b = new BigDecimal("1");
				BigDecimal shang = big.divide(b, wei, BigDecimal.ROUND_HALF_UP);
				return shang.toString();
			}
		}.handleString(str);
		System.out.println(str);
	}

```

### 25、字符串升序

案例：有一个字符串String abc = “342567891”，请写程序将字符串abc进行升序，可以使用JDK API中的现有的功能方法。

```java
public class Exercise25 {
	public static void main(String[] args) {
		String abc = "342567891";
		char[] arr = abc.toCharArray();
		Arrays.sort(arr);
		abc = new String(arr);
		System.out.println(abc);
	}
}
```

### 26、统计出现次数

案例：

已知一个字符串String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";

要求统计出现次数最多的字母及其出现的次数。不区分大小写。

```java
public class Exercise26 {
	@Test
	public void test1(){
		String str = "1、 hellao 2. world 3. java 4.String 5. haha 6、HELLO";
        
		//把字符串转为小写，因为不区分大小写，方便统计
		str = str.toLowerCase();
        //把里面的非字母去掉
        str = str.replaceAll("[^a-z]","");
		//转为字符数组
		char[] arr = str.toCharArray();
		//统计每个字母出现次数
		int[] counts = new int[26];//记录26个字母的次数
        /*
        counts[0]存'a'的次数   'a'=97  97-97->0
        counts[1]存'b'的次数   'b'=98  98-97->1
        */
		for (int i = 0; i < arr.length; i++) {
			counts[arr[i]-97]++;
		}
		
		//找最大值
		int max = counts[0];
		for (int i = 1; i < counts.length; i++) {
			if(max < counts[i]){
				max = counts[i];
			}
		}
		//打印最大值和字母
		for (int i = 0; i < counts.length; i++) {
			if(counts[i] == max){
                //i=0   'a'字母
                //i=1   'b'字母
				System.out.println(((char)(i+97)) + "出现了" + max + "次");
			}
		}
	}
}
```

### 27、字符串拆分

案例：已知字符串String str = "1.hello2.world3.java4.string";要求拆分出每一个单词，并遍历显示

```java
public class Exercise27 {
	public static void main(String[] args) {
		String str = "1.hello2.world3.java4.string";
		//把开头的1.去掉
        str = str.replaceAll("^\\d\\.","");
		//按照数字.的格式进行拆分
		String[] split = str.split("\\d\\.");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
}

```

### 28、替换字符串的某些字符

* 键盘录入一个源字符串存储在srcStr变量中，再录入要删除的字符串存储在delStr变量中。
* 删除该字srcStr符串中的所有delStr字符串。
* 并且统计delStr字符串在srcStr中出现的次数

效果如图所示：

![1559729633062](images/1559729633062-1651141511064.png)

```java
public class Exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入原字符串：");
        String src = input.next();

        System.out.print("请输入要删除的字符串：");
        String del = input.next();

        String result = src.replaceAll(del, "");

        int count = (src.length() - result.length())/del.length();
        System.out.println(del+"共出现了：" + count + "次");
        System.out.println("删除" + del + "后字符串：" + result);

        input.close();
    }
}
```

### 29、统计字母出现个数情况

1个字符串中可能包含a-z中的多个字符，字符也可能重复，例如：String data = “aabcexmkduyruieiopxzkkkkasdfjxjdsds”;写一个程序，对于给定一个这样的字符串求出字符串出现次数最多的那个字母以及出现的次数（若次数最多的字母有多个，则全部求出）

![1574169374414](images/1574169374414-1651141511064.png)

```java
public class Exercise29 {
    public static void main(String[] args) {
        String str = "aabbyolhljlhlxxmnbwyteuhfhjloiqqbhrg";

        //统计每个字母的次数
        int[] counts = new int[26];
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            counts[letters[i]-97]++;
        }

        //找出最多次数值
        int max = counts[0];
        for (int i = 1; i < counts.length; i++) {
            if(max < counts[i]) {
                max = counts[i];
            }
        }
        //找出所有最多次数字母
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] == max) {
                System.out.println((char)(i+97));
            }
        }
    }
}
```

### 30、统计子串出现次数

获取一个字符串在另一个字符串中出现的次数。比如：获取"ab"在 “abababkkcadkabkebfkabkskab”中出现的次数

```java
public class Exercise30 {
    public static void main(String[] args) {
        String str1="ab";
        String str2="abababkkcadkabkebfkabkskab";
        System.out.println(str1 + "在" + str2 +"中出现的次数：" + count(str1,str2));
    }

    public static int count(String str1,String str2){
        int count =0;
        while(true){
            int index = str2.indexOf(str1);
            if(index != -1){
                count++;
                str2 = str2.substring(index + str1.length());
            }else{
                break;
            }

        }
        return count;
    }
}
```

### 31、字符串替换

![](images/1573716569424-1651141511064.png)

```java
编写代码完成如下功能

public static String replace(String text, String target, String replace){

....

}

示例：replace(“aabbccbb”, “bb”, “dd”);  结果：aaddccdd

注意：不能使用String及StringBuffer等类的replace等现成的替换API方法。
```

参考：

```java
public class Exercise31 {
    public static void main(String[] args) {
        System.out.println(replace("aabbcbcbb", "bb", "dd"));
    }

    public static String replace(String text, String target, String replace) {
        while (true) {
            int index = text.indexOf(target);
            if (index != -1) {
                text = text.substring(0, index) + replace + text.substring(index + target.length());
            } else {
                break;
            }
        }
        return text;
    }
}
```

### 32、重叠月份

假设日期段用两个6位长度的正整数表示，例如：(201401，201406)用来表示2014年1月到2014年6月，求两个日期段的重叠月份数。例如：输入：时间段1：201401和201406，时间段2：201403和201409，输出：4

解释：重叠月份：3,4,5,6月共4个月

情形1：两个时间段都是同一年内的，实现代码如下：

```java
public static void main(String[] args) {
    String date1Start = "201401";
    String date1End = "201406";

    String date2Start = "201403";
    String date2End = "201409";

    int date1StartMonth = Integer.parseInt(date1Start.substring(4));
    int date1EndMonth = Integer.parseInt(date1End.substring(4));

    int date2StartMonth = Integer.parseInt(date2Start.substring(4));
    int date2EndMonth = Integer.parseInt(date2End.substring(4));

    int start = date1StartMonth >= date2StartMonth ? date1StartMonth : date2StartMonth;
    int end = date1EndMonth <= date2EndMonth ? date1EndMonth : date2EndMonth;
    System.out.println("重叠月份数："+(end-start+1));

    System.out.println("重叠的月份有：");
    for (int i = start; i <= end; i++) {
        System.out.println(i);
    }        
}
```

情形2：两个时间段可能不在同一年内的，实现代码如下：

```java
public static void main(String[] args) {
    String date1Start = "201401";
    String date1End = "201506";

    String date2Start = "201403";
    String date2End = "201505";

    String date1 = handleDate(date1Start,date1End);
    String date2 = handleDate(date2Start,date2End);
    System.out.println(date1);
    System.out.println(date2);

    String sameDate = findMaxSubString(date1,date2);

    System.out.println("重叠的月份数：" + sameDate.length()/6);
    if (!"".equals(sameDate)) {
        System.out.println("重叠的月份有：");
        while (sameDate.length() > 0) {
            String sameMonth = sameDate.substring(0, 6);
            System.out.println(sameMonth);
            sameDate = sameDate.substring(6);
        }

    }
}

public static String findMaxSubString(String str1,String str2){
    String result="";

    String mixStr = str1.length()<str2.length()?str1:str2;
    String maxStr = str1.length()>str2.length()?str1:str2;

    //外循环控制从左到右的下标，内循环控制从右到左的下标
    for(int i=0;i<mixStr.length();i++){
        for(int j=mixStr.length();j>=i;j--){
            String str=mixStr.substring(i, j);
            if(maxStr.contains(str)){
                //找出最大相同子串
                if(result.length()<str.length()){
                    result = str;
                }
            }
        }
    }
    return result;
}

public static String handleDate(String dateStart, String dateEnd) {
    int dateStartYear = Integer.parseInt(dateStart.substring(0,4));
    int dateEndYear = Integer.parseInt(dateEnd.substring(0,4));
    int dateStartMonth = Integer.parseInt(dateStart.substring(4));
    int dateEndMonth = Integer.parseInt(dateEnd.substring(4));

    String date = "";
    if(dateStartYear == dateEndYear) {//一年之内
        for (int i = dateStartMonth; i <=dateEndMonth; i++) {
            if(i<10) {
                date += dateStartYear+"0"+i;
            }else {
                date += dateStartYear+""+i;
            }
        }
    }else {//跨年
        for (int i = dateStartMonth; i <=12; i++) {//date1StartYear起始年
            if(i<10) {
                date += dateStartYear+"0"+i;
            }else {
                date += dateStartYear+""+i;
            }
        }
        for (int i = dateStartYear+1; i < dateEndYear; i++) {//中间间隔年
            for (int j = 1; j <= 12; j++) {
                if(j<10) {
                    date += i+"0"+j;
                }else {
                    date += i+""+j;
                }
            }
        }
        for (int i = 1; i <= dateEndMonth; i++) {//date1EndYear结束年
            if(i<10) {
                date += dateEndYear+"0"+i;
            }else {
                date += dateEndYear+""+i;
            }
        }
    }
    return date;
}
```

### 33、有限制次数的用户登录

```java
已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示

步骤:
1.定义两个字符串,分别表示username,password(之前注册过的用户名和密码)
2.创建Scanner对象,录入用户名和密码
3.判断,如果用户名和密码都和已存在的一样,登录成功
  否则,登录失败
```

```java
public class LoginTest33 {
    public static void main(String[] args) {
        //1.定义两个字符串,分别表示username,password(之前注册过的用户名和密码)
        String username = "root";
        String password = "1234";
        //2.创建Scanner对象,录入用户名和密码
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入用户名:");
            String name = sc.next();
            System.out.println("请您输入密码:");
            String pwd = sc.next();
       /* 3.判断,如果用户名和密码都和已存在的一样,登录成功
        否则,登录失败*/
            if (username.equals(name) && password.equals(pwd)){
                System.out.println("登录成功");
                break;
            }else{
                if (i==2){
                    System.out.println("账户冻结");
                }else{
                    System.out.println("登录失败");
                }
            }
        }

    }
}
```

## 日期时间API练习

### 33、百天推算

使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。

使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。	

```java
@Test
public void exercise33_1() {
	Calendar calendar = Calendar.getInstance();
	System.out.println("今天是你的生日：");
	Date birthday = calendar.getTime();
	System.out.println(birthday);
	
	System.out.println("百天以后是：");
	calendar.add(Calendar.DAY_OF_YEAR, 100);
	birthday = calendar.getTime();
	System.out.println(birthday);
}
@Test
public void exercise33_2() {
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println("今天是你的生日：");
	System.out.println(localDateTime);
	
	System.out.println("百天以后是：");
	LocalDateTime localDateTime1 = localDateTime.plusDays(100);
	System.out.println("百天以后是：");
	System.out.println(localDateTime1);
}
```
### 34、特殊值计算

（1）获取本地的当前系统时间

- 使用默认格式输出，例如：“2022-01-23T23:10:32.044”
- 使用预定义的标准格式输出，例如：“2022-1-23 23:10:32”
- 使用自定义的格式输出，例如：“2022年01月23日 23时12分15秒  871毫秒  星期日 是这一年的23天”

（2）计算两个时间的间隔

- 获取本地的当前系统时间
- 获取美国芝加哥的系统时间
- 计算两个时间的间隔

（3）计算日期的间隔

- 获取本地的当前系统日期
- 从键盘输入你的出生日期，例如：1995-05-01
- 计算两个日期的间隔

（4）计算时间的间隔

- 获取当前系统日期
- 从键盘输入你的出生日期和时间，例如：1995-05-01 08:08
- 计算两个日期之间的毫秒值
- 并求该毫秒值对应的一个日期时间值

```java
public class Exercise34 {
    @Test
    public void test01(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(df.format(now));
        df = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒  SSS毫秒  E 是这一年的D天");
        String str = df.format(now);
        System.out.println(str);
    }

    @Test
    public void test02(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime chicagoDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
        Duration duration = Duration.between(localDateTime,chicagoDateTime);
        System.out.println(duration);
    }
    @Test
    public void test03(){
        LocalDate localDate = LocalDate.now();

        Scanner input = new Scanner(System.in);
        System.out.print("请输入生日（格式为1995-05-01）：");
        String birthdayStr = input.next();
        input.close();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = LocalDate.from(df.parse(birthdayStr));

        Period p = Period.between(localDate,birthday);
        System.out.println(p);
    }

    @Test
    public void test04() throws ParseException {
        Date today = new Date();

        Scanner input = new Scanner(System.in);
        System.out.print("请输入生日（格式为1995-05-01 08:08）：");
        String birthdayStr = input.nextLine();
        input.close();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date birthday = sf.parse(birthdayStr);

        long time =today.getTime()- birthday.getTime() ;
        System.out.println(time);

        Date date = new Date(time);
        System.out.println(date);
    }
}
```

## 比较器练习

### 35、员工类和数组工具类、排序比较器

（1）声明一个Employee员工类

- 包含编号、姓名、薪资、年龄，属性私有化
- 提供get/set，提供无参和有参构造
- 重写toString，返回员工信息
- 实现Comparable接口，重写int compareTo(Employee emp)方法，按照编号比较大小。

（2）编写数组工具类ArrayTools，包含

- 静态方法public static void sort(Object[] arr)：实现给对象数组从小到大排序，要求元素的运行时类型必须实现Comparable接口
- 静态方法public static void sort(Object[] arr, Comparator c)：实现给对象数组从小到大排序，需要提供一个Comparator接口的实现类对象，给数组的元素对象排序。
- 静态方法public static void print(Object[] arr)：使用for循环遍历输出数组元素

（3）在测试类创建Employee[]元素数组，长度为5，创建5个员工对象

- 按照编号从小到大排序输出
- 按照编号从大到小排序输出（声明一个类实现Comparator接口，实现按照编号逆序比较大小）
- 按照薪资从低到高排序输出（声明一个类实现Comparator接口，实现按照薪资比较大小）
- 按照年龄从大到小排序输出（声明一个类实现Comparator接口，实现按照年龄逆序比较大小）

**代码实现方式一：**

```java
public class Employee implements Comparable{
    private int id; //编号
    private String name; //姓名
    private double salary; //工资
    private int age; //年龄

    public Employee() {
    }

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.id - ((Employee)o).id;
    }
}
```

```java
public class ArrayTools {
    public static void sort(Object[] arr){
        //冒泡排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                //将arr[j]强制为Comparable接口类型，目的是调用compareTo方法
                //当然如果数组的元素没有实现这个接口，那么将会发生ClassCastException
                Comparable c = (Comparable) arr[j];
                if(c.compareTo(arr[j+1])>0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void sort(Object[] arr, Comparator c){
        //冒泡排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                //这里不需要强制类型转换
                if(c.compare(arr[j], arr[j+1])>0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(Object[] arr){
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
}
```

```java
public class EmployeeIdComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Employee)o2).getId() - ((Employee)o1).getId();
    }
}
```

```java
public class EmployeeSalaryComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return Double.compare(e1.getSalary(),e2.getSalary());
    }
}
```

```java
public class EmployeeAgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e2.getAge() - e1.getAge();
    }
}
```

```java
public class Exercise35 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee(3,"张三",9000,22);
        arr[1] = new Employee(1,"熊大",10000,22);
        arr[2] = new Employee(5,"王五",7500,25);
        arr[3] = new Employee(4,"李四",8500,24);
        arr[4] = new Employee(2,"熊二",8500,18);

        System.out.println("所有员工：");
        ArrayTools.print(arr);

        System.out.println("按照员工编号从小到大排序：");
        ArrayTools.sort(arr);
        ArrayTools.print(arr);

        System.out.println("按照员工编号从大到小排序：");
        ArrayTools.sort(arr, new EmployeeIdComparator());
        ArrayTools.print(arr);

        System.out.println("按照员工薪资从低到高排序：");
        ArrayTools.sort(arr, new EmployeeSalaryComparator());
        ArrayTools.print(arr);

        System.out.println("按照员工年龄从大到小排序：");
        ArrayTools.sort(arr, new EmployeeAgeComparator());
        ArrayTools.print(arr);
    }
}
```

**代码实现方式二：**

```java
public class Employee implements Comparable{
    private int id;
    private String name;
    private double salary;
    private int age;

    public Employee() {
    }

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.id - ((Employee)o).id;
    }
}

```

```java
public class ArrayTools {
    public static void sort(Object[] arr){
        //冒泡排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                //将arr[j]强制为Comparable接口类型，目的是调用compareTo方法
                //当然如果数组的元素没有实现这个接口，那么将会发生ClassCastException
                Comparable c = (Comparable) arr[j];
                if(c.compareTo(arr[j+1])>0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void sort(Object[] arr, Comparator c){
        //冒泡排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                //这里不需要强制类型转换
                if(c.compare(arr[j], arr[j+1])>0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void print(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

```

```java
public class Exercise35 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee(3,"张三",9000,22);
        arr[1] = new Employee(1,"熊大",10000,22);
        arr[2] = new Employee(5,"王五",7500,25);
        arr[3] = new Employee(4,"李四",8500,24);
        arr[4] = new Employee(2,"熊二",8500,18);

        System.out.println("所有员工：");
        ArrayTools.print(arr);

        System.out.println("按照员工编号从小到大排序：");
        ArrayTools.sort(arr);
        ArrayTools.print(arr);

        System.out.println("按照员工编号从大到小排序：");
        ArrayTools.sort(arr, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return ((Employee)o2).getId() - ((Employee)o1).getId();
            }
        });
        ArrayTools.print(arr);

        System.out.println("按照员工薪资从低到高排序：");
        ArrayTools.sort(arr, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return Double.compare(e1.getSalary(),e2.getSalary());
            }
        });
        ArrayTools.print(arr);

        System.out.println("按照员工年龄从大到小排序：");
        ArrayTools.sort(arr, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                com.atguigu.api.Employee e1 = (com.atguigu.api.Employee) o1;
                com.atguigu.api.Employee e2 = (com.atguigu.api.Employee) o2;
                return e2.getAge() - e1.getAge();
            }
        });
        ArrayTools.print(arr);
    }
}
```

## 其它API练习

### 36、Math类 

请使用`Math` 相关的API，计算在 `-10.8`  到`5.9`  之间，绝对值大于`6`  或者小于`2.1` 的整数有多少个？

```java
public class Exercise36 {
    public static void main(String[] args) {
        // 定义最小值
        double min = -10.8;
        // 定义最大值
        double max = 5.9;
        // 定义变量计数
        int count = 0;
        // 范围内循环
        for (double i = Math.ceil(min); i <= max; i++) {
            // 获取绝对值并判断
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                // 计数
                count++;
            }
        }
        System.out.println("个数为: " + count + " 个");
    }
}
```

### 37、数组去重

有一个长度为10的整数数组，例如，{9,10,6,6,1,9,3,5,6,4}。去除数组中重复的内容，只保留唯一的元素。效果如图所示：

![](images/10.jpg)

开发提示：

- 定义一个变量count，初始化为数组的长度
- 遍历每一个元素，如果该元素与前面的某个元素相等，那么通过移动数组，把该元素覆盖掉，并修改count--。
- 最后创建一个新数组，长度为count，并从原数组把前count个元素复制过来

```java
public class Exercise37 {
    public static void main(String[] args) {
        int[] arr = {9,10,6,6,1,9,3,5,6,4};
        int count = arr.length;
        
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    System.arraycopy(arr,i+1,arr,i,count-i-1);
                    count--;
                    i--;
                }
            }
        }
        arr = Arrays.copyOf(arr,count);
        System.out.println(Arrays.toString(arr));
    }
}
```

### 38、System的arraycopy-1

![1573722779249](images/1573722779249.png)

```java
public class Exercise38 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1,2,3,4,5,6,7};
        arr = changPosition(1,5,arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] changPosition(int n1,int n2,int[] ii) {
        int indexN1=-1;
        for (int i = 0; i < ii.length; i++) {
            if(ii[i]==n1) {
                indexN1 = i;
                break;
            }
        }
        int indexN2 = -1;
        for (int i = 0; i < ii.length; i++) {
            if(ii[i]==n2) {
                indexN2 = i;
                break;
            }
        }
        System.arraycopy(ii, indexN1+1, ii, indexN1, indexN2-indexN1);
        ii[indexN2]=n1;
        return ii;
    }
}
```

### 39、System的arraycopy-2

![1574169751659](images/1574169751659.png)

```java
public class Exercise39 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        int moveCount = 3;
        for (int i = 0; i < moveCount; i++) {
            move(arr);
            System.out.println(Arrays.toString(arr));
        }

        int value = 4;
        System.out.println(indexOf(arr, moveCount, value));
    }

    public static int indexOf(int[] arr,int moveCount, int value) {
        while(moveCount>arr.length) {
            moveCount = moveCount - arr.length;
        }
        if(value == arr[0]) {
            return 0;
        }else if(value > arr[0]) {
            return Arrays.binarySearch(arr, 1, moveCount, value);
        }else {
            return Arrays.binarySearch(arr, moveCount, arr.length, value);
        }
    }

    public static void move(int[] arr) {
        int temp = arr[arr.length-1];
        System.arraycopy(arr, 0, arr, 1, arr.length-1);
        arr[0] = temp;
    }
}
```

### 40、BigDecimal的使用：数字格式化

（1）定义Handleable接口，具备一个处理字符串数字的抽象方法方法String handleString(String num);

（2）从键盘输入一个double类型的小数，用匿名内部类实现上面的接口，分别把小数处理为

* 处理方式1：取整数部分。
* 处理方式2：保留小数点后2位，不考虑四舍五入
* 处理方式3：保留指定位小数，考虑四舍五入。

效果如图所示：

```java
public interface Handleable {
	String handleString(String num);
}

```

```java
public class Exercise40 {
    public static void main(String[] args) {
        String str = "23.23656789";
        System.out.println("原数字：" + str);
		String result1 = new Handleable() {
			@Override
			public String handleString(String num) {
				//查找小数点.位置
				int index = num.indexOf(".");
				if(index != -1){
					num = num.substring(0, num.indexOf("."));
				}
				return num;
			}
		}.handleString(str);
        System.out.println("取整后：" + result1);

        String result2 = new Handleable() {
            @Override
            public String handleString(String num) {
                //查找小数点.位置
                int index = num.indexOf(".");
                if(index != -1){
                    num = num.substring(0, num.indexOf(".")+3);
                }
                return num;
            }
        }.handleString(str);
        System.out.println("保留小数点后2位，不考虑四舍五入：" + result2);

        final int wei = 4;//截取到小数点后4位，四舍五入
        String result3 = new Handleable() {
            @Override
            public String handleString(String num) {
                BigDecimal big = new BigDecimal(num);
                BigDecimal b = new BigDecimal("1");
                BigDecimal shang = big.divide(b, wei, BigDecimal.ROUND_HALF_UP);
                return shang.toString();
            }
        }.handleString(str);
        System.out.println("保留小数点后" + wei +"位，考虑四舍五入：" + result3);
    }
}
```

