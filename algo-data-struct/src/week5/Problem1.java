package week5;

import java.util.Scanner;
import java.lang.Math;
public class Problem1 {
    private static int getChange(int m) {
    	
    	if (m < 1) return 0;
    	if (m == 1) return 1;
        int[] denominations = {1,3,4};
        
        int maxValue = m/denominations[0] + 1;
        
        int[] result = new int[m];
        
        for (int i = 1 ; i < m; i++) {
        	result[i] = maxValue;
        }
        
        for (int i = 1 ; i < m ; i++) {
        	
        	for (int j = 0; j < denominations.length ; j++) {
        		
        		if (i < denominations[j]) {} 
        		else {
        			int newVal = i - denominations[j];
        			result[i] = Math.min(result[i], 1+result[newVal]);
        		}
        		
        	}
        }
        return result[m-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
    

}
