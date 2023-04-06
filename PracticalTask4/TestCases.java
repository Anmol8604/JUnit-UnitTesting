package PracticalTask4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCases {
	
	@BeforeClass
	public static void m1() {
		System.out.println("Using @BeforeClass, Executed before all test calsses");
	}
	
	@AfterClass
	public static void m2() {
		System.out.println("Using @AfterClass, Executed After all test calsses");
	}
	
	@Before
	public void m3() {
		System.out.println("Test case Execution Start");
	}
	
	@After
	public void m4() {
		System.out.println("Test case Executed \n");
	}
	
	@Test
	public void test1() {
		String uid = "Administrator";
		String pwd = "user1234";
		
		assertTrue(Java.check(uid, pwd));
	}
	
	@Test
	public void test2() {
		String uid = "Administrator";
		String pwd = "user12@4";
		
		assertFalse(Java.check(uid, pwd));
	}
	
	@Test
	public void test3() {
		String uid = "Anmol279";
		String pwd = "@usr123";
		
		assertFalse(Java.check(uid, pwd));
	}
}
