package Experiment1.P61_62.P61_05;
import java.io.*;
public class Official{
	public static void main(String[] args)throws IOException{
		while(true){
			System.out.print("Enter a number:");
			double sum = 0,fac = 1.0;;
			int  n = 0;
	
			String N;
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			N = buf.readLine();
			n = Integer.parseInt(N);
	
			for(int i = 1; i <= n; i++)
			{
				fac *= i;
				sum += (i%2 == 0) ?  -1.0/fac : 1.0/fac;
			}
			System.out.println("The sum is:"+sum);
		}
	}
}
