package test;

class MyException extends Exception{
    private int id;
    public MyException(String message, int id){
        super(message);
        this.id = id;
    }
    public int getId(){
        return id;
    }
}

public class TestException {
    public void regist(int num)throws MyException{  //声明必须捕获
        if(num < 0){
            throw new MyException("The number below Zero, illegal***", 3);
        }
        System.out.println("The Legal Number is "+num);
    }
    //触发该异常
    public void manage(){
        try{
            regist(-100);
        }catch(MyException e){
            System.out.println("The Failure, The error type  "+e.getId());
            e.printStackTrace();    //打印出错路径
        }
        System.out.println("The End of Operator");
    }
    public static void main(String[] args){
        TestException t = new TestException();
        t.manage();
    }
}
