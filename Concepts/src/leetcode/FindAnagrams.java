package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cbaebabacd",p="abc";
		List<Integer> li=new ArrayList<Integer>();
		li=findAnagrams(s,p);
		System.out.println(li);
	}
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
	    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
	    int[] arr = new int[256];
	    for (char c : p.toCharArray()) {
	        arr[c]++;
	    }
	    int left = 0, right = 0, count = p.length();
	    while (right < s.length()) {
	        if (arr[s.charAt(right++)]-- >= 1) count--;   
	        if (count == 0) list.add(left);
	        if (right - left == p.length() && arr[s.charAt(left++)]++ >= 0) count++;
	    }
	    return list;
    }
}
