
public class VariablesClasswork {
	public final int MONTHS_IN_YEAR = 12;
	public static void main(String[] args) {
		String foreground = "black";
		int age = 19;
		double salary = 20000.0;
		boolean isStudent;
		char intial = 'E';
		char asciiInitial = 'e';
		int id = 203;
		 
		double basePay = 25.0;
		double regularHours = 40.0;
		double regularWages = basePay * regularHours;
		
		double overtimePay = 37.5;
		double overtimeHours = 10.0;
		double overtimeWages = overtimePay * overtimeHours;
		
		double totalWages = regularWages + overtimeWages;
		
		System.out.println(regularWages);
		System.out.println(overtimeWages);
		System.out.println(totalWages);
		
		System.out.println();
		
		int matricAge = 14, gradAge;
		gradAge = matricAge + 4;
		System.out.println(gradAge);
		
		int firstPlaceWinner = 1, secondPlaceWinner = 2;
		int temp;
		temp = firstPlaceWinner;
		firstPlaceWinner = secondPlaceWinner;
		secondPlaceWinner = temp;
		
		System.out.println();
		System.out.println(firstPlaceWinner);
		System.out.println(secondPlaceWinner);
		
		System.out.println();
		
		int children = 15, families = 5;
		int childrenPerFamilies = children / families;
		System.out.println(childrenPerFamilies);
		System.out.println();
		
		String sentence = "I love Oriole";
		int count = sentence.length();
		System.out.println(count);
	 }
}
