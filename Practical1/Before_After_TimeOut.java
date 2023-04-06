package Practical1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Before_After_TimeOut {
	private ArrayList<String> list;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Using @BeforeClass, Executed before all test calsses");
	}
	
	@Before
	public void m2() {
		list = new ArrayList<>();
		System.out.println("Using @Before annotation, Executed before each test calsses");
	}
	
	@AfterClass
	public static void m3() {
		System.out.println("Using @AfterClass, Executed after all test calsses");
	}
	
	@After
	public void m4() {
		System.out.println("Using @After annotation, Executed After each test calsses");
	}
	
	@Test
	public void m5() {
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		System.out.println("m5 method");
	}
	
	@Ignore
	public void m6() {
		list.add("ad");
	}
	
	@Test(timeout = 5)
	public void m7() {
		System.out.println("Using @Test(timeout) annotation, ");
	}
	
	@Ignore
	@Test(expected = NoSuchMethodException.class)
	public void m8() {
		
	}
	
}
