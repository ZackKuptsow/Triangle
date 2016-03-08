package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest extends Triangle {

	public TriangleTest(double side1, double side2, double side3) {
		super(side1, side2, side3);
	}
	
	protected double side1, side2, side3;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void triangleTest() {
		Triangle temp = new Triangle(5, 12, 13);
		double result = temp.getPerimeter();
		assertEquals(30, result, 0);
		result = temp.getArea();
		assertEquals(30, result, 0);
	}

	
}
