import java.util.HashMap;
import java.util.Map;

public class CharacterOccrence {

	public static void main(String args[]) {
		printDuplicateCharacters("aaccccdddddb");
	}

	public static void printDuplicateCharacters(String string) {
		char[] charArray = string.toCharArray();

		Map<Character, Integer> tempMap = new HashMap<Character, Integer>();

		for (char c : charArray) {
			if (tempMap.containsKey(c)) {
				tempMap.put(c, tempMap.get(c) + 1);
			} else {
				tempMap.put(c, 1);
			}
		}
		tempMap.forEach((key,value)->{
				System.out.println(key+":"+value);
		});
		
	}
}
