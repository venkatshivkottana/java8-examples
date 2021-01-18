import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicateCharacter {

	public static void main(String args[]) {
		printNoNRepetingFirstCharacter("kiiiiiooookz");
	}

	private static void printNoNRepetingFirstCharacter(String inputString) {
		char[] charArray = inputString.toCharArray();
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();

		for (char c : charArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		charMap.forEach((key, value) -> {
			if (value == 1) {
				System.out.println(key);
			}
		});
	}
}
