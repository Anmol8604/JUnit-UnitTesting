package PracticalTest3;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;

public class LoginTest {
		
    @Test
    public void test1() {
        assertTrue(Login.check("username", "password@123"));
    }
    
	@Test
    public void test2() {
        assertTrue(Login.check("User1", "checkforpass!@#567"));
    }

	@Ignore
    @Test
    public void testIgnore1() {
        assertTrue(Login.check("validuserid", "validpass@123"));
    }

	@Before
    @Test
    public void test3() {
        assertTrue(Login.check("validuserid", "validpass@123"));
    }

    @Test
    public void test4() {
        assertTrue(Login.check("Hello123", "testcases198&"));
    }

    @Test
    public void test5() {
        assertTrue(Login.check("Username", "123@password"));
    }

    @Ignore ("not yet ready , Please ignore.")
    @Test
    public void testIgnore2() {
        assertTrue(Login.check("   ", "OnlyPass"));
    }
    
    @After
    @Test
    public void test11() {
        assertFalse(Login.check("Allcasespassed", "ThatisTrue"));
    }

    @Ignore
    @Test
    public void testIgnore11() {
        assertFalse(Login.check("   ", ""));
    }

    @Test
    public void test12() {
        assertFalse(Login.check("user123@#@", "XYZxyz"));
    }

    @Test
    public void test13() {
        assertFalse(Login.check("UserName", "Pass"));
    }
    
    @Ignore ("not yet ready , Please ignore.")
    @Test
    public void testIgnore21() {
    assertFalse(Login.check("Ignore me", "         "));
    }

    @Test
    public void test14() {
        assertFalse(Login.check("Namename", "Passswwwooorrddd"));
    }

    @Test
    public void test15() {
        assertFalse(Login.check("true", "Hello123"));
    }
}