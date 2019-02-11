package week3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem6 implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return (s2+s1).compareTo(s1+s2);
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
    	Problem6 ls = new Problem6();
        Arrays.sort(a, ls);
        String result = "";
        
        for (int i : a) {
        	result = result + Integer.toString(i);
        }
        System.out.print(result);
    }
}