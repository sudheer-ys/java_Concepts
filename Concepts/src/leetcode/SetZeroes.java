package leetcode;

public class SetZeroes {

	public static void main(String[] args) {
		int[][] mat = { {0, 2, 2, 3, 4},
	    		{9, 0, 9, 7, 5},
	    		{1, 0, 0, 5, 1},
	    		{8, 1, 7, 6, 3},
	            {3, 0, 1, 5, 4}};
		setZeroes(mat);
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]);
			}
			System.out.println("");
		}
	}
	public static void setZeroes(int[][] mat){
		boolean isRow=false,isCol=false;
		//check first row
		for(int i=0;i<mat[0].length;i++){
			if(mat[0][i]==0){
				isRow=true;
				break;
			}
		}
		//check first column
		for(int j=0;j<mat.length;j++){
			if(mat[j][0]==0){
				isCol=true;
				break;
			}
		}
		for(int i=1;i<mat.length;i++){
			for(int j=1;j<mat[0].length;j++){
				if(mat[i][j] == 0){
					mat[i][0]=0;
					mat[0][j]=0;
				}
			}
		}
		
		
		//Rows nullify
		for(int i=1;i<mat.length;i++){
			if(mat[i][0]==0){
				for(int j=0;j<mat[0].length;j++)
					mat[i][j]=0;
			}
		}
		//Columns nullify
		for(int i=1;i<mat[0].length;i++){
			if(mat[0][i]==0){
				for(int j=0;j<mat.length;j++)
					mat[j][i]=0;
			}
		}
		//First row
		if(isRow){
			for(int i=0;i<mat[0].length;i++)
				mat[0][i]=0;
		}
		//First col
		if(isCol){
			for(int j=0;j<mat.length;j++)
				mat[j][0]=0;
		}
	}
}
