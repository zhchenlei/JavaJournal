package Experiment1.P61_62.P61_10;
import java.io.*;

public class HalfRope{
	public static void main(String[] args)throws IOException{
		int  L= 3000, days = 0;
		while(days < 5 )
		{
			L /= 2;
			++days;	
		System.out.print(L+"\t");

		}
		System.out.println();
		System.out.print("Need days is "+days);
	}
}
