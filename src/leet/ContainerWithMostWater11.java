package leet;

import java.util.Arrays;

public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
		ContainerWithMostWater11 test= new ContainerWithMostWater11();
		System.out.println(test.maxArea3(height));
		
		

	}
	
	  public int maxArea(int[] height) {
		  
		   int result=0;
		   int next=0;
		  
		 for(int i=0; i<height.length; i++) {

			 for(int j=i+1; j<height.length;j++) {
				 
//				int distance= j-i;
				
				 if(height[i]>height[j]) {
					 next = height[j]* (j-i);
				 }else {
					 next = height[i]*(j-i);
				 }
				 
				 if(result>next) {
					 continue;

				 }else {
					 result=next;
				 }
			 	}

		 }
	       return result; 
	    }
	  
	  public int maxArea2(int[] height) {
		  int result=0;
		   int next=0;
		  
		 for(int i=0; i<height.length; i++) {
			 for(int j=i+1; j<height.length;j++) {
				 
//				int distance= j-i;
				
				 if(height[i]>height[j]) {
					 next = height[j]* (j-i);
				 }else {
					 next = height[i]*(j-i);
				 }
				 
				 if(result>next) {
					 continue;

				 }else {
					 result=next;
				 }
				 
			 }
			 
			 
			
		 }
	       return result; 
		  
	  }
	  
	  public int maxArea3(int[] height) {
		  int max=0 , f=0, l=height.length-1;
		  
		  while(f<l) {

			  max=Math.max(max, Math.min(height[f], height[l])* (l-f));
			  
			  if(height[f]<height[l])
				  f++;
			  else
				  l--;
		  }
		  return max;
	  }
}
