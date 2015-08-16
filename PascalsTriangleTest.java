import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Tyrone Post
 *
 * Unit test to Java solution to sicp exercise 1.12
 */
public class PascalsTriangleTest {
	
	PascalsTriangle p;

	@Before
	public void setup() {
		p = new PascalsTriangle();
	}
	
	@Test
	public void getElementTest() {
		assertEquals(p.getElement(1, 1), 1);
		assertEquals(p.getElement(2, 1), 1);
		assertEquals(p.getElement(2, 2), 1);
		assertEquals(p.getElement(3, 1), 1);
		assertEquals(p.getElement(3, 2), 2);
		assertEquals(p.getElement(3, 3), 1);
		assertEquals(p.getElement(4, 1), 1);
		assertEquals(p.getElement(4, 2), 3);
		assertEquals(p.getElement(4, 3), 3);
		assertEquals(p.getElement(4, 4), 1);
		assertEquals(p.getElement(8, 4), 35);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void depthLT1() {
		p.getElement(-1, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void positionLT1() {
		p.getElement(1, -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void positionGTDepth() {
		p.getElement(6, 7);
	}

}
