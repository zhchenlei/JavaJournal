package Experiment1.P61_62.P61_08;
import java.io.*;

public class NumberSum{
	public static void main(String[] args)throws IOException{
		System.out.print("Enter a number:");
		int  n = 0, sum = 0;
		String N;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		N = buf.readLine();
		n = Integer.parseInt(N);
		int tmp = n;
		while(tmp > 0)
		{
			sum += tmp % 10;
			tmp /= 10;
		}
		System.out.print("The sum is : "+sum);
	}
}
