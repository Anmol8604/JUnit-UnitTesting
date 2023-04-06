package ODD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class pass {
	@Test
	public void Pass1() {
		int r,sum=0,temp;    
		int n=454;
		  
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
	public void Pass2() {
		int r,sum=0,temp;    
		int n=4554;
		  
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
	public void Pass3() {
		int r,sum=0,temp;    
		int n=9119;
		  
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
	public void Pass4() {
		int r,sum=0,temp;    
		int n=9449;
		  
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
	public void Pass5() {
		int r,sum=0,temp;    
		int n=1111;
		  
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
