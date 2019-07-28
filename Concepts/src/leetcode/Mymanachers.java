package leetcode;
import java.lang.Math;
public class Mymanachers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ajfjaurhfhruafha";
		int start=0,end=0;
		for(int i=0;i<s.length();i++){
			int len1=MaxLen(s,i,i);
			int len2=MaxLen(s,i,i+1);
			int len=Math.max(len1, len2);
			if(len>(end-start)){
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		System.out.println(s.substring(start, end+1));
		
	}
	public static int MaxLen(String s,int i,int c){
		
		int st=i,e=c;
		while(st>=0 && e<s.length() && s.charAt(st)==s.charAt(e)){
			st--;
			e++;
		}
		
		return e-st-1;
	}
}
