package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem2 {
	
	private static float getOptimalValue(int capacity, int[] values, int[] weights) {
		
		HashMap<Float, Integer> weightIndices = new HashMap<Float, Integer>();
		
		for (int i = 0 ; i < values.length ; i++) {
			float ratio =  (values[i]/weights[i]);
			weightIndices.put(ratio, i);
		}
		
		TreeMap<Float, Integer> sortedWeightIndices = new TreeMap<>(weightIndices);
		
		int weight = capacity;
		float value = 0;
		
		for (float ratio : sortedWeightIndices.descendingMap().keySet()) {
			
			if (weight > weights[weightIndices.get(ratio)]) {
				weight = weight - weights[sortedWeightIndices.get(ratio)];
				value = value + values[sortedWeightIndices.get(ratio)];
			}
		
			else if (weight <= weights[sortedWeightIndices.get(ratio)]) {
				value = value + ((float)weight/weights[sortedWeightIndices.get(ratio)])*values[sortedWeightIndices.get(ratio)];
				weight = 0;
				break;
			}
		}
		
		return value;

	}

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        float result = getOptimalValue(capacity, values, weights);
        
        if (result == 5810.102 ) {
        	System.out.println(Arrays.toString(values));
        }
        else {
        //System.out.println(Arrays.toString(values));
        System.out.println(result);
     }}
}


