package PracticleTask3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	
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
	
	@Before
	public void m4() {
		System.out.println("Test case Executed \n");
	}
	
	@Test
	public void test1() {
		String uid = "_Anmol279";
		String pwd = "@user123";
		
		assertTrue(UID.checkUID(uid));
		assertTrue(PWD.checkPwd(pwd));
	}
	
	@Test
	public void test2() {
		String uid = "Anmol279";
		String pwd = "@user123";
		
		assertFalse(UID.checkUID(uid));
		assertTrue(PWD.checkPwd(pwd));
	}
	
	@Test
	public void test3() {
		String uid = "Anmol279";
		String pwd = "@usr123";
		
		assertFalse(UID.checkUID(uid));
		assertFalse(PWD.checkPwd(pwd));
	}
	
	@Test
	public void test4() {
		String uid = "Anmol279";
		String pwd = "@user123";
		
		assertFalse(UID.checkUID(uid));
		assertTrue(PWD.checkPwd(pwd));
	}
}
