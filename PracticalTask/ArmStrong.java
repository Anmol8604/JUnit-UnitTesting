package PracticalTask;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArmStrong {
	@Test
	public void armStrong() {
		int a1 = 153;
		assertEquals(true, runA1(a1));
		
		int a2 = 370;
		assertEquals(true, runA2(a2));
		
		int a3 = 371;
		assertEquals(true, runA3(a3));
		
		int a4 = 407;
		assertEquals(true, runA4(a4));
		
		int a5 = 121;
		assertEquals(false, runA5(a5));
		
	}
	static boolean runA1(int a1) {
		boolean flag  = false;
		int temp = a1;
		String s = "" + temp;
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			int a = temp%10;
			res += Math.pow(a, s.length());
			temp /= 10;
		}
		if(res == a1) flag = true;
		return flag;
	}
	static boolean runA2(int a2) {
		boolean flag  = false;
		int temp = a2;
		String s = "" + temp;
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			int a = temp%10;
			res += Math.pow(a, s.length());
			temp /= 10;
		}
		if(res == a2) flag = true;
		return flag;
	}
	static boolean runA3(int a3) {
		boolean flag  = false;
		int temp = a3;
		String s = "" + temp;
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			int a = temp%10;
			res += Math.pow(a, s.length());
			temp /= 10;
		}
		if(res == a3) flag = true;
		
		return flag;
	}
	static boolean runA4(int a4) {
		boolean flag  = false;
		int temp = a4;
		String s = "" + temp;
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			int a = temp%10;
			res += Math.pow(a, s.length());
			temp /= 10;
		}
		if(res == a4) flag = true;
		return flag;
	}
	static boolean runA5(int a5) {
		boolean flag  = false;
		int temp = a5;
		String s = "" + temp;
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			int a = temp%10;
			res += Math.pow(a, s.length());
			temp /= 10;
		}
		if(res == a5) flag = true;
		return flag;
	}
}
