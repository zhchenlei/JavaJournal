import java.util.Scanner; 
public class SubStr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string:");
		String str = sc.nextLine();
		System.out.println();
		System.out.print("Enter pos:");
		int pos = sc.nextInt();
		System.out.print("Enter numbers:");
		int num = sc.nextInt();
		sc.close(); 
		String ret = str.substring(pos,num);
		System.out.print("The SubString is:"+ret);
		System.out.println();
	}
}