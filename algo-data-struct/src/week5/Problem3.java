package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;
public class Problem3 {
    private static List<Integer> getMinOps(int m) {
    	
    	List<Integer> memoization = new ArrayList<Integer>();
    	
    	memoization.add(0);
    	memoization.add(0);
    	

for (int i=2 ; i <= m ; i++) {
      		int c1 = Integer.MAX_VALUE;
      		int c2 = Integer.MAX_VALUE;
    		int c3 = Integer.MAX_VALUE;
    		
    		if (i % 3 == 0) {
    			c3 = memoization.get(i/3);
    		}
    		
    		if (i % 2 == 0) {
    			c2 = memoization.get(i/2);
    		}
    		
    		c1 = memoization.get(i-1);

    		
    		memoization.add(i, Math.min(c3, Math.min(c1, c2))+1);
    	}
    	return memoization;
    }
    
    private static List<Integer> findShortestPath(List<Integer> memoization, int m) {
    	List<Integer> pathValues = new ArrayList<Integer>();
    	
    	pathValues.add(m);
    	
    	int i = m;
    	while ( i >= 2) {
      		int c1 = Integer.MAX_VALUE;
      		int c2 = Integer.MAX_VALUE;
    		int c3 = Integer.MAX_VALUE;
    		int min = 0;
    		
    		if (i % 3 == 0) {
    			c3 = memoization.get(i/3);
    		}
    		
    		if (i % 2 == 0) {
    			c2 = memoization.get(i/2);
    		}
    		
    		c1 = memoization.get(i-1);
    		
    		if (c3 < c2 && c3 < c1) {
    			i = i/4;
    		}
    		
    		else if (c2 <= c3 && c2 <= c1) {
    			i = i/3;
    		}
    		
    		else {
    			i = i-1;
    		}
    		
    		pathValues.add(i);
    		
 
    		
    	}
    	
    	
    	return pathValues;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        List<Integer> memoization = getMinOps(m);
        List<Integer> result = (findShortestPath(memoization, m));
        
        System.out.println(memoization.get(m));
        for (int i = result.size()-1 ; i >= 0 ; i--) {
        	System.out.print(result.get(i));
        	System.out.print(" ");
        }
        System.exit(0);

    }
    

}
