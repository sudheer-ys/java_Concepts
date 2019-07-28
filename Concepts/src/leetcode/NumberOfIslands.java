package leetcode;

public class NumberOfIslands {

	public static void main(String[] args) {
		char[][] grid= {{'1','1','0','0','0'},
		{'1','1','0','0','0'},
		{'0','0','1','0','0'},
		{'0','0','0','1','1'}
		};
		System.out.println(numIslands(grid));
	}
	public static int numIslands(char[][] grid){
		int count=0;
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				if(grid[i][j]=='1'){
					explore(grid,i,j);
					count++;
				}
			}
		}
		return count;
	}
	public static void explore(char[][] grid,int a,int b){
		if(a<0 || b<0 || a>=grid.length || b>=grid[0].length || grid[a][b]!='1') return;
		grid[a][b]='0';
		explore(grid,a,b-1);
		explore(grid,a,b+1);
		explore(grid,a-1,b);
		explore(grid,a+1,b);
	}
}
