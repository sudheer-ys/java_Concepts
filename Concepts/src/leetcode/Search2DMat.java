package leetcode;

public class Search2DMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { {1,   4,  7, 11, 15},
	    		{2,   5,  8, 12, 19},
	    		{3,   6,  9, 16, 22},
	    		{10, 13, 14, 17, 24},
	            {18, 21, 23, 26, 30}};

			System.out.println(searchMatrix(mat,5));
	}
	public static boolean searchMatrix(int[][] matrix, int target){
	    int m=matrix.length, n=matrix[0].length, i=0, j=n-1;
	    while (i<m && j>=0) {
	        if (matrix[i][j]==target) return true;
	        else if (matrix[i][j]<target) i++;
	        else j--;
	    }
	    return false;
	}

}
