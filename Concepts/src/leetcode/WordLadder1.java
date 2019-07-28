package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder1 {

	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = new ArrayList<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		
		System.out.println(ladderLength(beginWord,endWord,wordList));

	}
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> visited=new HashSet<String>();
        HashMap<String,ArrayList<String>> wcw=createWildcardToWords(wordList);
        visited.add(beginWord);
        int ans=1;
        
        while(!visited.contains(endWord)){
            Set<String> toAdd=new HashSet<String>();
            for(String w:visited){
                ArrayList<String> linkedonly=getLinkedWords(w,wcw);
                for(String link:linkedonly){
                	if(link.equals(endWord)){
                        return ans+1;
                    }
                	else{
                		toAdd.add(link);
                		wordList.remove(link);
                		wcw=createWildcardToWords(wordList);
                	}
                }
                
            }
            ans++;
            if(toAdd.size()==0) return 0;
            visited=toAdd;
        }
        
        return ans;
    }
	
	public static HashMap<String,ArrayList<String>> createWildcardToWords(List<String> words){
		HashMap<String,ArrayList<String>> ans = new HashMap<String,ArrayList<String>>();
		
		for(String word:words){
			ArrayList<String> linked=getWildcardRoots(word);
			for(String link:linked){
				if(!ans.containsKey(link)){
					ans.put(link, new ArrayList<String>());
				}
				ans.get(link).add(word);
			}
		}
		
		return ans;
	}
	
	public static ArrayList<String> getWildcardRoots(String w){
		ArrayList<String> words = new ArrayList<String>();
		for(int i=0;i<w.length();i++){
			String word=w.substring(0, i)+"_"+w.substring(i+1);
			words.add(word);
		}
		return words;
	}
	
	public static ArrayList<String> getLinkedWords(String w, HashMap<String,ArrayList<String>> wic){
		ArrayList<String> lwords = new ArrayList<String>();
		ArrayList<String> wcw = getWildcardRoots(w);
		
		for(String s:wcw){
			ArrayList<String> localwords = wic.get(s);
			if(localwords!=null){
				for(String linked:localwords){
					if(!linked.equals(w)){
						lwords.add(linked);
					}
				}
			}
		}
		return lwords;
	}
}
