# 第十一章 多线程

- 主要内容
C++无多线程机制
- 程序
- 进程
- 多任务
- 线程
- 创建线程*2
- 多线程同步、线程间通信



## 多线程简介
一条程序路径————线程；
1s执行10^13条指令；
多任务的操作系统；

**执行体**——>
**程序**——>含指令或数据的文件——>磁盘或其他设备——>静态的代码；
**进程**——>程序执行*一次的执行过程*——>系统运行的基本单元——>动态的；(ctrl+alt+delete)
**多任务**——>统一
**线程**——>多个执行单元——>程序的一条执行路径——>“轻量级进程”
[进程[线程][线程][线程][线程]...]

## 线程的创建与启动
java的线程
java.lang.Thread

Tread类 来创建线程，run()完成操作，start()方法启动



eg1.用Runnable接口的类实现输出i在100

eg2:用继承子Thread类的子类实现输出i在1~1000间


---
## 线程的状态和生命周期
java使用Thread类及其子类对象表示线程，新建线程在它的一个完整生命周期内通常经历**5种状态**，通过控制和调度使这几种状态转化；
1. **新建状态**(Newborn)
2. **就绪状态**(Runnable)
- CPU给时间片
3. **运行状态**(Running)
4. **阻塞状态**(Blocked)
- 时间片被抢走
5. **消亡状态**(Dead)
- 运行结束后即消亡
线程状态转换流程图

### 线程调度与优先级
调度
优先级
三个线程优先级的静态成员变量


## Thread线程类与Runnable接口

- ①使用Runnable接口——>线程体对象
可创建线程对象，可创建多个线程，用的较多
 `public static Tread current `
```java
package ch11_1;
class Runner1 implements Runnable{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Runner1: "+i);
        }
    }
}
public class ch11_1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        Thread t0 = new Thread(r);   
        Thread t1 = new Thread(r);   
        Thread t2 = new Thread(r);   
        Thread t3 = new Thread(r);   
        t0.start();
        t1.start();
        t2.start();
        t3.start();

        for(int i = 0; i < 100; i++){
            System.out.println("Main Thread: "+i);
        }
    }
}

```

---
- ②直接继承子Thread类
定义一个Thread的子类并重写run()
一次只能定义唯一一个
```java
package ch11_2;
class Runner2 extends Thread{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("Runner2: "+i);
        }
    }
}

public class ch11_2 {
    public static void main(String[] args) {
        Runner2 r2 = new Runner2();  //r2本身就是线程类
        r2.start();
        for(int i = 0; i < 1000; i++){
            System.out.println("Main Thread: "+i);
        }        
    }
}

```



## 线程之间的数据共享



## 多线程的同步控制
临界资源，临界区->临界代码
互斥锁 :
    1. synechronized(this){...}
    2. public synechronized void add(String name){...}


## 11.4 线程间通信

线程控制基本方法：


作业：1、2、4、5、6、7








