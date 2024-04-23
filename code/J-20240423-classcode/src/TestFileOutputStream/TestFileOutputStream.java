package TestFileOutputStream;

import java.io.*;
public class TestFileOutputStream{
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            //建立管道
            in = new FileInputStream("D:/01code/gitee/JavaJournal/code/J-20240423-classcode/src/TestFileOutputStream/HelloWorld.java");
            out = new FileOutputStream("D:/01code/gitee/JavaJournal/code/J-20240423-classcode/src/TestFileOutputStream/HelloWorldCopy.java");
            while((b=in.read())!=-1){
                out.write(b);
            }
            //关闭管道
            in.close();
            out.close();
        } catch (FileNotFoundException e1) {
            System.out.println("FileNotFoundException!!!");
            System.exit(-1);
        }catch(IOException e2){
            System.out.println("File Copy Error!!!");
            System.exit(-1);
        }
        System.out.println("File Copy Successful....");
    }
}