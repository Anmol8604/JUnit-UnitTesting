package PracticalTask4;

import java.util.ArrayList;

public class Java {
	static boolean check(String user, String pwd) {
		if(user.equals("Administrator")) {
			System.out.println("User name is correct");
			boolean flag = checkPwd(pwd);
			
			if(flag == true) {
				return true;
			}
			return false;
			
		}
		else {
			System.out.println("User name is in-correct");
			System.out.println("So, No need to check password");
		}
		return false;
	}
	static boolean checkPwd(String pwd) {
		if(pwd.length() == 8) {
			
			boolean var2 = pwd.matches("[a-zA-Z0-9]+");
			System.out.println("Password" + var2);		
			
			if(var2 == true) {
				System.out.println("Passward accepted");
				return true;
			}
			else {
				System.out.println("Passward not accepted");
				return false;
			}
		}
		return false;
	}
}
