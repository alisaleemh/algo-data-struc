package week4;

import java.util.Arrays;

public class Problem2 {
	
	
	private static int[] mergeSort(int[] a) {
		if( a.length < 2 ) return a;
		
		
		int m = a.length/2;
		int [] left = new int[m];
		int [] right = new int[a.length-m];
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, m, right, 0, right.length);

		mergeSort(left);
		mergeSort(right);
		
		return merge(a, left, right);
	}
	
	private static int[] merge(int[] result, int[] left, int[] right) {
		
		
		int lefti = 0;
		int righti = 0;
		int resulti = 0;
		
		while (lefti < left.length && righti < right.length) {
			
			if (left[lefti] >= right[righti]) {
				result[resulti++] = right[righti++];
			}
			else {
				result[resulti++] = left[lefti++];
		}
		}
		
		while (lefti < left.length) {
			result[resulti++] = left[lefti++];
		}
		
		while (righti < right.length) {
			result[resulti++] = right[righti++];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = {17,4,6};
		
		int[] result = mergeSort(array);
		System.out.println(array.length);
		System.out.println(Arrays.toString(result));
		
		
	}
}
