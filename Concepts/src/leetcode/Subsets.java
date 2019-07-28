package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums={2,1,3};
		System.out.println(subsets(nums));
	}
	public static List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        
        //Arrays.sort(S);
        for(int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
    }
}
