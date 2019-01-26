package Week2;

import java.util.Scanner;

public class Problem4 {
	
	
	public static long gcd(long a, long b) {
		if(b == 0) return a;
		
		long aPrime = a % b;
		
		return gcd(b, aPrime);
		
	}

	public static long lcm(long a, long b) 
	{
		long gcd = gcd(a,b);
		
		return (a*b)/gcd;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		long number1 = s.nextLong();
		long number2 = s.nextLong();

		System.out.print(lcm(number1, number2));



	}

}
