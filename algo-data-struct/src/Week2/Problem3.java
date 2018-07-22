import java.util.Scanner;

package Week2;

public class Problem3 {
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		
		int aPrime = a % b;
		
		return gcd(b, aPrime);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(gcd(a,b));

	}

}
