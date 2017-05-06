package world;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {

	@Test
	public void test() {
		triangle triangle=new triangle(4,5,6);
		//boolean result=triangle.isTriangle();
		double angle=triangle.getAngle(4);
	assertEquals(41.40962210927086, angle,0);
		
		
	}
	@Test
	public void Test5() {
		triangle triangle=new triangle(17,17,30);
		//boolean result=triangle.isTriangle();
		double angle=triangle.getAngle(17);
	assertEquals(28.07248693585296, angle,0);
		
		
	}
	@Test
	public void negativeValuesTest() {
		triangle triangle=new triangle(-150,30,120);
		boolean result=triangle.isTriangle();
		assertEquals(false,result);
		
	}
	@Test
	public void invalidEdge() {
		triangle triangle=new triangle(17,17,30);
		//boolean result=triangle.isTriangle();
		double angle=triangle.getAngle(10);
	assertEquals(0, angle,0);
		
		
}
}
