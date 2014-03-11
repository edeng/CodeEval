// Eden Ghirmai, 3/11/2014, www.codeeval.com
// Given a random string containing hidden and visible digits.
// The digits are hidden behind lower case latin letters as follows: 0 is behind 'a', 
// 1 is behind ' b ' etc., 9 is behind 'j'. Any other symbol in the string means nothing
// and has to be ignored. Finds all visible and hidden digits in the string and 
// prints them out in order of their appearance.

import java.io.*;
import java.util.*; 

public class HiddenDigits {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			String result = "";
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i); 
				if (c >= 'a' && c <= 'j') {
					result += c - 'a'; 
				} else if (c >= '0' && c <= '9') {
					result += c; 
				}
			}
			
			if (result.equals("")) {
				System.out.println("NONE");
			} else {
				System.out.println(result);
			}
		}
    }
}