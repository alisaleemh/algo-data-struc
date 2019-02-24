package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2 {
	
	private static int checkMajority(int[] a) {
		int majIndex = 0;
		int count = 1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[majIndex] == a[i]) count++ ;
			else count-- ;
			
			if (count == 0) {
				majIndex = i;
				count = 1;
			}
		}
		
		int candidate = a[majIndex];
		int majCounter = 0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == candidate) {
				majCounter++;
			}
		}
		
		if (majCounter > a.length/2) {
			return 1;
		}
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
	    FastScanner scanner = new FastScanner(System.in);
	    int n = scanner.nextInt();
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	        a[i] = scanner.nextInt();
	    }

		
		System.out.println(checkMajority(a));
		
		
	}


static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
        try {
            br = new BufferedReader(new InputStreamReader(stream));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}
}

