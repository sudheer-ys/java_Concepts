package leetcode;

public class ClockwiseMatrix {

	public static void main(String[] args) {
		int[][] matrix={
				 {5, 1, 9,11},
		         {2, 4, 8,10},
		         {13, 3, 6, 7},
		         {15,14,12,16}};
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		rotate(matrix);
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println(" ");
		}
		
		
	}
	public static void rotate(int[][] matrix){
		if(matrix.length==0||matrix.length!=matrix[0].length)
			return;
		
		int n=matrix.length;
		for(int i=0;i<n/2;i++){
			int low=i,high=n-1-i;
			
			for(int j=low;j<high;j++){
				int o=j-low;
				int top=matrix[low][j];
				
				matrix[low][j]=matrix[high-o][low];
				
				matrix[high-o][low]=matrix[high][high-o];
				
				matrix[high][high-o]=matrix[j][high];
				
				matrix[j][high]=top;
			}
		}
		return;
		
	}

}
