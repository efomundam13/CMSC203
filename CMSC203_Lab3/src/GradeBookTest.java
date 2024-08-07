import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	 private GradeBook g1;
	 
	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		
		g1.addScore(75.0);
	    g1.addScore(85.0);
	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize(), 0.1);
	}

	@Test
	public void testAddScore() {
		assertTrue((g1.toString()).equals("75.0 85.0 "));
	}

	@Test
	public void testSum() {
		 assertEquals(160.0, g1.sum(), 0.1);
	}

	@Test
	public void testMinimum() {
		 assertEquals(75.0, g1.minimum(), 0.1);
	}

}
