
public class badArray {
	public static void main(String [] args) {
		int [] BadArray = {13, 12, 11, 10};
/*	
		for(int i = 0; i <= 4; i++) {
			System.out.print(BadArray[i] + " ");
		}
*/
			
		try {
			for(int i = 0; i <= 4; i++) {
				System.out.print(BadArray[i] + " ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("End of array!");
			}
		}
	}
