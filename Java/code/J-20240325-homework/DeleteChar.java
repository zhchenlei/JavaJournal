import java.util.Scanner; 
public class DeleteChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string:");
		String str = sc.nextLine();
		
		System.out.println();
		System.out.print("Enter a character:");
		String ch = sc.nextLine();
		StringBuilder ret = new StringBuilder();
		String[] s = str.split(ch);
		for(int i = 0; i< s.length;i++){
			ret.append(s[i]);
		}
		System.out.print("The result is :"+ret);
		sc.close(); 
	}
}