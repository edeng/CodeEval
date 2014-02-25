// Eden Ghirmai, 2/18/2016, www.codeeval.com
// You are given two strings 'A' and 'B'. Print out a 1 if
// string 'B' occurs at the end of string 'A'. Else a zero.

import java.io.*;
import java.util.*; 

public class FizzBuzz {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String[] split = line.split(" ");
			int first = Integer.parseInt(split[0]);
			int second = Integer.parseInt(split[1]);
			int third = Integer.parseInt(split[2]);
			String result = ""; 
			
			for (int i = 1; i <= third; i++) {
				if (i % first == 0 && i % second == 0) {
					result += "FB "; 
					System.out.print("FB "); 
				} else if (i % first == 0) {
					result += "F "; 
				} else if (i % second == 0) {
					result += "B ";
				} else {
					result += i + " "; 
				}
			}
			
			System.out.println(result); 
		}
    }
}
