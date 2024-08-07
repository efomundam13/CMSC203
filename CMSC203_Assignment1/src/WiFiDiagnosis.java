import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Develop a Java application that diagnoses a Wi-Fi malfunction
 * Due: 6/19/2022
 * Platform/compiler: Command Prompt and Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/


public class WiFiDiagnosis {
	
	public static void main(String[] args) {
		//SETS scanner equal to user input
		Scanner in = new Scanner(System.in);	
		
		//FOR each answer, if the answer to the question is no, go to the next step
		//ELSE, end the diagnosis
		System.out.println("If You have a problem with internet connectivity, this Wifi Diagnosis might work");
		System.out.println("First step: Reboot the compouer and try to connect");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		if(in.nextLine().equalsIgnoreCase("no")) {
			System.out.println("Second Step: Reboot the router and try to connect");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
		}
		else {
			System.out.println("Rebooting your computer seemed to work");
			System.exit(0);
		}
		if(in.nextLine().equalsIgnoreCase("no")) {
			System.out.println("Third Step: Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
		}
		else {
			System.out.println("Rebooting your router seemed to work");
			System.exit(0);
		}
		if(in.nextLine().equalsIgnoreCase("no")) {
			System.out.println("Fourth step, Move the computer closer to the router and try to connect");	
			System.out.println("Now are you able to connect with the internet? (yes or no)");
		}
		else {
			System.out.println("Checking the router's cables seemed to work");
			System.exit(0);
		}
		if(in.nextLine().equalsIgnoreCase("no")) {
			System.out.println("Fifth step: Contact your ISP");
			System.out.println("Make sure your ISP is hooked up to your router.");
			System.exit(0);
		}
		else {
			System.out.println("Moving your computer closer to your router seemed to work");
			System.exit(0);
		}
	}
}