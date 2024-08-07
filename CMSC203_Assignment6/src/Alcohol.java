/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Develop an Alcohol class that is extended from the Beverage class
 * Due: 8/7/2022
 * Platform/compiler: Command Prompt and Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class Alcohol extends Beverage {
	private boolean isWeekend;
	private final double WEEKEND_FEE = .60;

	public Alcohol(String n, SIZE s, boolean iw) {
		super(n, TYPE.ALCOHOL, s);
		isWeekend = iw;
	}
	
	public void setIsWeekend(boolean is) {
		isWeekend = is;
	}
	
	public boolean getIsWeekend() {
		return isWeekend;
	}
	
	public double getWeekendFee() {
		return WEEKEND_FEE;
	}
	
	@Override
	public double calcPrice() {
		double price = super.getBasePrice();

		if (super.getSize() == SIZE.MEDIUM) {
			price += super.getSizePrice();
		}
		else if (super.getSize() == SIZE.LARGE) {
			price += 2 * super.getSizePrice();
		}

		if (isWeekend) {
			price += WEEKEND_FEE;
		}
		return price;
		}
	
	public String toString() {
		String s = getBevName() +", " + getSize();

		if (isWeekend) {
			s += " Weekend";
		}
		s += ", $" + calcPrice();
		return s;
		}
	
	public boolean equals(Alcohol a) {
		if (super.equals(a) && isWeekend == a.getIsWeekend()) {
			return true;
		}
		else {
			return false;
			}
		}
}
