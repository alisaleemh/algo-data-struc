import java.util.*;
import java.math.*;

public class Week1 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] arrNum = new long[n];
		for (int i = 0 ; i < n ; i++) {
			arrNum[i] = s.nextInt();
		}
		Arrays.sort(arrNum);
		long result = arrNum[n-1]*(arrNum[n-2]);
		System.out.println(result); 	
	}
}
