# 第15章_File类与IO流拓展练习

讲师：尚硅谷-宋红康

网址：www.atguigu.com

***

## File类的使用

### 1、递归：目录总大小

```java
public class Exercise1 {
    public static void main(String[] args) {
        File dir = new File("D:/atguigu");
        long length = getLength(dir);
        System.out.println("大小：" + length);
    }

    public static long getLength(File dir){
        if (dir != null && dir.isDirectory()) {
            File[] listFiles = dir.listFiles();
            if(listFiles!=null){
                long sum = 0;
                for (File sub : listFiles) {
                    sum += getLength(sub);
                }
                return sum;
            }
        }else if(dir != null && dir.isFile()){
            return dir.length();
        }
        return 0;
    }
}
```

### 2、递归：删除非空目录

```java
public class Exercise2 {
    public static void main(String[] args) {
        File dir = new File("D:/atguigu/javase");
        forceDeleteDir(dir);
    }
    public static void forceDeleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            File[] listFiles = dir.listFiles();
            if(listFiles!=null){
                for (File sub : listFiles) {
                    forceDeleteDir(sub);
                }
            }
        }
        dir.delete();
    }
}
```

### 3、创建文件目录、文件

​	1、使用绝对路径，在D盘下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件

​	2、使用相对路径，在当前项目下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件

```java
public class Exercise3 {
	@Test
	public void test01() throws IOException {
		File dir = new File("d:/testIO");
		dir.mkdir();
		
		File file = new File("d:/testIO/1.txt");
		file.createNewFile();
	}
	
	@Test
	public void test02() throws IOException {
		File dir = new File("testIO");
		dir.mkdir();
		
		File file = new File("testIO/1.txt");
		file.createNewFile();
	}
}
```

### 4、判断文件目录、文件

​	1、检查D盘的testIO文件夹下是否存在文件a.txt，如果不存在则创建该文件。

​	2、获取D盘的testIO文件夹下的a.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台

​	3、判断File file = new File("d:\testIO");是否文件,是文件则输出：xxx是一个文件，是否文件夹,是文件夹则输出：xxx是一个文件夹

​	4、删除D盘的testIO文件夹下的a.txt文件

​	5、删除当前项目下的testIO文件夹下的1.txt文件，然后删除testIO文件夹

```java
public class Exercise4 {
    @Test
	public void test01(){
		File file = new File("d:/testIO/a.txt");
		try {
			if(!file.exists()){
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
    @Test
	public void test02(){
		File file = new File("d:/testIO/a.txt");
		System.out.println("文件名：" + file.getName());
		System.out.println("文件大小：" + file.length());
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		System.out.println("文件的父目录：" + file.getParent());
	}
    @Test
	public void test03(){
		File file = new File("d:/testIO");
		if(file.isFile()){
			System.out.println(file+"是一个文件。");
		}else if(file.isDirectory()){
			System.out.println(file + "是一个文件夹");
		}
	}
	@Test
	public void test04(){
		File file = new File("d:/testIO/a.txt");
		file.delete();
	}
	@Test
	public void test05(){
		File file = new File("d:/testIO/1.txt");
		file.delete();
		
		File dir = new File("d:/testIO");
		dir.delete();
	}
}
```

### 5、.java后缀文件

案例：获取D盘atguigu文件夹下所有的.java文件

（1）不包含子文件夹

（2）包含子文件夹

```java
public class Exercise5 {
	@Test
	public void test01(){
		File  file = new File("D:/atguigu");
		//不包含子文件夹中的
		File[] listFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		});
		for (File sub : listFiles) {
			System.out.println(sub);
		}
	}
	
	@Test
	public void test02() {
		File  file = new File("D:/atguigu");
		//包含子文件夹中的
		ArrayList<String> all = listAllSubs(file);
		for (String string : all) {
			System.out.println(string);
		}
	}
	
	public ArrayList<String> listAllSubs(File file){
		ArrayList<String> list = new ArrayList<>();
		if(file.isFile()){
			if(file.getName().endsWith(".java")){
				list.add(file.getPath());
			}
		}else if(file.isDirectory()){
			File[] listFiles = file.listFiles();
			for (File sub : listFiles) {
				list.addAll(listAllSubs(sub));
			}
		}
		return list;
	}
}
```

### 6、递归：统计文件目录大小

统计《尚硅谷_2022_JavaSE》文件夹大小

```java
public class Exercise6 {
	@Test
	public void test01(){
		File file = new File("d:/尚硅谷_2022_JavaSE");
		long size = size(file);
		System.out.println("文件夹总大小：" + size);
	}
	public long size(File file){
		if(file.isFile()){
			return file.length();
		}else if(file.isDirectory()){
			File[] listFiles = file.listFiles();
			long sum = 0;
			for (File sub : listFiles) {
				sum += size(sub);
			}
			return sum;
		}
		return 0;
	}
}

```

### 7、递归：复制文件目录

案例：复制《d:/作业与成绩》到当前项目的testIO文件夹中

```java
public class Exercise7 {
	@Test
	public void test01() throws IOException{
		File src = new File("d:/作业与成绩");
		File dest = new File("testIO");
		copyDir(src, dest);
	}
	
	public void copyDir(File src, File dest) throws IOException{
		if(dest.isFile()){
			throw new RuntimeException(dest +"不是文件夹");
		}
		if(src.isFile()){
			File destFile = new File(dest.getPath()+"/" + src.getName());
			copyFile(src, destFile);
		}else if(src.isDirectory()){
			File destFile = new File(dest.getPath()+"/" + src.getName());
			destFile.mkdir();
			
			File[] listFiles = src.listFiles();
			for (File sub : listFiles) {
				copyDir(sub,destFile);
			}
		}
	}
	
	public void copyFile(File srcFile, File destFile) throws IOException{
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);
		byte[] data = new byte[1024];
		int len;
		while((len = fis.read(data)) !=-1){
			fos.write(data, 0, len);
		}
		fis.close();
		fos.close();
	}
}

```

## FileInputStream、FileOutputStream

### 8、复制视频文件

案例需求：使用文件字节流复制一个视频文件

```java
public class Exercise8 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 1.创建流对象
            // 1.1 指定数据源
            fis = new FileInputStream("D:\\尚硅谷-JavaSE课程介绍.avi");//该文件必须存在
            // 1.2 指定目的地
            fos = new FileOutputStream("D:\\atguigu\\尚硅谷-JavaSE课程介绍.avi");//该文件会自动创建，如果之前已经存储会覆盖

            // 2.读写数据
            // 2.1 定义数组
            byte[] data = new byte[1024];
            // 2.2 定义长度
            int len;
            // 2.3 循环读取
            while ((len = fis.read(data)) != -1) {
                // 2.4 写出数据
                fos.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭资源
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

## FileReader、FileWriter

### 9、复制.java文件

案例需求：使用文件字符流复制一个.java文件

```java
public class Exercise9 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("D:\\HelloWorld.java");//该文件必须存在
            fw = new FileWriter("D:\\atguigu\\HelloWorld.java");//该文件会自动创建，如果之前已经存储会覆盖

            char[] data = new char[1024];
            int len;
            while ((len = fr.read(data)) != -1) {
                fw.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

### 10、整个文件夹复制

复制“今日资料的整个文件夹”到当前项目的testIO文件夹中

```java
public class Exercise10 {
    @Test
    public void test01() {
        File src = new File("d:/尚硅谷-JavaSE-第20天上课资料");
        File dest = new File("testIO");
        copyDir(src, dest);
    }

    public void copyDir(File src, File dest) {
        if (dest.isFile()) {
            throw new RuntimeException(dest + "不是文件夹");
        }
        if (src.isFile()) {
            File destFile = new File(dest.getPath() + "/" + src.getName());
            copyFile(src, destFile);
        } else if (src.isDirectory()) {
            File destFile = new File(dest.getPath() + "/" + src.getName());
            destFile.mkdir();

            File[] listFiles = src.listFiles();
            for (File sub : listFiles) {
                copyDir(sub, destFile);
            }
        }
    }

    public void copyFile(File srcFile, File destFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            byte[] data = new byte[1024];
            int len;
            while ((len = fis.read(data)) != -1) {
                fos.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

```

## 缓冲流

### 11、复制视频文件

案例需求：使用文件字节流+缓冲流复制一个视频文件

```java
public class Exercise11 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            // 1.创建流对象
            // 1.1 指定数据源
            FileInputStream fis = new FileInputStream("D:\\尚硅谷-JavaSE课程介绍.avi");
            // 1.2 使用缓冲流包装
            bis = new BufferedInputStream(fis);

            // 1.3 指定目的地
            FileOutputStream fos = new FileOutputStream("D:\\atguigu\\尚硅谷-JavaSE课程介绍.avi");
            // 1.4 使用包装流包装
            bos = new BufferedOutputStream(fos);

            // 2.读写数据
            // 2.1 定义数组
            byte[] data = new byte[1024];
            // 2.2 定义长度
            int len;
            // 2.3 循环读取
            while ((len = bis.read(data)) != -1) {
                // 2.4 写出数据
                bos.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭资源
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

```

### 12、复制word文档

案例：

​	1、把笔记文档《第15章_IO流.md》，复制到当前项目的testIO文件夹下。

​	2、要求使用缓冲流和文件流一起实现

```java
public class Exercise12 {
	public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(
                    new FileInputStream("D:/尚硅谷_JavaSE_songhk/课件/第15章_IO流.md"));
            bos = new BufferedOutputStream(
                    new FileOutputStream("testIO/第15章_IO流.md"));
            byte[] data = new byte[1024];
            int len;
            while ((len = bis.read(data)) != -1) {
                bos.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

## 转换流

### 13、转换文件编码

将GBK编码的文本文件，转换为UTF-8编码的文本文件。

例如：将编码为GBK的文件“file_gbk.txt”，转换为编码为UTF-8的文件“file_utf8.txt”。

```java
public class Exercise13 {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            // 1.定义文件路径
            String srcFile = "file_gbk.txt";
            String destFile = "file_utf8.txt";
            // 2.创建流对象
            // 2.1 转换输入流,指定GBK编码
            isr = new InputStreamReader(new FileInputStream(srcFile), "GBK");
            // 2.2 转换输出流,默认utf8编码
            osw = new OutputStreamWriter(new FileOutputStream(destFile));
            // 3.读写数据
            // 3.1 定义数组
            char[] cbuf = new char[1024];
            // 3.2 定义长度
            int len;
            // 3.3 循环读取
            while ((len = isr.read(cbuf)) != -1) {
                // 循环写出
                osw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.释放资源
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

## 对象流

### 14、读写常见数据类型数据

把如下这些数据存放到一个data.dat文件中，并且再次读取显示

```java
int a = 10;
char c = 'a';
double d = 2.5;
boolean b = true;
String str = "尚硅谷";
```

```java
public class Exercise14 {
    //序列化过程
    @Test
    public void test01() {
        ObjectOutputStream dos = null;
        try {
            dos = new ObjectOutputStream(new FileOutputStream("data.dat"));

            int a = 10;
            char c = 'a';
            double d = 2.5;
            boolean b = true;
            String str = "尚硅谷";

            dos.writeInt(a);
            dos.writeChar(c);
            dos.writeDouble(d);
            dos.writeBoolean(b);
            dos.writeUTF(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos != null)
                    dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //反序列化过程
    @Test
    public void test02() {
        ObjectInputStream dis = null;
        try {
            dis = new ObjectInputStream(new FileInputStream("data.dat"));
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null)
                    dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    
}
```



### 15、银行账户对象

（1）声明一个银行账户类Account，

- 成员变量：利率、账号、余额，其中所有账户的利率是相同的，所有成员变量都私有化。
- 实现Serializable接口，并添加serialVersionUID。
- 提供get/set
- 提供有参构造public Account(String id ,double balance)
- 提供计算年利息方法public double annualInterest()，余额*利率
- 重写toString方法，返回账号和余额、年利息

（2）在测试类的test1方法中，设置利率为0.035，创建账户类的对象，账号为“11111”，余额为“1000”元，打印账户信息，并把该账户对象保存到bank.dat文件中。

（3）在测试类的test2方法中，调整利率为0.03，读取bank.dat文件中第一个账号对象，并创建另一个账户对象，账号为“22222”，余额为“2000”元，打印两个账户对象，并把两个账户对象保存到bank.dat文件中。

```java
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private static double rate;
    private String id;
    private double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double annualInterest(){
        return balance * rate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", 年利息 =" + annualInterest() +
                '}';
    }
}


```

```java
public class Exercise15 {
    @Test
    public void test01() {
        ObjectOutputStream oos = null;
        try {
            Account.setRate(0.035);
            Account account = new Account("11111", 1000);
            System.out.println(account);

            FileOutputStream fos = new FileOutputStream("bank.dat");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(account);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test02() {
        ObjectOutputStream oos = null;
        try {
            Account.setRate(0.03);
            FileInputStream fis = new FileInputStream("bank.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Account a1 = (Account) ois.readObject();
            Account a2 = new Account("22222", 2000);
            System.out.println(a1);
            System.out.println(a2);

            ArrayList<Account> list = new ArrayList<>();
            list.add(a1);
            list.add(a2);

            FileOutputStream fos = new FileOutputStream("bank.dat");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

### 16、Message类

案例：

​	1、声明一个Message类，包含：发送者、接收者、消息内容、发送时间等属性，属性私有化，提供有参构造，get/set，重写toString

​	2、创建一个Message对象，并写到message.dat文件中，并再次读取显示

```java
public class Exercise16 {
	@Test
    public void test01() {
        ObjectOutputStream oos = null;
        try {
            Message msg = new Message("韩梅梅", "李雷", "结婚了", System.currentTimeMillis());

            oos = new ObjectOutputStream(new FileOutputStream("message.dat"));
            oos.writeObject(msg);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test02() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("message.dat"));
            Object msg = ois.readObject();
            System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class Message implements Serializable{

	private static final long serialVersionUID = 123423432L;
	private String fromUser;
	private String toUser;
	private String content;
	private long sendTime;
	public Message(String fromUser, String toUser, String content, long sendTime) {
		super();
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.content = content;
		this.sendTime = sendTime;
	}
	public Message() {
		super();
	}
	public String getFromUser() {
		return fromUser;
	}
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getSendTime() {
		return sendTime;
	}
	public void setSendTime(long sendTime) {
		this.sendTime = sendTime;
	}
	@Override
	public String toString() {
		return "Message [fromUser=" + fromUser + ", toUser=" + toUser + ", content=" + content + ", sendTime="
				+ sendTime + "]";
	}
}
```



## 数据流

### 17、保存并读取数据

案例：

​	把如下这些数据存放到一个data.dat文件中，并且再次读取显示

```java
int a = 10;
char c = 'a';
double d = 2.5;
boolean b = true;
String str = "尚硅谷";
```

```java
public class Exercise17 {
	@Test
    public void test01() {
        DataOutputStream dos = null;
        try {
            int a = 10;
            char c = 'a';
            double d = 2.5;
            boolean b = true;
            String str = "尚硅谷";

            dos = new DataOutputStream(new FileOutputStream("data.dat"));
            dos.writeInt(a);
            dos.writeChar(c);
            dos.writeDouble(d);
            dos.writeBoolean(b);
            dos.writeUTF(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos != null)
                    dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test02() {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("data.dat"));
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null)
                    dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

## 打印流

### 18、打印信息

案例：

​	1、使用从键盘输入三句话，用PrintStream打印到一个words.txt文件中

​	2、再用Scanner一行一行读取显示

```java
public class Exercise18 {
	@Test
    public void test01() {
        Scanner input = null;
        PrintStream ps = null;
        try {
            input = new Scanner(System.in);
            ps = new PrintStream("words.txt");
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入第" + (i + 1) + "句要对宋老师说的话：");
                String content = input.nextLine();
                ps.println(content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null)
                input.close();
            if (ps != null)
                ps.close();
        }
    }

    @Test
    public void test02() {
        Scanner input = null;
        try {
            input = new Scanner(new File("words.txt"));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null)
                input.close();
        }
    }
}

```



