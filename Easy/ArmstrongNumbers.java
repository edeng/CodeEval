// Eden Ghirmai, 3/09/2014, www.codeeval.com
// An Armstrong number is an n-digit number that is equal to the 
// sum of the n'th powers of its digits. 
// Determines if the input numbers are Armstrong numbers.

import java.io.*;
import java.util.*; 

public class ArmstrongNumbers {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String num = in.nextLine(); 
			int sum = 0; 
			for (int i = 0; i < num.length(); i++) {
				int digit = Integer.parseInt(num.charAt(i) + "");
				double powered = Math.pow(digit, num.length());
				sum += powered; 
			}
			
			if (sum == Integer.parseInt(num)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
    }      
}