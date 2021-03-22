package leet;

import java.util.Arrays;

public class ThirdBiggestNumber {

	public static void main(String[] args) {
		int[] nums1= {1,2,2,3,3,4,4,4,4,4};
		
		ThirdBiggestNumber sortnumsay= new ThirdBiggestNumber();
		
		System.out.println(sortnumsay.sort(nums1));
		}

	
	public int sort(int[] nums) {
		Arrays.sort(nums);
		int pointer=nums.length-1;
		int sub=0;
		int i=nums.length-1;
		int answer = 0;
		if(nums.length>2) {
			while(i>1) {
				if(nums[i] != nums[i-1]) {
					pointer--;
				}
				i--;
				sub =pointer-i;
			}
			answer=nums.length-(sub+3);
			
		}else if(nums[0]>nums[1]) {
			
			answer=0;
			
		}else {
			
			answer=1;
		}

		return nums[answer];
	}

}
