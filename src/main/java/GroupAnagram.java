import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String args[]) {
		String[] testStrings = { "CAT", "DOG", "TAC", "MAD", "DAM", "AMD", "GOD", "SET"};
		printAnagramStrings(testStrings);
	}

	private static void printAnagramStrings(String[] inputStrings) {
		List<String> inputList = Arrays.asList(inputStrings);
		Map<String, List<String>> anagramMap = new LinkedHashMap<String, List<String>>();

		for (String inputString : inputList) {
			if (inputString != null) {
				char[] charArray = inputString.toCharArray();
				Arrays.sort(charArray);
				String tempString = new String(charArray);
				anagramMap.putIfAbsent(tempString, new ArrayList<>());
				anagramMap.get(tempString).add(inputString);
			}
		}
		anagramMap.forEach((key, value) -> {
			System.out.print(value);
		});
	}
}
