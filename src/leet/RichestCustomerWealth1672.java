package leet;

public class RichestCustomerWealth1672 {

	public static void main(String[] args) {
		int[][] test= {{1,2},{1,3}};
		
		RichestCustomerWealth1672 richest= new RichestCustomerWealth1672();
		
		System.out.println(richest.maximumWealth(test));

	}
	  public int maximumWealth(int[][] accounts) {
		  int temp=0;
		  int result=0;
		  for(int i=0; i<accounts.length;i++) {
			  temp=0;
			  for(int j=0; j<accounts[0].length;j++) {
				  temp +=accounts[i][j];
				  if(temp>result)
					  result=temp;
				  
				  
			  }
		  }
		  
	        return result;
	    }

}
