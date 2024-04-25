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
