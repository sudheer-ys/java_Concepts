package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharsByFrequency {

	public static void main(String[] args) {
		String s="cccaaa";
		
		int[] map=new int[256];
		int max=0;
		
		for(char c:s.toCharArray()){
            if(map[c]>0){
            	map[c]++;
            	max=Math.max(max, map[c]);
            }
            else{
            	map[c]=1;
            }
        }
		
		String[] buckets=new String[max+1];
		
        for(int i = 0 ; i < 256; i++) { // join chars in the same bucket
            String str = buckets[map[i]];
            if(map[i] > 0)
                buckets[map[i]] = (str == null) ? "" + (char)i : (str + (char) i);
        }
        
        
        StringBuilder ans=new StringBuilder();
        for(int i = max; i >= 0; i--) { // create string for each bucket.
            if(buckets[i] != null)
                for(char ch : buckets[i].toCharArray())
                    for(int j = 0; j < i; j++)
                        ans.append(ch);
        }
        
        System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(char c:s.toCharArray()){
			map[c]++;
			max=Math.max(max, map[c]);
		}
		
		String[] buckets=new String[max+1];
		
        for(int i = 0 ; i < 256; i++) { // join chars in the same bucket
            String str = buckets[map[i]];
            if(map[i] > 0)
                buckets[map[i]] = (str == null) ? "" + (char)i : (str + (char) i);
        }
        StringBuilder strb = new StringBuilder();
        for(int i = max; i >= 0; i--) { // create string for each bucket.
            if(buckets[i] != null)
                for(char ch : buckets[i].toCharArray())
                    for(int j = 0; j < i; j++)
                        strb.append(ch);
        }
        System.out.println(strb.toString());*/ 
		
	}

}
