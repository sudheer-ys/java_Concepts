package leetcode;

public class LongestSubstringLength {

	public static void main(String[] args) {
		String s="pwwkew";
		System.out.println(lengthOfLongestSubstring(s));

	}
	public static int lengthOfLongestSubstring(String s) {
        int ans=0;
        int i=0;
        int[] tab=new int[128];
        for(int j=0; j<s.length();j++){
            i=Math.max(tab[s.charAt(j)],i);
            ans=Math.max(ans,j-i+1);
            tab[s.charAt(j)]=j+1;
        }
        return ans;
    }
}
