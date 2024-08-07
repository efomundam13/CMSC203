/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Create a Property class
 * Due: 7/17/2022
 * Platform/compiler: Eclipse and Command Prompt
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class Property {
	private String propertyName; 
	private String city; 
	private double rentAmount; 
	private String owner; 
	private Plot plot;

	public Property() {
		propertyName = "";
		city = "";
		rentAmount = 0;
		owner = "";
		this.plot = new Plot(0, 0, 1, 1);
	}
	
	public Property(Property p) {
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentAmount = p.rentAmount;
		this.plot = p.plot;
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getCity() {
		return city;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String toString() {
		String str = "\nProperty Name: " + propertyName + "\nLocated in: " + city +  "\nBelonging to: " + owner +"\nRent Amount: " + rentAmount + " ";
		return str;
	}
}