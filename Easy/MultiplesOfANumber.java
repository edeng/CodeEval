// Eden Ghirmai, 3/14/2014, www.codeeval.com
// Given numbers x and n, where n is a power of 2, print out the smallest multiple of n
// which is greater than or equal to x. 
// Does not use division or modulo operator.

import java.io.*;
import java.util.*; 

public class MultiplesOfANumber {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] both = in.nextLine().split(","); 
			int first = Integer.parseInt(both[0]);
			int second = Integer.parseInt(both[1]);
			int total = 0;
			
			while (total < first) {
				total += second; 
			}
			
			System.out.println(total); 
		}
    }
}
			
			