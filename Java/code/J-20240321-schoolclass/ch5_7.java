//
public class ch5_7{
	public static void main(String[] args){
		String s = "nihaoHHfhdsoif29eu390rhfneWWFWEFEFefewFEWHH.dguigyu	uigbjKBJKBHBVKUvvjvFE]F\\R[G]RE[G]ESRr9";
		int Lowcount = 0, Upcount = 0, OtherCount = 0;		
		
		//mean1
		/*for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if( c >= 'a' && c <= 'z'){
				Lowcount++;
			}
			else if(c >= 'A' && c <= 'Z'){
				Upcount++;
			}
			else{
				OtherCount++;
			}
		}*/

		//mean2
		/* for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if(sL.indexOf(c)!=-1)
				Lowcount++;
			else if(uL.indexOf(c)!=-1)
					Upcount++;
			else
					OtherCount++; 
		}*/

		//mean3
		for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isLowerCase(c)==true)
				Lowcount++;
			else if(Character.isUpperCase(c)==true)
					Upcount++;
			else
					OtherCount++; 
		}

		
		


		System.out.println("Lowcount="+Lowcount+"\t"+"Upcount="+Upcount+"\tOtherCount="+OtherCount);
	}
}