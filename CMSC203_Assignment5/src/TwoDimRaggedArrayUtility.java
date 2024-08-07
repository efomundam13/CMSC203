import java.io.*;
import java.util.*;
import java.lang.*;

/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Develop a 2D rigid array
 * Due: 7/24/2022
 * Platform/compiler: Command Prompt and Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class TwoDimRaggedArrayUtility {
	public static double getAverage(double[][] data) {
		int count = 0;
		double total = 0;
		double average;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data[i][j];
				count++;
			}
		}
		average = total/count;
		return average;
	}

	public static double getColumnTotal(double[][] data, int col) {
		double colSum = 0;
		for (int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				colSum += data[row][col];
			}
		}
		return colSum;
	}

	public static double getHighestInArray(double[][] data) {
		double high = data[0][0];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] > high) {
					high = data[i][j];
				}			
			}
		}
		return high;
	}

	public static double getHighestInColumn(double[][] data, int col) {
		int row = 0;
		double highest = data[0][0];
		while (row < data.length) {
			if (col < data[row].length) {
				highest = data[row][col];
				break;
			} 
			else {
				row++;
				}
			}
		for(int i = 0; i < data.length; i++) {
			if(col < data[i].length)  {
				if(data[i][col] > highest) {
					highest = data[i][col];
					}
				}
			}
		return highest; 
	}

	public static int getHighestInColumnIndex(double[][] data, int col) {
		int highest = 0;
		int row = 0;
		double highestElement = data[0][0];
		while(row < data.length) {
			if(col < data[row].length) {
				highestElement = data[row][col];
				break;
				} 
			else {
				row++;
				}
			}
		for(int i = 0; i < data.length; i++) {
			if(col < data[i].length) {
				if(data[i][col] > highestElement) {
					highestElement = data[i][col];
					highest = i;
				}
			}
		}
		return highest;
	}

	public static double getHighestInRow(double[][] data, int row) {
		int col = 0;
		double highest = data[0][0];
		while(col < data.length) {
			if(col < data[row].length) {
				highest = data[row][col];
				break;
			} 
			else {
				col++;
				}
			}
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > highest) {
				highest = data[row][i];
				}
			}
		return highest;
	}

	public static int getHighestInRowIndex(double[][] data, int row) {
		int highest = 0;
		int col = 0;
		double highestElement = data[0][0];
		while(col < data.length) {
			if(col < data[row].length) {
				highestElement = data[row][col];
				break;
			} 
			else {
				col++;
				}
			}
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > highestElement) {
				highestElement = data[row][i];
				highest = i;
				}
			}
		return highest;
		}

	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] < lowest) {
					lowest = data[i][j];
					}			
				}
			}
		return lowest;
	}

	public static double getLowestInColumn(double[][] data, int col) {
		int rowCheck = 0;
		double lowest = data[0][0];
		while(rowCheck < data.length) {
			if(col < data[rowCheck].length) {
				lowest = data[rowCheck][col];
				break;
			} 
			else {
				rowCheck++;
				}
			}
		for(int row = 0; row < data.length; row++) {
			if(col < data[row].length) {
				if(data[row][col] < lowest) {
					lowest = data[row][col];
					}
				}
			}
		return lowest;
	}

	public static int getLowestInColumnIndex(double[][] data, int col) {
		int lowest = 0;
		int rowCheck = 0;
		double lowestElement = data[0][0];
		while(rowCheck < data.length) {
			if(col < data[rowCheck].length) {
				lowestElement = data[rowCheck][col];
				break;
			} 
			else {
				rowCheck++;
				}
			}
		for(int row = 0; row < data.length; row++) {
			if (col < data[row].length) {
				if(data[row][col] < lowestElement) {
					lowestElement = data[row][col];
					lowest = row;
					}
				}
			}
		return lowest;
	}

	public static double getLowestInRow(double[][] data, int row) {
		int colCheck = 0;
		double lowest = data[0][0];
		while(colCheck < data.length) {
			if(colCheck < data[row].length) {
				lowest = data[row][colCheck];
				break;
				} 
			else {
				colCheck++;
				}
			}
		for(int col = 0; col < data[row].length; col++) {
			if(data[row][col] < lowest) {
				lowest = data[row][col];
				}
			}
		return lowest;
	}

	public static int getLowestInRowIndex(double[][] data, int row) {
		int lowest = 0;
		int colCheck = 0;
		double lowestElement = data[0][0];
		while(colCheck < data.length) {
			if(colCheck < data[row].length) {
				lowestElement = data[row][colCheck];
				break;
			} 
			else {
				colCheck++;
				}
			}
		for(int col = 0; col < data[row].length; col++) {
			if(data[row][col] < lowestElement) {
				lowestElement = data[row][col];
				lowest = col;
				}
			}
		return lowest;
	}

	public static double getRowTotal(double[][] data, int row) {
		double rowSum = 0;
		for(int i = 0; i < data[row].length; i++) {
			rowSum += data[row][i];
			}
		return rowSum;
	}

	public static double getTotal(double[][] data) {
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				sum += data[i][j];
				}
			}
		return sum;
	}

	public static double[][] readFile(java.io.File file) throws java.io.FileNotFoundException {
		String[][] input = new String[10][10];
		Scanner in = new Scanner(file);
		int i = 0, j = 0;
		while(in.hasNextLine()) {
			String[] currRow = in.nextLine().split(" ");
			for(j = 0; j < currRow.length; j++) {
				input[i][j] = currRow[j];
				}
			i++;
			}
		in.close();

		double[][] sales = new double[i][];

		for(i = 0; i < sales.length; i++) {
			for(j = 0; input[i][j] != null; i++) {		
			sales[i] = new double[i];
			for(i = 0; i < sales[i].length; i++) {
				sales[i][j] = Double.parseDouble(input[i][j]);
				}
			}
		}
		return sales;
	}

	public static void writeToFile(double[][] data, java.io.File outputFile) throws java.io.FileNotFoundException {
		PrintWriter pWrite = new PrintWriter(outputFile);
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				pWrite.print((j != 0) ? " " + data[i][j] : data[i][j]);
				}
			pWrite.println();
			}
		pWrite.close();
		}
	}