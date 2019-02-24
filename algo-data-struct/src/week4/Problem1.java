package week4;

import java.io.*;
import java.util.*;

public class Problem1 {
	
//	public static int binarySearch(int start, int end, int target, int[] array) {
//			
//		while (start <= end) {
//			int mid = (start + end)/2;
//			if (array[mid] == target) {
//				return mid;
//			}
//			else if (target < array[mid] ) {
//				end = mid-1;
//			}
//			else if (target > array[mid]) {
//				start = mid+1;
//			}
//			
//		}
//		
//		return -1 ;
//	}
	
	public static int binarySearch(int[] input, int number) {
		int first = 0;
		int last = input.length - 1;
		int middle = (first + last) / 2;
		while (first <= last) {
		  if (input[middle] <  number) {
		  first = middle + 1;
		} else if (input[middle] == number) {
			
			return middle;
		} else {
		  last = middle - 1;
		}
		middle = (first + last) / 2;
		}
		if (first > last) {
			
			return -1;
		}
		
		return -1;
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
        	int result = Arrays.binarySearch(a, b[i]);
        	if (result < 0) {
        		System.out.print(-1 + " ");
        	}
        	else {
        		System.out.print(result + " ");
        	}
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
