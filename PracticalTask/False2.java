package PracticalTask;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class False2 {
	@Test
	public void testSetup() {
		int n = 90;
		boolean flag = true;
		if(n > 500 || n < 100) flag = false;
		assertEquals(false, flag); 
	}
}
