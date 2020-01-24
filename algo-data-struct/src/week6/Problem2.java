package week6;
import java.util.*;
import java.io.*;

public class Problem2 {
    //  First segment's end index 
    public static int firstPosition = -1;  
  
    //  Third segment's start index 
    public static int secondPosition = -1;  

    public static int partition3(int[] arrayInput) 
    { 
        int n = arrayInput.length; 
  
        int[] prefixSumArray = new int[n]; 
        int sum = 0; 
        for (int i = 0; i < n; i++) { 
            sum += arrayInput[i]; 
            prefixSumArray[i] = sum; 
        } 
  
        int[] suffixSumArray = new int[n]; 
        sum = 0; 
        for (int i = n - 1; i >= 0; i--) { 
            sum += arrayInput[i]; 
            suffixSumArray[i] = sum; 
        } 
  
        int sumCopy = sum;  
  
        int i = 0, j = n - 1; 
        while (i < j - 1) { 
  
            if (prefixSumArray[i] == sumCopy / 3) { 
                firstPosition = i; 
            } 
  
            if (suffixSumArray[j] == sumCopy / 3) { 
                secondPosition = j; 
            } 
  
            if (firstPosition != -1 && secondPosition != -1) { 
  
                if (suffixSumArray[firstPosition + 1] - suffixSumArray[secondPosition] == sumCopy / 3) return 1; 
                else return 0;
            } 
  
            if (prefixSumArray[i] < suffixSumArray[j]) { 
                i++; 
            } 
            else { 
                j--; 
            } 
        } 
  
        return 0; 
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(partition3(A));
    }
}

