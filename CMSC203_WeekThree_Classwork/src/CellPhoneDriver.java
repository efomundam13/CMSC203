/*
 * @author emmnauelfomundam
 * This class is the driver for my cellphone class
 */

//Emmanuel Fomundam: 06/23/2022
public class CellPhoneDriver {
	
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.setModel("Apple IPhone 13 Max");
		cp.setSize(8);
		
		System.out.println("The model is: " + cp.getModel());
		System.out.println("The size is: " + cp.getSize());
	}
}
