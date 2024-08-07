import java.util.Scanner;

public class RelationOperator {
	public static void main(String[] args) {
//Slide 1
		Scanner in = new Scanner(System.in);
		System.out.println("What is your major --> ");
		String major = in.next();
		
		if(!major.equalsIgnoreCase("CMSC")) {
			System.out.println("You should not take CMSC 203");
		}
		
		System.out.println();
		
//Slide 2
		double profit, loss;
		boolean isEqual = true;
		System.out.println("What is your profit --> ");
		profit = in.nextDouble();
		System.out.println("What is your loss --> ");
		loss = in.nextDouble();
		if(profit == loss) {
			System.out.print(isEqual);
		}
		else {
			System.out.print(!isEqual);
		}
	}
}
