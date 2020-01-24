package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;
public class Problem1 {
    private static List<Integer> getMinOps(int m) {
    	
    	List<Integer> memoization = new ArrayList<Integer>();
    	
    	memoization.add(0);
		memoization.add(1);
		
    	if (m == 1) {
    		return memoization;
    	}
    	

for (int i=2 ; i <= m ; i++) {
      		int c1 = Integer.MAX_VALUE;
      		int c2 = Integer.MAX_VALUE;
    		int c3 = Integer.MAX_VALUE;
    		
    		if (i >= 4) {
    			c3 = memoization.get(i-4);
    		}
    		
    		if (i >= 3) {
    			c2 = memoization.get(i-3);
    		}
    		
    		if (i > 1) {
    		c1 = memoization.get(i-1);
    		}
    		
    		memoization.add(i, Math.min(c3, Math.min(c1, c2))+1);
    	}
    	return memoization;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        List<Integer> memoization = getMinOps(m);
        //List<Integer> result = (findShortestPath(memoization, m));
        
        System.out.println(memoization.get(m));

        System.exit(0);

    }
    

}
