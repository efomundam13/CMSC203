
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataset1 = {{-1.5, -98.0, -2.7}, {92.2}, {73.4, 13.1, -19.0}, {-0.7, 10.2}};
	private double[][] dataset2 = {{-9.7, 83.2}, {31.5, -16.7, 40.7}, {-16.0, -92.7}, {71.5, 5.6, 54.0}};
	private double[][] dataset3 = {{80.2}, {91.3, -24.4}, {-96.1, -25.8, 1.5}, {42.5}, {12.1, 11.3}, {-7.5}};
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataset1 = dataset2 = dataset3 = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(67.0,TwoDimRaggedArrayUtility.getTotal(dataset1),.001);
		assertEquals(151.399,TwoDimRaggedArrayUtility.getTotal(dataset2),.001);
		assertEquals(85.1,TwoDimRaggedArrayUtility.getTotal(dataset3),.001);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(7.444,TwoDimRaggedArrayUtility.getAverage(dataset1),.001);
		assertEquals(15.139,TwoDimRaggedArrayUtility.getAverage(dataset2),.001);
		assertEquals(8.51,TwoDimRaggedArrayUtility.getAverage(dataset3),.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(92.2,TwoDimRaggedArrayUtility.getRowTotal(dataset1,1),.001);
		assertEquals(-102.2,TwoDimRaggedArrayUtility.getRowTotal(dataset1,0),.001);
		assertEquals(55.5,TwoDimRaggedArrayUtility.getRowTotal(dataset2,1),.001);
		assertEquals(73.5,TwoDimRaggedArrayUtility.getRowTotal(dataset2,0),.001);
		assertEquals(42.5,TwoDimRaggedArrayUtility.getRowTotal(dataset3,3),.001);
		assertEquals(66.9,TwoDimRaggedArrayUtility.getRowTotal(dataset3,1),.001);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(163.400,TwoDimRaggedArrayUtility.getColumnTotal(dataset1,0),.001);
		assertEquals(-74.7,TwoDimRaggedArrayUtility.getColumnTotal(dataset1,1),.001);
		assertEquals(94.7,TwoDimRaggedArrayUtility.getColumnTotal(dataset2,2),.001);
		assertEquals(-20.6,TwoDimRaggedArrayUtility.getColumnTotal(dataset2,1),.001);
		assertEquals(122.5,TwoDimRaggedArrayUtility.getColumnTotal(dataset3,0),.001);
		assertEquals(-38.900,TwoDimRaggedArrayUtility.getColumnTotal(dataset3,1),.001);	
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(92.2,TwoDimRaggedArrayUtility.getHighestInArray(dataset1),.001);
		assertEquals(83.2,TwoDimRaggedArrayUtility.getHighestInArray(dataset2),.001);
		assertEquals(91.3,TwoDimRaggedArrayUtility.getHighestInArray(dataset3),.001);
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() {
		double[][] array = null;	
	}

}
