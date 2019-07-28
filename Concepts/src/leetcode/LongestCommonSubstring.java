package leetcode;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghija";
		int n = s.length(), ans = 0;
        int[] tab = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(tab[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            tab[s.charAt(j)] = j + 1;
        }
        System.out.println(ans);
        for(int i=60;i<tab.length;i++)
        	System.out.print(" "+tab[i]);
	}

}
