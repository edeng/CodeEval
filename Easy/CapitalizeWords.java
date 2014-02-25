// Eden Ghirmai, 2/16/2014, www.codeeval.com
// Capitalizes the first letter of each word in a sentence.

import java.util.*;
import java.io.*;

public class CapitalizeWords {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
            String result = ""; 
    	    String line = in.nextLine(); 
            Scanner lineScan = new Scanner(line); 
            while(lineScan.hasNext()) {
                String word = lineScan.next(); 
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
            }
            
            System.out.println(result.trim()); 
		}
	}
}
