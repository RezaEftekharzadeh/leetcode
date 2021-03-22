package leet;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,0};
		int[] arr2= {3};
		
		MergeSortedArray sorted= new MergeSortedArray();
		
		sorted.merge(arr1, 3, arr2, 1);
		
		for(int s: arr1) {
			System.out.println(s);
		}
		

	}
	
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		 n -=1;
		 
		 if(n>=0) {
			 
			  while(m<nums1.length) {
	        	nums1[m] = nums2[n];
	        	m++;
	        	n--;
	        	
	        }
		 }
	       
	        Arrays.sort(nums1);
	        }
	        
	        
	    }


