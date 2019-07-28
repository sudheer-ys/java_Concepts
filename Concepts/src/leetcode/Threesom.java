package leetcode;
/*		
List<Integer> l1=new ArrayList<Integer>();
l1.add(5);
l1.add(6);
mylist.add(l1);
List<Integer> l2=new ArrayList<Integer>();
l1.add(55);
l1.add(66);
mylist.add(l2);

for(int j=i+1;j<len-1;j++){
	int count=nums[i]+nums[j];
	count*=-1;
	int k=j+1;
	while(k<len){
		if(nums[k]==count){
			List<Integer> l1=new ArrayList<Integer>();
			l1.add(nums[i]);
			l1.add(nums[j]);
			l1.add(nums[k]);
			mylist.add(l1);
			break;
		}
		k++;
	}
	
}
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Threesom {

	public static void main(String[] args) {
		
		int[] nums={0,0,0,0};
		List<List<Integer>> mylist=new ArrayList<List<Integer>>();
		mylist=threeSum(nums);
		
		for(List i:mylist){
			for(int j=0;j<i.size();j++){
				System.out.print(" "+i.get(j));
			}
			System.out.println(" ");
		}
	}
	public static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> mylist=new ArrayList<List<Integer>>();
		int len=nums.length;
		Arrays.sort(nums);
		for(int i=0;i<len-1;i++){
			if (i>0 && nums[i] == nums[i-1]) {             
	            continue;
	        }
			int target= (-1)*nums[i];
			Map<Integer, Integer> iMap = new HashMap<>();
	        for(int j=i+1; j<len ;j++){
	            int half=target-nums[j];
	            if(iMap.containsKey(half)){
	                int k=iMap.get(half);
	                List<Integer> l1=new ArrayList<Integer>();
	    			l1.add(nums[i]);
	    			l1.add(nums[j]);
	    			l1.add(nums[k]);
	    			mylist.add(l1);
	            }
	            iMap.put(nums[j],j);
	        }
		}
		
		return mylist;
	}
}
