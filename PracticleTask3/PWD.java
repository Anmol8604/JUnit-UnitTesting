package PracticleTask3;

import java.util.ArrayList;

public class PWD {
	
	static boolean checkPwd(String password) {
		if(password.length() < 8) {
			System.out.println("Passward not accepted");
			return false;
		}
		ArrayList<Character> list1 = new ArrayList<>();
		list1.add('!');
		list1.add('@');
		list1.add('#');
		list1.add('$');
		list1.add('%');
		list1.add('^');
		list1.add('&');
		list1.add('*');
		list1.add('(');
		list1.add(')');
		
		ArrayList<Character> list2 = new ArrayList<>();
		list2.add('0');
		list2.add('1');
		list2.add('2');
		list2.add('3');
		list2.add('4');
		list2.add('5');
		list2.add('6');
		list2.add('7');
		list2.add('8');
		list2.add('9');
		
		boolean var1 = false;
		boolean var2 = false;
		
		for(int i = 0; i < password.length(); i++) {
			if(list1.contains(password.charAt(i))) var1 = true;
			else if(list2.contains(password.charAt(i))) var2 = true;
		}
		
		if(var1 == true && var2 == true) {
			System.out.println("Passward accepted");
			return true;
		}
		
		System.out.println("Passward not accepted");
		return false;
	}
}
