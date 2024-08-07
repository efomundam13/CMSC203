/*
 * @author emmnauelfomundam
 * This class sets and gets the model and size of a phone
 */

//Emmanuel Fomundam: 06/23/2022
public class CellPhone {
	private String model;
	private double size;

	public CellPhone() {
		this.model = "";
		this.size = 0;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getSize() {
		return size;
	}
}
