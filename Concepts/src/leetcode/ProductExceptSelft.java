package leetcode;

public class ProductExceptSelft {

	public static void main(String[] args) {
		int[] nums={1,0};
		int[] ans=productExceptSelf(nums);
		for(int i=0;i<nums.length;i++)
			System.out.print(" "+ans[i]);
	}
	public static int[] productExceptSelf(int[] nums){
		int[] ans=new int[nums.length];
		
		int total=1;
		for(int i=0;i<nums.length;i++){
			ans[i]=total;
			total=total*nums[i];
		}
		
		total=nums[nums.length-1];
		for(int j=nums.length-2;j>=0;j--){
			ans[j]=ans[j]*total;
			total=total*nums[j];
		}
		return ans;
	}
}
