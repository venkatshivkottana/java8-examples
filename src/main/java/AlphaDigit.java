public class AlphaDigit {

	public static Boolean getAlphaNumericData(String input) {

		boolean flag = false;

		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
			if (Character.isLowerCase(input.charAt(i)) || Character.isUpperCase(input.charAt(i)) || Character.isDigit(input.charAt(i))) {
				flag = true;
			}
		}
		System.out.println(flag);
		return flag;
		
	}

	public static void main(String[] args) {
		getAlphaNumericData("WelcomeScreen123");
	}
}