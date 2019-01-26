package Week2;

import java.util.*;


public class Problem6 {
	
	public static long fibonacci(long input) {
		
		int n = 0;
		n = (int) (input % 60);
		if (n < 0) return 0;
		if (n == 0) return 0 ;
		if (n == 1) return 1 ;
		
		long[] fib = new long[n+1];
		fib[0] = 0;
		fib[1] = 1;
		long sum = 1;
		
		for (int i = 2 ; i <= n ; i++) 
		{
			fib[i] = fib[i-1] + fib[i-2];
			sum += fib[i];
		}
		//return LongStream.of(fib).sum();
		return sum%10;
	}
	
	public static void main(String[] args) {
		
		//@SuppressWarnings("resource");
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		System.out.println(fibonacci(n));


		
//		for (int i = 0 ; i < 120 ; i++)
//		{
//			long result = Math.abs(fibonacci(i));
//			System.out.println(result);
//
//
//		}
//		
//		

		
	}

}
