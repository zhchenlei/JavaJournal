import java.util.Scanner; 
public class Exit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		String s = "exit";
		while(true){
			System.out.print("Enter a string:");
			String str = sc.nextLine();
			if(str.equals(s)) break;
			System.out.println(str);
		}
		sc.close();
	}
}