import java.io.*;

public class BubbleSort{
	public static void main(String[] args){
		int[] arr = new int[8];
		for(int i = 0; i < 	8; i++){
			arr[i] = (int) (Math.random() * 100 + 1);;
		}
		for(int e : arr){
			System.out.print(e+" ");
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++)
		{
			int flag = 0;
			for(int j = 1; j < arr.length - i; j++)
			{
				if(arr[j] < arr[j - 1]){
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
					flag = 1;
				}
			}
			if(flag == 0) break;
		}
		for(int e : arr){
			System.out.print(e+" ");
		}
	}
}