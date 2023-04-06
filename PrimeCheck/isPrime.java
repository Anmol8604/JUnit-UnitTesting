package PrimeCheck;

public class isPrime {
	public boolean primeCHeck(int a, boolean b) {
		if(a <= 1) {
			return true==b;
		}
		for(int i = 2; i*i < a; i++) {
			if(a%i == 0) {
				return true==b;
			}
		}
		return true==b;
	}
}
