package PracticalTest3;

import java.util.Scanner;
public class Login {
    public boolean authenticate;

    public static boolean check(String userID, String password) {

            if(userID.charAt(0) == '0' || userID.charAt(0) == '1' || userID.charAt(0) == '2' || userID.charAt(0) == '3' || userID.charAt(0) == '4' || userID.charAt(0) == '5' || userID.charAt(0) == '6' || userID.charAt(0) == '7' || userID.charAt(0) == '8' || userID.charAt(0) == '9') {
                return false;
            }
            if(userID.charAt(0) == '!' || userID.charAt(0) == '@' || userID.charAt(0) == '#' || userID.charAt(0) == '$' || userID.charAt(0) == '%' || password.charAt(0) == '^' || userID.charAt(0) == '&' || userID.charAt(0) == '*') {
                return false;
            }
            if(userID.contains(" ")) {
                return false;
            }
            if(password.length() < 8) {
                return false;
            }
            if(!password.matches(".*\\d.*")) {
                return false;
            }
            if(!password.matches(".*[@#$%&+=].*")) {
                return false;
            }
            return true;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter UserID : ");
            String userID = sc.next();

            System.out.print("Enter Password : ");
            String password = sc.next();
            
            System.out.println(check(userID, password));
        }
}

