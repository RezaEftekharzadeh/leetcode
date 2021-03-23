package leet;

public class SortArrayByParity905 {

	public static void main(String[] args) {
		int [] nums = {3,1,2,4};
		
		SortArrayByParity905 test= new SortArrayByParity905();
		nums= test.sortArrayByParity(nums);
		for(int s: nums)
			System.out.println(s);
		

	}
	  public int[] sortArrayByParity(int[] A) {
		  
		  int[] temp= new int[A.length];
		  int end=A.length-1;
		  int first=0;
		  
		  for(int i=0; i<A.length;i++) {
			  if(A[i]%2==0) {
				 temp[first]=A[i]; 
				 first++;
			  }else {
				  temp[end]=A[i];
				  end--;
			  }
		  }
		  
		  return temp;
	        
	    }
}
