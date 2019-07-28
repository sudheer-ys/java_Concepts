package leetcode;

public class ValidAnagram {

	public static void main(String[] args) {
		
		String str="1";
        int start=0,sign=1,ans=0;
        while(str.charAt(start)==' ')
            start++;
        if(str.charAt(start)=='+'){
            sign=1;
            start++;
        }
        else if(str.charAt(start)=='-'){
            sign=-1;
            start++;
        }
        while(start<str.length()){
        	int digit=str.charAt(start)-'0';
        	if(digit<0 ||digit>9)
        		break;
        	if(Integer.MAX_VALUE/10 < digit || Integer.MAX_VALUE/10 == digit && Integer.MAX_VALUE %10 < digit)
                ans= sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            ans = ans*10+digit;
            start++;
        }
        ans=ans*sign;
        System.out.println(ans);
	}

}
