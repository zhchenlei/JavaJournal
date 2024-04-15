
public class YangHuiTriangle{
	public static void main(String[] args){
		int n = 10;
		int[][] Tri = new int[n][];

		for(int i = 0; i<n; ++i){
			Tri[i] =new int[i+1];
			for(int j = 0; j <= i; j++){
				if(j==0 || j==i){
					Tri[i][j] = 1;
				}
				else{
				 Tri[i][j] = Tri[i-1][j] + Tri[i-1][j-1];
				}
				
			}
		}
		for(int i = 0; i < Tri.length;++i){
			for(int j = 0;j<Tri[i].length;++j){
				System.out.print(Tri[i][j]+"\t");
			}
				System.out.println();
		}
	}
}