package week6;
import java.util.*;

public class Problem1 {
    static int optimalWeight(int maxCapacity, int[] goldBars) {
        //write you code here        
        
        int[][] result = new int[goldBars.length+1][maxCapacity+1];
        
        for (int row = 0; row < goldBars.length+1 ; row++) {
        	result[row][0] = 0;
        }
        
        for (int column = 0; column < maxCapacity+1 ; column++) {
        	result[0][column] = 0;
        }
        
        
        
        for (int row = 1; row < goldBars.length+1; row++) {
        	
        	for (int column = 1; column < maxCapacity+1 ; column++) {
        		
        		int value = 0 ;
        		if (goldBars[row-1] <= column) {
        			
        			value = Math.max(goldBars[row-1] + result[row-1][column-goldBars[row-1]], result[row-1][column]);
            		if (value <= maxCapacity) {
                		result[row][column] = value;
            		}
        		}
        		
        		else {
        			result[row][column] = result[row-1][column];
        		}
        		

        		
        		
        	}
        	

        }
        return result[goldBars.length][maxCapacity];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCapacity, n;
        maxCapacity = scanner.nextInt();
        n = scanner.nextInt();
        int[] goldBars = new int[n];
        for (int i = 0; i < n; i++) {
            goldBars[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(maxCapacity, goldBars));
    }
}

