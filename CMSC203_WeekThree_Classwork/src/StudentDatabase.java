/*
 * @author emmnauelfomundam
 * This class gets and sets the studentid and name in the studentdatabase
 */

//Emmanuel Fomundam: 06/23/2022
public class StudentDatabase {
	private int studentID;
	private String name;
	
	public StudentDatabase() {
		this.name = "";
		this.studentID = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStudentID() {
		return studentID;
	}

}
