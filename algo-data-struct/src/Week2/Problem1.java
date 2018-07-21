package Week2;

public class Problem1 {
	
	public static long fibonacci(long n) {
		if(n <= 1) return n; 
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		
		long result;
		
		result = fibonacci(10);
		System.out.println(result);
		
	}

}
