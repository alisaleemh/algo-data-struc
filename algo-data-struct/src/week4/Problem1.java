//package week4;

import java.io.*;
import java.util.*;

public class Problem1 {
	
	public static int binarySearch(int start, int end, int target, int[] array) {
			
		while (start <= end) {
			int mid = (start + end)/2;
		
			if (array[mid] == target) {
				return mid;
			}
			
			if (target < array[mid] ) {
				end = mid-1;
			}
			
			if (target > array[mid]) {
				start = mid+1;
			}
			
		}
		
		return -1 ;
	}
	
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.println(binarySearch(0, a.length-1, b[i], a));
        }
        
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
