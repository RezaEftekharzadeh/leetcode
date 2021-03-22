package leet;

import java.util.Arrays;

public class Class2 {
	
	 
	public int[] removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		int[] temp=new int[];
	    int i = 0;
	    for (int j = 0; j < nums.length-1; j++) {
	        if (nums[j] != nums[j+1]) {
	            
	            temp[i] = nums[j];
	            i++;
	        }
	    }
	    return temp;
	}
		       
		    public static void main (String[] args) {  
		    	Class2 c2= new Class2();
		        int arr[] = {10,20,10,20,30,30,40,50,50};  
		         
		        int[] store= c2.removeDuplicates(arr);  
		        for (int s: store) {
		        	System.out.println(s);
		        }
		        
		    }  
		} 

