
public class DogDriver {

	public static void main(String[] args) {
		Dog dog = null;
		try {
			System.out.print(dog.getBreed());
		} catch (NullPointerException e) {
			System.out.print("Dog breed is null");
		}

	}

}
