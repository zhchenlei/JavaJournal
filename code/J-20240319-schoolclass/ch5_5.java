public class ch5_5{
	public static void main(String[] args){
		int[][] a = {{67,5,89,34,22},{1,90,105,888,7},{89,-6,45,20,7},{88,3,-9,66,-888}};
		print(a);
		int max,min;
		int h_max = 0,l_max = 0, h_min = 0,l_min = 0;
		max = min = a[0][0];
		for(int i = 0; i < a.length;i++){
			for(int j = 0; j < a[i].length;j++){
				if(max < a[i][j]){
					max = a[i][j];
					h_max = i;
					l_max = j;
				}
				if(min > a[i][j]){
					max = a[i][j];
					h_min = i;
					l_min = j;
				}
			}
		}
		System.out.println();
		System.out.println("max = "+max+"\trow:"+h_max+"\tcol:"+l_max);
		System.out.println("max = "+min+"\trow:"+h_min+"\tcol:"+l_min);
	}


	private static void print(int[][] a){
		/*for(int[] row:a){
			for(int col:row){
				System.out.print(col+" \t");
			}
			System.out.println();
		}*/
		for(int i = 0; i < a.length;i++){
			for (int j = 0; j<a[i].length;j++){
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}
	}
}