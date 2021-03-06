package cn.itcast.day14.demo01;
/*
* 线程名称：
*       主线程：main
*       新线程：Thread-0、Thread-1、Thread-2 ...
* */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();

        //调用start方法，开启新线程，执行run方法
        mt.start();

        new MyThread().start();

        //链式编程
        System.out.println(Thread.currentThread().getName());   //main - 获取主线程
    }
}
