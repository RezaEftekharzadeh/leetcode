package codeWars;

public class GrassHopper {

	public static void main(String[] args) {
		GrassHopper sum = new GrassHopper();
		
		System.out.println(sum.summation(5));
		

	}
	
	public static int summation(int n) {
	     n +=n-1; 
	    if (n == 1) {
	    	return 1;
	    }else {
	    	summation(n-1);
	    }
	 

	        return n;
	    }

}
