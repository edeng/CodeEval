// Eden Ghirmai, 1/19/2014, www.codeeval.com
// Determines the sum of the first 1000 prime numbers.

public class SumOfPrimes {
    public static void main (String[] args) {
     int sum = 1;
	 int count = 0; 
	 int i = 0; 
    	
		while (count < 1000) {
			i++; 
			if (i % 2 != 0) { // doesn't check if number is even
				if (isPrime(i)) {
					sum += i; 
					count++; 
				}
			}	
		}
		System.out.println(sum); 	
	 }
	
    // Returns whether the given integer is prime
	public static boolean isPrime(int n) {
		for (int i = 3; i * i <= n; i+= 2) {
			if (n % i == 0) {
				return false; 
			}
		}
		return true;
	}
}
