package leetcode;
public class MatrixDFS {
	public static void main(String[] args) {
	    int[][] adjMatrix = { {0, 0, 1, 0, 0},
	    		{0, 0, 0, 1, 0},
	    		{1, 0, 0, 0, 1},
	    		{0, 1, 0, 0, 0},
	            {0, 0, 1, 0, 0}};
	    boolean[] visited = {false, false, false, false, false};
	    int n = 5;
	    int count =0;
	    
	    for(int j=0; j<n; j++){
	    	visited[j]=true;
	    	System.out.println("Removed "+j);
	    	for(int i=0; i<n; i++){
		    	if(!visited[i]){
		    	DFS(adjMatrix, visited, n, i);
		    	System.out.println();
		    	count++;
		    	}
		    }
		    System.out.println(count);
		    count=0;
		    for(int k=0; k<n; k++)
		    {
		    	visited[k]=false;
		    }   	
	    }   
	}
	public static void DFS(int[][] adjMatrix, boolean [] visited,int n, int i){   
		System.out.print(" " + (i));
	    visited[i]= true;
	    for (int j = 0; j<n;j++){
	        if(!(visited[j]) && adjMatrix[i][j]==1){
	            DFS(adjMatrix, visited, n, j);
	        }
	    }
	  }
}
