package TestFinal;
public class TestFinal{
    public static void main(String[] args){
        T t = new T();
        t.i = 9;
        System.out.println(" Main Class m : mian ");
    }
}

// final class T{   //不允许有子类派生
class T{
    // final int i = 8; //局部变量
    int i = 8; //局部变量

   // final void m(){   //不可被覆盖
    void m(){
        System.out.println("Super Class m : TT ");
    }
}

class TT extends T{
    void m(){
        System.out.println("Sub Class m :TT ");
    }
    
    }