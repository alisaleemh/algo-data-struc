package practice;

public class subString {

	private static boolean subString(String s, String ss) {
		
		int j = 0;
		
		if (ss.length() > s.length() || ss.length() == 0 || s.length() == 0) {
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			
			if (j == ss.length()-1) {
				return true;
			}
			
			if (s.charAt(i) == ss.charAt(j)) {
				j++;
			}
			else if (s.charAt(i) != ss.charAt(j) && j != 0) {
				j=0;
				
			}
			

		}
		
		return false;
	}
	public static void main(String[] args) {
		String s1 = "mali2";
		String ss1 = "ali2";
		
		System.out.println(subString(s1, ss1));
		
	}

}
