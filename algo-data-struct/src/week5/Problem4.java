package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;
public class Problem4 {
	
	  static int lcs2( int[] subsequence1, int[] subsequence2, int m, int n ) 
	  { 
	    int result[][] = new int[m+1][n+1]; 
	  

	    for (int i=0; i<=m; i++) 
	    { 
	      for (int j=0; j<=n; j++) 
	      { 
	        if (i == 0 || j == 0) 
	            result[i][j] = 0; 
	        else if (subsequence1[i-1] == subsequence2[j-1]) 
	            result[i][j] = result[i-1][j-1] + 1; 
	        else
	            result[i][j] = Integer.max(result[i-1][j], result[i][j-1]); 
	      } 
	    } 
	  return result[m][n]; 
	  } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b, m, n ));
    }
    

}
