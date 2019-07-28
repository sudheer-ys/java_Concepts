package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		List<Integer> mylist=getRow(n);
		
		for (Integer nn : mylist) {
			System.out.print(" "+nn);
		}
		
	}
	
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> mylist=new ArrayList<Integer>();

		for(int i=0; i<rowIndex+1;i++){
			mylist.add(1);
			for(int j=i-1;j>0;j--){
				mylist.set(j, mylist.get(j-1)+mylist.get(j));
			}
		}
		
		return mylist;
	}
	

}
