package leet;

import java.util.Arrays;

public class ThirdMaxValue {

	public static void main(String[] args) {
		int[] num= {1,2,2,11};
		
		ThirdMaxValue maxObj= new ThirdMaxValue();
//		System.out.println(maxObj.max(num));
		
		System.out.println(maxObj.maximum(num));
		

	}
	
	public int maximum(int[] number) {
		int max=0;
		for(int i =0; i<number.length;i++) {
			if(number[i]>number[0]) {
				max=number[i];
				
			}
			
		}
		return max;
	}
	
	public int max(int[] num) {
		
		Arrays.sort(num);
		
		int pointer=0;
		for(int i=0; i<num.length-1;i++) {
			if(num[i] != num[i+1]) {
				pointer++;
			}
			
		}
		
		//find first biggest element
		int first = Integer.MIN_VALUE;
		for(int i=0; i<num.length;i++) {
			if(num[i]>first) {
				first=num[i];
			}
		}
		
		int second = Integer.MIN_VALUE;
		for(int i=0; i<num.length;i++) {
			if(num[i]<first && num[i]>second ) {
				second=num[i];
			}
		}
		
		int third = Integer.MIN_VALUE;
		for(int i=0; i<num.length;i++) {
			if(num[i]<second && num[i]>third ) {
				third=num[i];
			}
		}
		
	if(pointer>1)
		return third;
	else
		return first;
	}

}
