// Eden Ghirmai, 2/18/2016, www.codeeval.com
// Given two integers N and M, count the number of prime numbers
// between N and M (both inclusive)

import java.io.*;
import java.util.*; 

public class CountingPrimes {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] nums = in.nextLine().split(",");
			int first = Integer.parseInt(nums[0]);
			int second = Integer.parseInt(nums[1]);
			int count = 0;
			
			for(int i = first; i <= second; i++) {
				if (isPrime(i)) {
					count++; 
				}
			}
			
			System.out.println(count);
		}
    }
    
    // returns whether the given integer is prime
    public static boolean isPrime(int n) {
    	for (int i = 2; i <= n / 2; i++) {
    		if (n % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}