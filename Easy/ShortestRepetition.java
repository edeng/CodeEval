// Eden Ghirmai, 3/24/2014, www.codeeval.com
// Determines the shortest repetition in a string. 
// Prints out the smallest period of the input string.

import java.io.*;
import java.util.*; 

public class ShortestRepetition {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			int count = find(line);
			
			if (count == -1)
				System.out.println(line.length());
			else 
				System.out.println(count); 
				
		}
    }
    
    public static int find(String line) {
    	int count = 1; 
    	for(int i = 0; i < line.length() - count; i++) {
    		String first = line.substring(0, count); 
    		String second = line.substring(count, count + count);
    		if (first.equals(second)) {
    			return count; 
    		}	
    		count++; 
    	}
    	return -1; 
    }
}