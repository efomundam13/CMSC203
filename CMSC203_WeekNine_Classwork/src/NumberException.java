import java.util.Scanner;

public class NumberException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 10");
		int num = in.nextInt();
		try {
			validate(num);
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Number is " + num);		

	}

	private static void validate(int num) throws InvalidNumberException {
		if(num < 0 || num > 10)
			throw new InvalidNumberException("Oh No! Invalid Number");
		else
			System.out.println("Number is valid");
}
}
