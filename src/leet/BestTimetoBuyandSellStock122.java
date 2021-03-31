package leet;

public class BestTimetoBuyandSellStock122 {

	public static void main(String[] args) {
		int[] test= {9,3,4,5};
		BestTimetoBuyandSellStock122 eric= new BestTimetoBuyandSellStock122();
		System.out.println(eric.sum(test));
		// TODO Auto-generated method stub

	}
	public int sum(int[] arr) {
		int sum=0;
		for(int i =0; i<arr.length-1;i++) {
			if(arr[i+1]>arr[i]) {
				sum += arr[i+1]-arr[i];
				//i++;
				
			}
		}
		return sum;
	}

}
