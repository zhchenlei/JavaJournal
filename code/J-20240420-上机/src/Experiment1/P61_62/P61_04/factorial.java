package Experiment1.P61_62.P61_04;
import java.io.*;
public class factorial {
    public static void main(String[] args)throws IOException{
        while(true){
            System.out.print("Enter a number:");
            int  n = 0, sum = 0;
            String N;
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            N = buf.readLine();
            n = Integer.parseInt(N);
            int tmp = 1;
            for(int i = 1; i <= n; i++)
            {
                tmp *= i;
                sum += tmp;
            }
            System.out.println("The sum is : "+sum);
        }
	}
}
