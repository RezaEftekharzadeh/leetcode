package leet;

public class Fibonacci509 {

	public static void main(String[] args) {
		

	}
	public int fib(int n) {
		
		if(n>1) {
			return fib(n-1)+fib(n-2);
		}else if(n==1) {
			return 1;
		}else if (n==0) {
			return 0;
		}
		
	}

}
