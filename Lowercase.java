// Eden Ghirmai, 1/19/2014, www.codeeval.com
// Given a string, converts it into lowercase

import java.util.*;
import java.io.*;

public class Lowercase {
    public static void main (String[] args) throws FileNotFoundException {    
        File file = new File(args[0]);
        Scanner words = new Scanner(file);
     
	 	while (words.hasNextLine()) {
	 		String line = words.nextLine(); 
			line = line.toLowerCase();
			System.out.println(line); 
        }
    }
}
