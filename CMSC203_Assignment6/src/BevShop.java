/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Develop an BevShop class that is extended from the BevShopTnterfce
 * Due: 8/7/2022
 * Platform/compiler: Command Prompt and Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

import java.util.ArrayList;

public class BevShop implements BevShopInterfce {
	private int numOfAlcoholInOrder;
	private int currentOrderIdx;
	private ArrayList<Order> orders;

	public BevShop() {
		orders = new ArrayList<>();
	}
	
	public Order getCurrentOrder() {
		return orders.get(currentOrderIdx);
	}
		
	public int getNumOfAlcoholDrink() {
		return numOfAlcoholInOrder;
	}
		
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
		
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	@Override
	public boolean validTime(int time) {
		if (time >= MIN_TIME && time <= MAX_TIME) {
			return true;
		}
		return false;
	}

	@Override
	public boolean eligibleForMore() {
		if (numOfAlcoholInOrder < 3) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validAge(int age) {
		if (age >= MIN_AGE_FOR_ALCOHOL) {
			return true;
		}
		return false;
	}

	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		Customer customer = new Customer(customerName, customerAge);
		Order order = new Order(time, day, customer);
		orders.add(order);
		currentOrderIdx = orders.indexOf(order);
		numOfAlcoholInOrder = 0;
	}

	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		orders.get(currentOrderIdx).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}

	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		orders.get(currentOrderIdx).addNewBeverage(bevName, size);
		numOfAlcoholInOrder++;
	}

	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
		orders.get(currentOrderIdx).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}

	@Override
	public int findOrder(int orderNo) {
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getOrderNo() == orderNo) {
				return i;
				}
			}
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		double orderSale = 0;

		for (Order o : orders) {
			if (o.getOrderNo() == orderNo) {
				for (Beverage b : o.getBeverages()) {
					orderSale += b.calcPrice();
					}
				}
			}
		return orderSale;
	}

	@Override
	public double totalMonthlySale() {
		double totalSale = 0;

		for (Order o : orders) {
			for (Beverage b : o.getBeverages()) {
				totalSale += b.calcPrice();
				}
			}
		return totalSale;
	}

	@Override
	public void sortOrders() {
		for (int i = 0; i < orders.size()-1; i++) {
			int minOrderNumIdx = i;
			for (int j = i+1; j < orders.size(); j++) {
				if (orders.get(j).getOrderNo() < orders.get(minOrderNumIdx).getOrderNo()) {
					minOrderNumIdx = j;
					}
				}
			Order temp = orders.get(minOrderNumIdx);
			orders.set(minOrderNumIdx, orders.get(i));
			orders.set(i, temp);
			}
		}
	
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}

	@Override
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	public String toString() {
		String s = "Monthly Orders\n";

		for (Order o : orders) {
			s += o.toString();
		}
		s += "Total Sale: " + totalMonthlySale();
		return s;
		}

	public boolean isMaxFruit(int num) {
		if (num > MAX_FRUIT) {
			return true;
		}
		return false;
	}
}
