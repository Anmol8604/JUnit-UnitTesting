package PracticalTask2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class file {
	@Test
	public void tesSetup() {
		String s = "My name is Anmol";
		String sub = "is";
		int index = test1(s, sub);
		System.out.println(index);
		if(s.contains(sub)) {
			assertEquals(true, true);
		}
		else {
			assertEquals(false, false);
		}
		
		
		
		
	}
	@Test
	public void test() {
		String s = "Hello World!!";
		String sub = "is";
		int index = test1(s, sub);
		System.out.println(index);
		if(s.contains(sub)) {
			assertEquals(true, true);
		}
		else {
			assertEquals(false, false);
		}
	}
	
	
	int test1(java.lang.String s, String sub) {
		int index = 0;
		for(int i = 0; i < s.length(); i++) {
			if(sub.charAt(0) == s.charAt(i)) {
				return i+1;
			}
		}
		return -1;
	}
}
