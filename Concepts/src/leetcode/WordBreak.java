package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		String s="leetcode";
		List<String> wordDict=new ArrayList<String>();
		wordDict.add("leet");
		wordDict.add("code");
		System.out.println(wordBreak(s,wordDict));
	}
	public static boolean wordBreak(String s, List<String> wordDict){
		Set<String> set=new HashSet<String>(wordDict);
		boolean[] bo=new boolean[s.length()+1];
		bo[0]=true;
		
		for(int i=1;i<=s.length();i++){
			for(int j=0;j<i;j++){
				if(set.contains(s.substring(j, i)) && bo[j]){
					bo[i]=true;
					break;
				}
			}
		}
		
		return bo[s.length()];
	}
}
