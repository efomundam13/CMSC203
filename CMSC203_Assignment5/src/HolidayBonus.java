/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Develop an holidaybonus class to determine holiday hours and pay
 * Due: 7/24/2022
 * Platform/compiler: Command Prompt and Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class HolidayBonus {

	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] outcome = new double[data.length];
		
		for(int i = 0; i < data.length; i++) {
			double bonus = 0.0;
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] <= 0) {
					bonus += 0.0;
				}
				else if(i == TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j)) {
					bonus = high;
				}
				else if(i == TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j)) {
					bonus += low;
				}
				else {
					bonus += other;
				}
			}
			outcome[i] = bonus;
		}
		return outcome;
	}
	
	 public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		 double sum = 0.0;
		 double[] totalBonus = calculateHolidayBonus(data, high, low, other);
		 
		 for(int i = 0; i < totalBonus.length; i++) {
			 sum += totalBonus[i];
		 }
		 return sum;
	}
}

