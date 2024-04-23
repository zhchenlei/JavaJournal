package Experiment1.P61_62.P61_01;


//Input a sorce form keyboard, and divide to five stage of Excelend,Good,Pass,Medium,Fail with Switch grammer;

import java.io.*;

public class StudentGrade{
	public static void main(String[] args)throws IOException{
		while(true)
		{
			int sc;
			String Sc;
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your score:");
			Sc = buf.readLine();
			sc = Integer.parseInt(Sc);
			switch(sc){
				case 10:	
				case 9:
					System.out.println("Excellent");
					break;
				case 8:
					System.out.println("Good");
					break;
				case 7:
					System.out.println("Medium");
					break;	
				case 6:
					System.out.println("Pass");
					break;	
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
				case 0:
					System.out.println("Fail");
					break;
				default:
					System.out.println("Fail to enter, please re-enter");
					break;	
			}
		}
	}
}