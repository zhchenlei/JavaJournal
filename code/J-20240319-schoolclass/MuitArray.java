
public class MuitArray{
	public  static void main(String[] args){
		//int[][] a = {{1,2,3},{4,5}};
		int[][] a;
		a = new int[3][];
		a[0] = new int[3];
		a[1] = new int[4];
		a[2] = new int[5];

		for(int i = 0; i<a.length;i++){
			for(int j = 0; j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	} 
}