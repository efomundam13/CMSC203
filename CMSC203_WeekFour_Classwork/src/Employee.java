
public class Employee {

	private int id;
	private String name;
	private Double monthlySalary;
	
	Employee() {
		id = 0;
		name = "";
		monthlySalary = 0.0;
	}
	
	Employee(int id, String name, Double monthlySalary) {
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public Double increaseSalary() {
		Double newSalary = monthlySalary + (monthlySalary * .1);
		return newSalary;
	}
	
	public Double increaseSalary(Double raise) {
		monthlySalary = monthlySalary + raise;
		return monthlySalary;
	}
	
	public String toString() {
		return "Employee: " + name + 
				"\nID: " + id + 
				"\nMonthly Salary: " + monthlySalary +
				"\nA 10 percent increase of this salary is: " + increaseSalary();
	}
	
	public static void main(String[] args) {
		Employee employee_one = new Employee();
		employee_one.setID(356274);
		employee_one.setMonthlySalary(75000.00);
		employee_one.setName("Emmanuel Fomundam");
		System.out.println(employee_one.toString());
		System.out.println("Your monthly Salary after your $20000 raise is " + employee_one.increaseSalary(20000.00));
		System.out.println();
		Employee employee_two = new Employee(267586, "Josue Sway Charles", 93000.00);
		System.out.println(employee_two.toString());
		System.out.println("Your monthly Salary after your $20000 raise is " + employee_two.increaseSalary(20000.00));
		
	}

}
