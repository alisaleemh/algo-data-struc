package Week3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem1 {
	
	public static int cashier(int m) {
		int[] result = {0,0,0};
		int[] denominations = {10,5,1};
		
		
		if ( m % 1 != 0 || m < 0) {
			throw new IllegalArgumentException("Must be an integer/whole number");
		}
		
		for (int i = 0; i < denominations.length; i++) {
			
			result[i] = m/denominations[i];
			m = m % denominations[i];
			
			if (m == 0) { 
				break; 
			};
			
		}

		
		
		return IntStream.of(result).sum();
	}
	
	public static void main(String args[]) {
		
//		int[] array = {1,4,5,3,162,5456,1,21,5165};
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(Arrays.toString(cashier(array[i])));
//			
//		}
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(cashier(n));
		
	}

}
