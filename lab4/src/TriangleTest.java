import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest
{
	@Test
	void testBasicConstructor()
	{
		Triangle t = new Triangle();

		assertTrue(t.isEquilateral());
		assertFalse(t.isIsosceles());
		assertFalse(t.isScalene());
		
		assertEquals(3, t.getPerimeter());

	}

	@Test
	void testEqualConstrutor()

	{
		Triangle t = new Triangle();

		assertTrue(t.isEquilateral());
		assertFalse(t.isIsosceles());
		assertFalse(t.isScalene());
		
		assertEquals(30, t.getPerimeter());

	}
	
	@Test
	void isIsosceles()
	{
		Triangle t = new Triangle(1,2,3);
		assertFalse(t.isIsosceles());
		
		t.setSides(1,2,2);
		assertTrue(t.isIsosceles());
		
		t.setSides(2,2,2);
		assertFalse(t.isIsosceles());
		
	}
	
	@Test
	void isEquilateral()
	{
		Triangle t = new Triangle(1,2,3);
		assertFalse(t.isEquilateral());
		
		t.setSides(1,2,2);
		assertFalse(t.isEquilateral());
		
		t.setSides(2,2,2);
		assertTrue(t.isEquilateral());
		
	}
	
	@Test
	void isScalene()
	{
		Triangle t = new Triangle(1,2,3);
		assertTrue(t.isScalene());
		
		t.setSides(1,2,2);
		assertFalse(t.isScalene());
		
		t.setSides(2,2,2);
		assertFalse(t.isScalene());
		
	}
	
	@Test
	void setSides()
	{
		Triangle t = new Triangle(1,1,1);
		
		assertTrue(t.isEquilateral());
		
	}
	
	@Test
	void getPerimeter()
	{
		Triangle t = new Triangle(10,20,30);
		
		assertEquals(60, t.getPerimeter());
		
		t.setSides(10,20,20);
		assertEquals(50, t.getPerimeter());
		
		
	}
	
	@Test
	void gerAverageLength()
	{
		Triangle t = new Triangle(10,20,30);
		
		assertEquals((10+20+30)/3, t.getAverageLength());
	}
	
	
	
}
