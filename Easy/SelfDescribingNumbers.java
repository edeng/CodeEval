// Eden Ghirmai, 3/24/2014, www.codeeval.com
// A number is a self-describing number when (assuming digit positions are labeled 0 to N-1),
// the digit in each position is equal to the number of times that that digit appears in the number.
// Prints "1" if given a self-describing number, otherwise prints "0"

import java.io.*;
import java.util.*; 

public class SelfDescribingNumbers {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			if (isSelfDescribing(in.nextLine())) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
    }
    
    public static boolean isSelfDescribing(String line) {
    	for (int i = 0; i < line.length(); i++) {
    		int amount = Integer.parseInt(line.charAt(i) + "");
    		int count = 0; 
    		for (int j = 0; j < line.length(); j++) {
    			if((line.charAt(j) + "").equals(i + "")) 
    				count++;
    		}
    		
    		if (count != amount)
    			return false; 
    	}
    	return true;
    }
}