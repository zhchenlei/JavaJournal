package Experiment1.P78.N04;

//5-4 Enter n Matrix of 4x5, and find the maximum and minimum and their position. 

import java.io.*;

public class MaxMinOfMatrix{
	public static void main(String[] arges)throws IOException{
		System.out.println("Enter the array:");
		String N;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[4][5];

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				N = buf.readLine();
				arr[i][j] = Integer.parseInt(N);
				}
		}

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length;j++){
				System.out.print(arr[i][j]+"   ");
			}
		System.out.println(" ");
		}
		int max = arr[0][0], min = arr[0][0];
		int maxx = 0, maxy = 0, minx = 0, miny = 0;

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j] > max){
					max = arr[i][j];
					maxx = i+1;
					maxy = j+1;
				}

				if(arr[i][j] < min){
					min = arr[i][j];
					minx = i+1;
					miny = j+1;
				}
			}
		}
		System.out.println("The Maximum is:\t"+max+"\tx = "+maxx+"\t y = "+maxy);
		System.out.println("The Maximum is:\t"+min+"\tx = "+minx+"\ty = "+miny);
	}
}