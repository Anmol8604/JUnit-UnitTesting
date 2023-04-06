package CA1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Pass1 {
	@Test
	public void testSetup() {
		double a = 1;
		double b = -2;
		double c = 1;
		calculateRoots(a, b, c);
	}
	
	void calculateRoots(double a, double b, double c)  
	{  
		double d = b * b - 4 * a * c;  
		double sqrtval = Math.sqrt(Math.abs(d)); 
		if (d == 0 || d > 0)   
		{  
			assertEquals(true, d==0 || d > 0);
			System.out.println("The roots of the equation are real. \n" + "Where a = " + a + ", b = " + b + ", c = " + c);  
		}  
		// executes if d < 0  
		else   
		{  
			assertEquals(false, d==0);
			System.out.println("The roots of the equation are complex and different. \n" + "Where a = " + a + ", b = " + b + ", c = " + c);    
		} 
	}

}
