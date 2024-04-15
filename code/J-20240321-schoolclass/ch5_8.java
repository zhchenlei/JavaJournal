public class ch5_8{
	public static void main(String[] args){
		String s = "javaqewqjavabkdjavaddjava892effjavahjava";
		String si = "java";
		int count = 0, index = -1;
		while((index = s.indexOf(si))!=-1){
				count++;
				s = s.substring(index+si.length());
		}
		System.out.println(count);
	}
}