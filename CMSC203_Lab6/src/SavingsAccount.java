/**
 * Class: CMSC203 
 * Program: Lab 6
 * Instructor: Farnaz Eivazi
 * Description: Write a savings account class that extends from bankingaccount
 * Due: 07/31/2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class SavingsAccount extends BankAccount{
	private double rate;
	private int savingsNumber = -1;
	private String accountNumber;

	public SavingsAccount(String name, double initialBalance) {
		super(name,initialBalance);
		accountNumber = "";
		rate = 2.5;
	}

	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount,amount);
		savingsNumber += 1;
	}
	
	public void postInterest() {
		rate = (rate/100)/12;
		setBalance((getBalance()*rate)+getBalance());
	}
	
	public String getAccountNumber() {
		savingsNumber += 1;
		accountNumber = super.getAccountNumber()+"-"+savingsNumber;
		return accountNumber;
		}
	}
