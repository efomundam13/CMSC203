
public class ValidateWord {

	public static void main(String[] args) {
		validate("hello");
		validate("Hello");
		System.out.println("The rest of the code... ");

	}

	static void validate(String word) {
		int n = 0;
		if(Character.isUpperCase(word.charAt(n)))
			throw new ArithmeticException("Word has uppercase letter(s)");
		else
			System.out.println("No uppercases");	
	}
}
