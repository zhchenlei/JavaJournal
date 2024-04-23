package Experiment1.P78;

//5-3 Enter n numbers, and output Maximum and Minmium.

import java.io.*;

public class DiagonaSuml{
	public static void main(String[] arges)throws IOException{
		System.out.println("Enter the array:");
		String N;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int[][] arr = new int[3][3];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				N = buf.readLine();
				arr[i][j] = Integer.parseInt(N);
				if((i == j) || (i + j ==2)){
					sum += arr[i][j];
				}
			}
		}
		/*for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
		System.out.println(" ");
		}*/
		System.out.println("The Diagonasum is:"+sum);
	}
}