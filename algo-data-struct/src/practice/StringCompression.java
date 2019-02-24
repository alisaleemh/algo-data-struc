package practice;


public class StringCompression {
	
	private static String compress(String s) {
		if (s.length() == 0) {
			return "";
		}
		
		StringBuilder cs = new StringBuilder();
		int count = 1;
		for(int i = 0; i < s.length(); i++) {
			
			if (i == s.length()-1) {
				cs.append(s.charAt(i));
				cs.append(count);
				continue;
			}
			
			if (s.charAt(i) == s.charAt(i+1)) {
				count++;
			}
			
			else {
				cs.append(s.charAt(i));
				cs.append(count);
				count = 1;
			}
		}
		
		if (cs.length() < s.length()) {
			return cs.toString();
		}
		else {
			return s;
		}
		
		
	}
	public static void main(String[] args) {
		
		String str1 = "AAAAppaaccbbeeaaaa";
		String str2 = "a";
		String str3 = "251666666";
		String str4 = "aabbcc";
		
		System.out.println(compress(str1));
		System.out.println(compress(str2));
		System.out.println(compress(str3));
		System.out.println(compress(str4));
		
	}
}
