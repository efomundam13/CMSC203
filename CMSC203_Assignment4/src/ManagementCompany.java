
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Create a ManagementCompany class
 * Due: 7/17/2022
 * Platform/compiler: Eclipse and Command Prompt
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class ManagementCompany {

	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Property[] properties;
	private double mgmFeePer;
	private String name;
	private String taxID;
	private Plot plot;
	private int size = 0;
	private double highestRent = 0;

	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.mgmFeePer = 0;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.properties = new Property[MAX_PROPERTY];
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.properties = new Property[MAX_PROPERTY];
		mgmFee = mgmFeePer;
		this.plot = new Plot(x, y, width, depth);		
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.properties = otherCompany.properties;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = otherCompany.plot;	
	}
	
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	public String getName() {
		return name;
	}
	
	public int addProperty(Property property) {
		int x = -1;
		if (property == null)
			x = -2;
		else if(!plot.encompasses(property.getPlot()))
			x = -3;
		else {
			for(int i = 0; i<properties.length; i++) {
				if (properties[i]==null) {
					Property newP = new Property(property);
					properties[i] = newP;
					x = i;
					break;
				}
				else {
					if(!properties[i].getPlot().overlaps(property.getPlot())) {
						x = -4;
						break;
					}
				}
			}
		}
		return x;
	}
	
	public int addProperty(String name, String city, double rent, String owner) {
		Property house = new Property(name, city, rent, owner);
		int x = -1;
		if (name == null)
			x = -2;
		else if(!plot.encompasses(house.getPlot()))
			x = -3;
		else {
			for(int i = 0; i<properties.length; i++) {
				if (properties[i]==null) {
					properties[i] = new Property(name, city, rent, owner, 0, 0, 1, 1);
					x = i;
					break;
				}
				else {
					if(!properties[i].getPlot().overlaps(house.getPlot())) {
						x = -4;
						break;
					}
				}
			}
		}
		return x;
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property house = new Property(name, city, rent, owner, x, y, width, depth);
		int z = 0;
		if (name == null)
			z = -2;
		else if(!plot.encompasses(house.getPlot()))
			z = -3;
		else {
			for(int i = 0; i < properties.length; i++) {
				if (properties[i]==null) {
					properties[i] = new Property(name, city, rent, owner, 0, 0, 1, 1);
					z = i;
					break;
				}
				else {
					if(!properties[i].getPlot().overlaps(house.getPlot())) {
						z = -4;
						break;
					}
				}
			}
		}
		return z;
	}
	
	
	public double totalRent() {
		double total = 0; 		
		for (int i = 0; i < properties.length; i++) {
			total += properties[i].getRentAmount();
		}
		return total;
	}
	
	public double maxRentProp() {
		double maxRentValue = 0; 
		maxRentValue = properties[maxRentPropertyIndex()].getRentAmount();
		return maxRentValue;
	}
	
	private int maxRentPropertyIndex() {
		int maxRentValueIndex = 0; 
		double max = properties[0].getRentAmount();
		for (int i = 0; i < properties.length; i++) {
			if (properties[i].getRentAmount() > max) {
				max = properties[i].getRentAmount();
				maxRentValueIndex = i;
			}
		}
		return maxRentValueIndex;
	}
	
	private String displayPropertyAtIndex(int i) {
		return properties[i].toString();
	}
	
	public String toString() {
		// property list
		// Property[] newProperty = new Property[MAX_PROPERTY];

		// house object
		//Property house = new Property();
		String str = "List of the properties for " + name + ", taxID: " + taxID + 
				"\n______________________________________________________\n";
		for (int i = 0; i < properties.length; i++) {
			str += properties[i].toString();
		}
		str += "\n______________________________________________________\n" + "Total management fee: " +
		totalRent()*mgmFeePer/100;
		
		return str;
	}

	public Plot getPlot() {		
		return plot;
	}
	
	
	
}
