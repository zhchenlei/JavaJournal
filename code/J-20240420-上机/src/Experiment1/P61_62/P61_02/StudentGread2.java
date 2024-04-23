package Experiment1.P61_62.P61_02;

import java.io.*;

public class StudentGread2 {
    public static void main(String[] args)throws IOException{
        while(true)
        {
            int sc;
            String ssc;
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your score:");
            ssc = buf.readLine();
            sc = Integer.parseInt(ssc);
            int flag = 0;
            if(sc <= 100 && sc >=85) flag = 1;
            else if(sc <= 84 && sc >=70) flag = 2; 
            else if(sc <= 69 && sc >=60) flag = 3; 
            else if(sc <= 59 && sc >=0) flag = 4; 
            switch (flag) {
                case 1:
                    System.out.println("A");
                    break;  
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;           
                 default:
                    System.out.println("Fail to enter, please re-enter");
                    break;
            }
        }
        }
}
