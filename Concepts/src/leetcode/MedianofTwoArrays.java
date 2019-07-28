package leetcode;

public class MedianofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1={1,3,6,9};
		int[] num2={2,4,5,7,8,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(Median(num1,num2));
	}
	public static double Median(int[] num1,int[] num2){
		int l1=num1.length;
		int l2=num2.length;
		int l3=(l1+l2)/2;
		
		int x=0,y=0,p=num1[0],q=num2[0];
		for(int i=0;i<l3;i++){
			y=x;
			if(num1[p]<num2[q]){
				x=num1[p];
				p++;
			}
			else{
				x=num2[q];
				q++;
			}
		}
		System.out.println(x+" "+y);
		return 1.5;
	}
}
