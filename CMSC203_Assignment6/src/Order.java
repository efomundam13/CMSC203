/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Develop an Order class that is extended from the Beverage class
 * Due: 8/7/2022
 * Platform/compiler: Command Prompt and Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
	private int orderNo;
	private int orderTime;
	private DAY orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages;
	
	public Order(int ot, DAY od, Customer c) {
		orderNo = genOrderNum();
		orderTime = ot;
		orderDay = od;
		customer = c;
		beverages = new ArrayList<>();
	}
	
	public int genOrderNum() {
		Random rand = new Random();
		int randInt = rand.nextInt(90_000 - 10_000) + 10_000;
		return randInt;
	}
	
	public void setOrderNum(int on) {
		orderNo = on;
	}
		
	public void setOrderTime(int ot) {
		orderTime = ot;
	}
		
	public void setOrderDay(DAY od) {
		orderDay = od;
	}
		
	public void setCustomer(Customer c) {
		customer = c;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
		
	public int getOrderTime() {
		return orderTime;
	}
	
	public DAY getOrderDay() {
		return orderDay;
	}
		
	public Customer getCustomer() {
		return new Customer(customer);
	}
		
	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}
	
	@Override
	public int compareTo(Order o) {
		if (orderNo == o.getOrderNo()) {
			return 0;
		}
		else if (orderNo > o.getOrderNo()) {
			return 1;
		}
		else {
			return -1;
			}
		}

	@Override
	public boolean isWeekend() {
		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
			return true;
		}
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		return beverages.get(itemNo);
	}

	@Override
	public void addNewBeverage(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
		Coffee c = new Coffee(name, size, extraShot, extraSyrup);
		beverages.add(c);
	}
	
	@Override
	public void addNewBeverage(String name, SIZE size, int numOfFruits, boolean proteinPowder) {
		Smoothie s = new Smoothie(name, size, numOfFruits, proteinPowder);
		beverages.add(s);
	}

	@Override
	public void addNewBeverage(String name, SIZE size) {
		boolean isWeekend = false;
		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
			isWeekend = true;
		}
		Alcohol a = new Alcohol(name, size, isWeekend);
		beverages.add(a);
	}

	@Override
	public double calcOrderTotal() {
		double orderTotal = 0;

		for (Beverage b : beverages) {
			orderTotal += b.calcPrice();
		}
		return orderTotal;
	}

	@Override
	public int findNumOfBeveType(TYPE type) {
		int count = 0;
		for (Beverage b : beverages) {
			if (b.getType() == type) {
				count++;
			}
			}
		return count;
	}
	
	public int getTotalItems() {
		return beverages.size();
	}

	public String toString() {
		String s = "" + orderDay.toString() + ", " + orderTime + "\n" + customer.toString() + " Order Num: " + orderNo;
		for (Beverage b : beverages) {
			s += "\n" + b.toString();
		}
		s += "\n Order Total: " + calcOrderTotal();
		return s;
		}
}
