package Example2;

import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.notification.Failure;

public class Code {
	@Test
	public void testassert() {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "test";
		String str4 = "test";
		String str5 = null;
		
		int var1 = 2;
		int var2 = 3;
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		assertEquals(str1, str2);
		assertEquals(str3, str4);
		assertSame(str3, str4);
		assertNotSame(str4, str1);
		assertNotNull(str1);
		assertNull(str5);
		assertTrue(var1<var2);
		assertArrayEquals(arr1, arr2);
		if(arr1.length == arr2.length) {
			for(int i = 0; i < arr1.length; i++) {
				assertEquals(arr1[i], arr2[i]);
			}
		}
		assertArrayEquals(arr1, arr2);
		
	}
	
	// Assert Statements
	
}
