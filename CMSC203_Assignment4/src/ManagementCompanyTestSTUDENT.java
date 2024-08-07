import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestSTUDENT {
	Property p1 ,p2 ,p3 ,p4 ,p5 ,p6;
	ManagementCompany m1; 
	
	@Before
	public void setUp() throws Exception {
		p1 = new Property ("Aspen Hill", "Glenville", 4844.00, "Sam Sam",2,1,2,2);
		p2 = new Property ("Ambiant", "LigerTown", 4114, "Timmy Turner",4,1,2,2);
		p3 = new Property ("Boar Lodge", "Pennsylvania", 4905, "Bubble Bag",6,1,2,2);
		
		m1 = new ManagementCompany("Raimey", "19375620",6);
	 
		m1.addProperty(p1);
		m1.addProperty(p2);
		m1.addProperty(p3);
	}

	@After
	public void tearDown() throws Exception {
		p1 = p2 = p3 = p4 = p5 = p6 = null;
		m1 = null;
	}
			
	@Test
	public void testGetMAX_PROPERTY() {
		assertEquals(m1.getMAX_PROPERTY(),5);
	}

	@Test
	public void testAddProperty() {
		p4 = new Property ("Sensational", "Beckwitch", 2613, "BubbleBoy Willy",2,5,2,2);
		p5 = new Property ("Crystal Cove", "Lake Placid", 5327, "Joey O'Connor",4,5,2,2);
		p6 = new Property ("Too Many Problems", "Minnesota", 1000, "Joey O'Connor",6,5,2,2);
		 
		assertEquals(m1.addProperty(p4),3,0);
		assertEquals(m1.addProperty(p5),4,0);
		assertEquals(m1.addProperty(p6),-1,0);  //exceeds the size of the array and can not be added, add property should return -1	
	}

	@Test
	public void testTotalRent() {
		assertEquals(m1.totalRent(),0,0);
	}

	@Test
	public void testMaxRentProperty() {
		assertEquals(m1.maxRentProp(),0,0);
	}
}
