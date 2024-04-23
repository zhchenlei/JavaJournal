package TestFileOutputStream;


import java.io.FileInputStream;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        FileInputStream in =null;
        int b = 0;
        try {
            in = new FileInputStream("D:\\01code\\gitee\\JavaJournal\\code\\J-20240423-classcode\\src\\TestFileInputStream\\TestFileInputStream.txt");
        } catch (FileNotFoundException e){
            System.out.println("File Not Exist....");
            System.exit(-1);    //-1 系统退出
        }
        try {
            long num = 0; //统计字节数
            while((b = in.read())!=-1) //文件以-1结束
            {
                System.out.print((char)b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("The total number is "+num);
        } catch (IOException e) {
            System.out.println("File Read Error!!!");
            System.exit(-1);
        }
    }
}
