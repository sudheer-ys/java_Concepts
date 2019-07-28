package leetcode;

public class firstUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kqarthik";
		char c='z';
		int[] a=new int[256];
		for(int i=0;i<s.length();i++)
			a[s.charAt(i)-'a']++;

		for(int i=0;i<s.length();i++)
			if(a[s.charAt(i)-'a']==1){
				c=s.charAt(i);
				break;
			}
				
		System.out.println(c);
	}

}