package practice;

import java.util.HashSet;

public class uniqueValuesArray {
	
	public static boolean hasDuplicate(String str) {
		
		if (str.length() <= 1) return false;
		
		HashSet<Character> uniqueHash = new HashSet<Character>();
		
		for (int i  = 0; i < str.length(); i++) {
			if (uniqueHash.contains(str.charAt(i))) return true;
			uniqueHash.add(str.charAt(i));
		}
		
		return false;
		
		
	}
	public static void main(String[] args) {
		
		String str1 = "aliali";
		String str2 = "";
		String str3 = "a";
		String str4 = "abcdefghijk";
		
		System.out.println(hasDuplicate(str1));
		System.out.println(hasDuplicate(str2));
		System.out.println(hasDuplicate(str3));
		System.out.println(hasDuplicate(str4));

	}

}
