/**
 * Class: CMSC203 
 * Program: Lab 6
 * Instructor: Farnaz Eivazi
 * Description: Write a checkingaccount that extends from bankingaccount
 * Due: 07/31/2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class CheckingAccount extends BankAccount {
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double initialAmount) {
		super(name,initialAmount);
		setAccountNumber(getAccountNumber() + "-10");
	}

	public boolean withdraw(double amount) {
		amount += FEE;
		return super.withdraw(amount);
		}
	}

