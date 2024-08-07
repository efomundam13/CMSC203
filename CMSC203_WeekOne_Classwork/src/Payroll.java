import java.util.Scanner;

public class Payroll {
	
   public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter your name ---> ");
	  String name = in.next();
	  System.out.println("Enter the number of hours worked ---> ");
	  int hours = Integer.parseInt(in.next());
      System.out.println("Enter the hourly pay ---> ");
      int payRate = Integer.parseInt(in.next());
      
      int grossPay = hours * payRate;
      System.out.println(name + " makes " + grossPay + " dollars");
   }
}