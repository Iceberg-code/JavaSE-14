package cn.itcast.day14.demo01;
/*
* 获取线程的名称：
*   1、使用Thread类中的方法getName()
*       String getName()：返回该线程的名称
*   2、可以先获取到当前正在执行的线程，再使用线程中的方法getName()获取线程的名称
*       static Thread currentThread()：返回对当前正在执行的线程对象的引用
* */
//定义一个Thread类的子类
public class MyThread extends Thread{
    //重写Thread类中的run方法，设置线程任务
    @Override
    public void run() {

/*
        //获取线程名称：
        // 1、使用Thread类中的方法getName()
        //String name = getName();
        //System.out.println(name);
*/

/*
        //获取线程名称：
        //2、可以先获取到当前正在执行的线程，再使用线程中的方法getName()获取线程的名称
        Thread t = Thread.currentThread();
        //System.out.println(t);  //Thread[Thread-0,5,main] ...
        String name = t.getName();
        System.out.println(name);
*/

        //链式编程来获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
