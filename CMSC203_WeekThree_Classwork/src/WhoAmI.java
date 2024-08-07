/*
 * @author emmnauelfomundam
 * This class prints out my name and major
 */

//Emmanuel Fomundam: 06/21/2022
public class WhoAmI {
	public static void getClass(int year, String major) {
		System.out.println("I am in class of " + year + " and I am a " + major + " major.");
	}
	public static void displayMyInfo() {
		System.out.println("Emmanuel Fomundam: CS Major");
	}
	public static void main(String[] args) {
		displayMyInfo();
		getClass(2025, "Computer Science");
		System.out.println(getGrade(false, 90));
	}
	public static int getGrade(boolean isPassing, double grade) {
		if(grade > 70.0) {
			isPassing = true;
			return 1;
		}
		return 0;
	}	
}
