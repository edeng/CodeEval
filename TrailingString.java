// Eden Ghirmai, 2/18/2016, www.codeeval.com
// You are given two strings 'A' and 'B'. Print out a 1 if
// string 'B' occurs at the end of string 'A'. Else a zero.

import java.io.*;
import java.util.*; 

public class TrailingString {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String[] split = line.split(","); 
			String phrase = split[0].trim(); 
			String end = split[1].trim(); 
			if (end.length() > phrase.length()) {
				System.out.println(0); 
			} else {
				String current = phrase.substring(phrase.length() - end.length());
				if(current.equals(end)) {
					System.out.println(1);
				} else {
					System.out.println(0); 
				}				
			}
		}
    }
}