public class ch5_6{
	public static void main(String[] args){
		String[] s = {"Mircosoft","IBM","Sun","Oracle","Apple"};

		String[] sBak = new String[s.length];
		System.arraycopy(s,0,sBak,0,s.length);
		for(int i = 0; i<sBak.length;i++){
			System.out.print(sBak[i]+"\t");
		}


System.out.println();
		
		int[][] intArray={{1,2},{1,2,3},{3,4}};
		int[][] intArrayBak = new int[3][];

		System.arraycopy(intArray,0,intArrayBak,0,intArray.length);
		for(int[] e:intArrayBak){
			for(int ee:e){
				System.out.print(ee+"\t");
			}
			System.out.println();
		}
 	}



}