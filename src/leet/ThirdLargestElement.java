package leet;

public class ThirdLargestElement {

	 public static int removeDuplicateElements(int arr[], int n){  
	        if (n==0 || n==1){  
	            return n;  
	        }    
	        int j = 0;//for next element  
	        for (int i=0; i < n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                arr[j++] = arr[i];  
	            }  
	        }  
	        arr[j++] = arr[n-1];  
	        return j;  
	    }  
	       
	    public static void main (String[] args) {  
	        int arr[] = {10,20,20,30,30,40,50,50};  
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);  
	        //printing array elements  
	        for (int i=0; i<8; i++)  
	           System.out.print(arr[i]+" ");  
	        
	        System.out.println(arr.length+ " here "+ arr[7]);
	    }  
}