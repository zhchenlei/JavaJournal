package TestFileReader;

import java.io.*;
public class TestFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        int c =0;
        try {
            //接管道
            fr = new FileReader("D:\\01code\\gitee\\JavaJournal\\code\\J-20240423-classcode\\src\\TestFileReader\\TestFileReader.java");
            //int lens = 0;
            while((c=fr.read())!=-1){
                System.out.print((char)c);
            }
            fr.close();
        } catch (FileNotFoundException e1) {
            System.out.println("没找到File Not Found Error!!!");
            System.exit(-1);
        }catch(IOException e2){
            System.out.println("文件读取错误File Read Error !!!");
            System.exit(-1);
        }
        System.out.println("Read Successful...");
    }
}
