package com.atguigu08._interface.apply;

/**
 * ClassName: USBTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:49
 * @Version 1.0
 */
public class USBTest {

    public static void main(String[] args) {

        //1.创建接口实现类的对象
        Computer computer =  new Computer();
        Printer printer = new Printer();

        computer.transferData(printer);

        //2.创建接口实现类的匿名对象
        computer.transferData(new Camera());
        System.out.println();

        //3.创建接口匿名实现类的对象
        USB usb1 = new USB(){
            public void start(){
                System.out.println("U盘开始工作");
            }
            public void stop(){
                System.out.println("U盘结束工作");
            }
        };
        computer.transferData(usb1);

        //4. 创建接口匿名实现类的匿名对象

        computer.transferData(new USB(){
            public void start(){
                System.out.println("扫描仪开始工作");
            }
            public void stop(){
                System.out.println("扫描仪结束工作");
            }
        });

    }

}

class Computer{

    public void transferData(USB usb){ //多态：USB usb = new Printer();
        System.out.println("设备连接成功....");
        usb.start();

        System.out.println("数据传输的细节操作....");

        usb.stop();
    }

}

class Camera implements USB{

    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("照相机结束工作");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

interface USB{
    //声明常量
    //USB的长、宽、高、...


    //方法
    public abstract void start();
    void stop();
}
