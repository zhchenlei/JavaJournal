package TestFileWriter;
import java.io.*;
public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\01code\\gitee\\JavaJournal\\code\\J-20240423-classcode\\src\\TestFileWriter\\Unicode.dat");
            for(int c = 0; c<=65535; c++){
                fw.write(c);   
            }
            fw.close();
        } catch (IOException e) {
           e.printStackTrace(); 
           System.out.println("File Write Error!!!");
            System.exit(-1);
        }
    }
}
