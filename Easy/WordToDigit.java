// Eden Ghirmai, 3/08/2014, www.codeeval.com
// Given a string representation of a set of numbers 
// Prints them as integers 

import java.io.*;
import java.util.*; 

public class WordToDigit {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] nums = in.nextLine().split(";"); 
			String[] rep = {"zero", "one", "two", "three", "four", "five", "six",
							"seven", "eight", "nine"};
			for (int i = 0; i < nums.length; i++) {
				System.out.print(indexOf(nums[i], rep));
			}
			System.out.println(); 
		}
    }
    
    // returns the integer representation of the given 
    // string representation of a number 
    public static int indexOf(String num, String[] rep) {
    	for (int i = 0; i < rep.length; i++) {
    		if (num.equals(rep[i])) {
    			return i; 
    		}
    	}
    	return -1; 
    }
}