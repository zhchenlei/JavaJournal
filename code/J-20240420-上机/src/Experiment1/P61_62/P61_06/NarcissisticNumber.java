package Experiment1.P61_62.P61_06;

import java.io.*;

public class NarcissisticNumber{
	public static void main(String[] args)throws IOException{
		System.out.print("Enter a number :");
		int  n = 0;
		String N;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		N = buf.readLine();
		n = Integer.parseInt(N);
		System.out.println("Narcissistic Number:");
		for(int i = 99; i <= n; i++)
		{
			int sum = 0, tmp = i;
			while(tmp>0){
				sum += Math.pow((tmp%10),3);
				tmp /= 10;
			}
			if(i==sum) System.out.println(i+"\tis NarcissisticNumber");
		}
	}
}
