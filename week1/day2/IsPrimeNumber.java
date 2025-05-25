package week1.day2;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		
		int n = 19;
		boolean prime = true;
		
		if (n <= 1) {
			prime = false;
		}
		
		for(int i = 2; i < n; i++) {
			if(i % n == 0) {
				prime =false;
			}
		}
		
		if(prime) {
			System.out.println(n+ " is a prime number");
		}
		else {
			System.out.println(n+ " is not a prime number");
		}
		
	}

}
