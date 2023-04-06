package ODD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fail {
	@Test
	public void fail1() {
		int r,sum=0,temp;    
		int n=4254;
		  
		temp=n;    
		while(n>0){    
			  r=n%10;  //getting remainder  
			  sum=(sum*10)+r;    
			  n=n/10;    
		}    
		if(temp==sum) {  
			  assertEquals(temp==sum, true);
			  System.out.println("palindrome number "); 
		}
		else {    
			  System.out.println("not palindrome");  
		}
	}
	
	@Test
	public void fail2() {
		int r,sum=0,temp;    
		int n=4514;
		  
		temp=n;    
		while(n>0){    
			  r=n%10;  //getting remainder  
			  sum=(sum*10)+r;    
			  n=n/10;    
		}    
		if(temp==sum) {  
			  assertEquals(temp==sum, true);
			  System.out.println("palindrome number "); 
		}
		else {    
			  System.out.println("not palindrome");  
		}
	}
	
	@Test
	public void fail3() {
		int r,sum=0,temp;    
		int n=4054;
		  
		temp=n;    
		while(n>0){    
			  r=n%10;  //getting remainder  
			  sum=(sum*10)+r;    
			  n=n/10;    
		}    
		if(temp==sum) {  
			  assertEquals(temp==sum, true);
			  System.out.println("palindrome number "); 
		}
		else {    
			  System.out.println("not palindrome");  
		}
	}
}
