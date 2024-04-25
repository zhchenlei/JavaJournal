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
