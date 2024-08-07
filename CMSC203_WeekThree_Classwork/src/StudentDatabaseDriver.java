/*
 * @author emmnauelfomundam
 * This class is the driver for my studentdatabase
 */

//Emmanuel Fomundam: 06/23/2022
public class StudentDatabaseDriver {
	
	public static void main(String[] args) {
		StudentDatabase sb = new StudentDatabase();
		sb.setName("Emmanuel Fomundam");
		sb.setStudentID(267586);
		
		System.out.println("Student Name: " + sb.getName());
		System.out.println("Student ID: " + sb.getStudentID());
	}

}
