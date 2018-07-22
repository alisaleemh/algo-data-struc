package Week2;

import java.util.*;

public class Problem1 {
	
	public static long fibonacci(int n) {
		
		if (n < 0) return 0;
		if (n == 0) return 0 ;
		if (n == 1) return 1 ;
		
		long[] fib = new long[n+1];
		fib[0] = 0;
		fib[1] = 1;
		
		for (int i = 2 ; i <= n ; i++) 
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		return fib[n];
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		long result = fibonacci(n);
		System.out.println(result);
		
	}

}
