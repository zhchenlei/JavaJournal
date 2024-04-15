//Enter n numbers, and output Maximum and Minmium.

import java.io.*;

public class MaxMinNum{
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
		double max = arr[0], min = arr[0];
		for(double e : arr){
			if(e > max){
				max = e;
			}
		}
		for(double e : arr){
			if(e < min){
				min = e;
			}
		}
	System.out.println("The Maximum is"+max+"and the Minimum is"+min);
	}
}