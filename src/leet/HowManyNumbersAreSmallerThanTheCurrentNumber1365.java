package leet;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {

	public static void main(String[] args) {
		int [] nums = {8,8,8,8,8};
		HowManyNumbersAreSmallerThanTheCurrentNumber1365 howMany= 
				new HowManyNumbersAreSmallerThanTheCurrentNumber1365();
		
		
		int[] tempb= howMany.smallerNumbersThanCurrent(nums);
		for(int s: tempb) {
			System.out.println(s);
		}

	}
	
	  public int[] smallerNumbersThanCurrent(int[] nums) {
		  
		  int[] result= new int[nums.length];
		  int temp=0;
		  
		  for(int i=0;i<nums.length;i++) {
			  temp=0;
			  for(int j=0;j<nums.length;j++) {
				  if (j==i) continue;
				  if(nums[j]<nums[i]) {
					  temp++;
				  }
				  
			  }
			  result[i]=temp;
			  
		  }
	        return result;
	    }

}
