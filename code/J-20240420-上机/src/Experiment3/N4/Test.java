package Experiment3.N4;
import java.util.Random;
// 实现了Runnable接口的MulThread类
class MulThread implements Runnable {
    private String threadName;
    // 构造方法，传入线程名称
    public MulThread(String threadName) {
        this.threadName = threadName;
    }
    // 实现Runnable接口的run方法
    public void run() {
        // 在命令行显示该线程信息
        System.out.println("线程 " + threadName + " 正在运行");

        // 随机休眠小于1秒的时间
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 显示线程结束信息
        System.out.println("线程 " + threadName + " 结束");
    }
}
public class Test {
    public static void main(String[] args) {
        // 创建MulThread类的三个线程对象
        MulThread t1 = new MulThread("Thread-1");
        MulThread t2 = new MulThread("Thread-2");
        MulThread t3 = new MulThread("Thread-3");

        // 启动这三个线程
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}
