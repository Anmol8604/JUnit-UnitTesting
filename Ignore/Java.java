package Ignore;

public class Java {
	
	private String message;
	
	public Java(String message) {
		this.message = message;
	}

	public String printMessage(){
		System.out.println(message);
		return message;
	}

	public String printHiMessage(){
		message = "Hi!"+ message;
		System.out.println(message);
		return message;
	}
}
