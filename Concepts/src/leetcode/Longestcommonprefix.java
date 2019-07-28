package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Trie{
	Map<Character, Trie> l = new HashMap<Character,Trie>();
	int count;
	
	void add(String s){
		count++;
		if(!s.isEmpty()){
			char f=s.charAt(0);
			if(!l.containsKey(f)){
				l.put(f, new Trie());
			}
			l.get(f).add(s.substring(1));
		}
	}
	
	int count(String s){
		if(s.isEmpty())
			return count;
		char f=s.charAt(0);
		return l.containsKey(f) ? l.get(f).count(s.substring(1)) : 0;
	}
	
}

public class Longestcommonprefix {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		Trie trie=new Trie();

		
	}

}
