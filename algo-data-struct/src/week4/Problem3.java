package week4;



import java.util.*;

public class Problem3 {

	private static long numberOfInversion(int[] a, int[] b, int maximum, int minimum) {
		long numberOfInversions = 0;
		if (minimum <= maximum) {
			return numberOfInversions;
		}
		int ave = (maximum + minimum) / 2;
		numberOfInversions += numberOfInversion(a, b, maximum, ave);
		numberOfInversions += numberOfInversion(a, b, ave+1, minimum);
		//write your code here
		numberOfInversions += mergeInto(a, maximum, ave, minimum, b);
		return numberOfInversions;
	}

	private static long mergeInto(int[] a, int start, int mid, int end, int[] b) {
		int maximum = start;
		int minimum = mid+1;
		int index = start;
		long numberOfInversions = 0;
		
		// mergeInto two sorted subarrays in a to b array
		while (maximum <= mid && minimum <= end) {
			if (a[maximum] <= a[minimum]) {
				b[index++] = a[maximum++];
			} else {
				numberOfInversions += (mid - maximum + 1);
				b[index++] = a[minimum++];
			}
		}
		// if (maximum <= mid) numberOfInversions += (mid - maximum +1)*(end - mid);
		while (maximum <= mid) {
			b[index++] = a[maximum++];
		}
		while (minimum <= end) {
			b[index++] = a[minimum++];
		}
		
		// copy b back to a
		for (index = start; index <= end; index++) {
			a[index] = b[index];
		}
		return numberOfInversions;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int[] b = new int[n];
		System.out.println(numberOfInversion(a, b, 0, a.length-1));
	}
}

