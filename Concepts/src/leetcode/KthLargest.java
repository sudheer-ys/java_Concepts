package leetcode;

public class KthLargest {

	public static void main(String[] args) {
		
		int[] nums={5,23,0,98,6,3,2,15,65,4,4,32419,45,5468,542};
		System.out.println(findKthLargest(nums,4));
		
		for(int i=0;i<nums.length;i++){
			//System.out.println(nums[i]);
		}

	}
	public static int findKthLargest(int[] nums, int k) {
		if(nums==null || nums.length==0 || k>nums.length) return Integer.MAX_VALUE;
		return findKthLargest(nums,0,nums.length-1,nums.length-k);
    }
	public static int findKthLargest(int[] nums,int start,int end, int k){
		if(start>end) return Integer.MAX_VALUE;
		
		int pivot=nums[end];
		int low=start;
		for(int i=start;i<end;i++){
			if(nums[i]<=pivot)
				swap(nums,low++,i);
		}
		swap(nums,low,end);
		if(low==k){
			return nums[low];
		}else if(low<k){
			return findKthLargest(nums,low+1,end,k);
		}else{
			return findKthLargest(nums,start,low-1,k);
		}
	}
	public static void swap(int[] nums,int i,int j){
		int tmp=nums[i];
		nums[i]=nums[j];
		nums[j]=tmp;
	}
}
