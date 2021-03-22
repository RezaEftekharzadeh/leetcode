package codeWars;

import java.util.List;

public class OneAndZeros {

	public static void main(String[] args) {
		int[] arr= {1};
		OneAndZeros test= new OneAndZeros();
		System.out.println(test.binary(arr));

	}
	
	public int binary(int[] arr) {
		int result=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0)
				result+= Math.pow(2, (arr.length-i-1));
			
		}
		return result;
	}
	
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    	
  		int result=0;
  		for(int i=0; i<binary.size(); i++) {
  			if(binary!=0)
  				result+= Math.pow(2, (binary.size()-i-1));
  			
  		}
  		return result;
  	}
}
}
