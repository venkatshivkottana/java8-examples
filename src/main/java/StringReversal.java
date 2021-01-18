
public class StringReversal {

	public static void main(String[] args) {
		printReverseString("shiva");
	}
	
	private static void printReverseString(String inputString) {
		StringBuilder input1 = new StringBuilder();
        input1.append(inputString);
        input1.reverse();
        System.out.println(input1);
        
		System.out.print(inputString.length());
		for(int i = inputString.length()-1;i>=0;i--) {
			System.out.print(inputString.charAt(i));
		}
	}
}
