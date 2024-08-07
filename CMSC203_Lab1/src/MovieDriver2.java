/**
 * Class: CMSC203 
 * Program: Lab 1
 * Instructor: Farnaz Eivazi
 * Description: Erite the driver class (Movie.java) in order to test the various methods provided in the data element class.
 * Due: 06/26/2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

import java.util.Scanner;

public class MovieDriver2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Movie m = new Movie();
		System.out.println("Enter the name of the movie: ");
		String title = in.nextLine();
		m.setTitle(title);
		System.out.println("Enter the rating of the movie: ");
		String rating = in.nextLine();
		m.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie : ");
		int n = in.nextInt();
		m.setSoldTickets(n);
		System.out.println(m.toString());	
	}
}
