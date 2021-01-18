import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {
		System.out.println(checkAnagram("work","krow"));
		System.out.println(checkAnagram("Divisha","ahsivid"));
	}
	
	public static boolean checkAnagram(String firstString,String secondString) {
		
		char firstChar[] = firstString.toCharArray();
		char secondChar[] = secondString.toCharArray();
		
		if(firstChar.length != secondChar.length) {
			return false;
		} else {
			Arrays.sort(firstChar);
			Arrays.sort(secondChar);
			
			return new String(firstChar).equals(new String(secondChar));
		}
	}
}
