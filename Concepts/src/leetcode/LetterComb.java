package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterComb {
	private static String[] keys={"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public static void main(String[] args) {
		
		String input="23";
		List<String> an=new LinkedList<String>();
		an=letterCombinations(input);
		System.out.println(an);
	}
	public static List<String> letterCombinations(String digits){
		
		List<String> ans=new LinkedList<String>();
		comb("",digits,0,ans);
		return ans;
		
	}
	public static void comb(String p, String digits, int o, List<String> res){

		if(o>=digits.length()){
			res.add(p);
			return;
		}
		String l = keys[(digits.charAt(o) - '0')];
		for(int i=0;i<l.length();i++){
			comb(p+l.charAt(i),digits,o+1,res);
		}
		
	}
}
