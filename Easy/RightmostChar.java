// Eden Ghirmai, 2/16/2014, www.codeeval.com
// Given a string 'S' and a character 't'.
// Prints out the position of the rightmost occurrence of 't' (case matters) in 'S' 
// or -1 if there is none. 
// The position to be printed out is zero based.

import java.io.*;
import java.util.*; 

public class RightmostChar {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String sentance = line.substring(0, line.length() - 2);
			char c = line.charAt(line.length() - 1);
			int index = -1; 
			for (int i = 0; i < sentance.length(); i++) {
				if (c == sentance.charAt(i)) {
					index = i; 
				}
			}
			
			System.out.println(index); 
		}
    }
}
