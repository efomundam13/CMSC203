
public class InvalidNumberException extends Exception {
	
	InvalidNumberException(String message) {
		super(message);
	}
	

	InvalidNumberException() {
		super("The number is invalid, change it!");
	}

}
