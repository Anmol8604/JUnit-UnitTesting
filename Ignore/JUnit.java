package Ignore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnit {
	
	public String message = "Anmol";
	
	Java Message = new Java(message);
	
	@Test
	public void testJUnitMessage() {
		System.out.println("Junit Message is printing");
		assertEquals(message, Message.printMessage());
	}
	
	@Test
	public void testJUnitHiMessage() {
		message="Hi!" +message;
		System.out.println("Junit Hi Message is printing ");
		assertEquals(message, Message.printHiMessage());
	}

}