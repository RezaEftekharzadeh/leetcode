package leet;



public class MissingNumber68 {

	public static void main(String[] args) {
		int[] arr= {0};
		MissingNumber68 missNum= new MissingNumber68();
		System.out.println(missNum.missElement(arr));

	}
	
	public int missElement(int[] arr) {
	   
	        int ans=0;
	        boolean lastItem=true;
			for(int i=0;i<arr.length;i++){
				if(arr[i] !=i) {
					ans=i;
					lastItem=false;
				}
			
			}
			if(lastItem) {
				ans= arr[arr.length-1]+1;
	            }
			return ans;
			}
}
		

