package Example3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFirst {
	@Test
	public void testSetup() {
		String name1 = "My name is : Anmol";
		String name2 = "My name is : Anmol";
		assertEquals(name2, name1);
	}
}
