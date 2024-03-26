import java.util.Scanner; 
public class Count{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a string:");
		String str = sc.nextLine();
		int Charcount = 0, count = 0, Othercount = 0;
		System.out.println();
		
		for(String e:str.toCharArray()){
			if(e>= '0' && e<='9'){
				count++;
			}
			else if(Character.isUpperCase(e) || Character.isLowerCase(e)){
				Charcount++;
			}
			else{
				Othercount++;
			}
		}

		System.out.println("The Charcount is :"+Charcount);
		System.out.println("The Numbers is :"+count);
		System.out.println("The Othercount is :"+Othercount);
		sc.close(); 
	}
}