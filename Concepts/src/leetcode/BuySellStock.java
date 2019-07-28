package leetcode;

public class BuySellStock {

	public static void main(String[] args) {
		
		int[] arr= {7,1,5,3,6,4};
		
		int profit=0,low=Integer.MAX_VALUE;
		for(int i=0; i<arr.length;i++){
			//System.out.println(arr[i]);
			if(low > arr[i])
				low=arr[i];
			else if(arr[i]-low > profit){
				profit=arr[i]-low;
			}
		}
		System.out.println(profit);
	}

}
