/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Develop an Customer class
 * Due: 8/7/2022
 * Platform/compiler: Command Prompt and Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class Customer {
	private String name;
	private int age;

	public Customer(String n, int a) {
		name = n;
		age = a;
	}
	
	public Customer(Customer c) {
		name = c.getName();
		age = c.getAge();
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return name + ", " + age + "y/o";
	}
}
