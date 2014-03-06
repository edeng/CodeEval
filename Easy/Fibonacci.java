// Eden Ghirmai, 3/05/2014, www.codeeval.com
// Reads numbers and prints out the nth fibonacci number

import java.io.*;
import java.util.*; 

public class Fibonacci {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			int num = Integer.parseInt(in.nextLine());
			System.out.println(solve(num));
		}
    }
    
    // calculates and returns the given nths fibonacci number
    public static int solve(int n) {
    	if (n <= 1) 
    		return n;
    	else
    		return solve(n-1) + solve(n-2);	
    }
}