
class Matrix_Ca{
	public int[] matrixColSum(int[][] a){
		int[] sum = {0,0,0,0};
		for(int i = 0; i<a[0].length;i++){
			for(int j = 0; j < a.length;j++){
				sum[i] += a[j][i];
			}
		}
		return sum;
	}
	public int[] matrixRowSum(int[][] a){
		int[] sum = {0,0,0,0};
		for(int i = 0; i<a.length;i++){
			for(int j = 0; j < a[i].length;j++){
				sum[i] += a[i][j];
			}
		}
		return sum;
	}
}

public class ch6_4{
	public static void main(String[] args) {
		Matrix_Ca x = new Matrix_Ca();
		int[][] a = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.print("Sum of COL: ");
		for(int i : x.matrixColSum(a)){
			System.out.print(i+"\t");
		}
			System.out.println();
		System.out.print("Sum of Row: ");
		for(int i : x.matrixRowSum(a)){
			System.out.print(i+"\t");
		}
	}
}