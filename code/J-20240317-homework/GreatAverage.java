//5-1Enter n numbers, and output numbers greater than the average.

import java.io.*;

public class GreatAverage{
	public static void main(String[] arges)throws IOException{
		System.out.println("Enter the totale number:");
		String N;
		int n = 0;
		double average = 0, sum = 0;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		N = buf.readLine();
		n = Integer.parseInt(N);

		double[] arr = new double[n];
		for(int i = 0; i < n; i++){
			N = buf.readLine();
			arr[i] = Double.parseDouble(N);
			sum += arr[i];
		}
		average = sum / n;
		for(double e : arr){
			if(e > average){
				System.out.print(e+" ");
			}
		}
	}
}