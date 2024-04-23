package Experiment3.N2;
import java.util.Timer;
import java.util.TimerTask;
public class Test {
    public static void main(String[] args) {
        // 创建一个 Timer 实例
        Timer timer = new Timer();
        // 创建一个 TimerTask，每隔1秒执行一次
        TimerTask task1 = new TimerTask() {
            public void run() {
                System.out.println("每隔1秒执行一次的任务");
            }
        };
        // 创建另一个 TimerTask，每隔3秒执行一次
        TimerTask task2 = new TimerTask() {
            public void run() {
                System.out.println("每隔3秒执行一次的任务");
            }
        };
        // 安排 task1 每隔1秒执行一次
        timer.schedule(task1, 0, 1000);
        // 安排 task2 每隔3秒执行一次
        timer.schedule(task2, 0, 3000);
    }
}
