package PracticleTask3;

public class UID {
	
	static boolean checkUID(String message) {
		if(message.charAt(0) == '_') {
			System.out.println("Username accepted");
			return true;
		}
		System.out.println("Username not accepted");
		return false;
	}
	
}
