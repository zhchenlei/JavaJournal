package Experiment1.P78.N01;
import java.io.*;

public class GreatAverage{
	public static void main(String[] args)throws IOException{
		int  n = 0, sum = 0;
		double[] a;
		String N;
		System.out.print("Please Input n: ");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		N = buf.readLine();
		n = Integer.parseInt(N);
		a = new double[n];
		for(int i = 0; i < n; i++)
		{
			N = buf.readLine();
			a[i] = Integer.parseInt(N);
			sum += a[i];
		}
		double aver = sum / (n*1.0);
		for(double e:a)
		{
			if(e > aver)
				System.out.println(e+" ");
		}
	}
}