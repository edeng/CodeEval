// Eden Ghirmai, 2/20/14, www.codeeval.com
// Finds the missing alphabets	

import java.io.*;
import java.util.*; 

public class Panagrams {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String result = ""; 
			String line = in.nextLine().toLowerCase();
			String letters = "abcdefghijklmnopqrstuvwxyz";
			for (int i = 0; i < letters.length(); i++) {
				String c = letters.charAt(i) + "";
				if (!line.contains(c)) {
					result += c; 
				}
			}
			
			if(result.isEmpty()) {
				System.out.println("NULL");
			} else {
				System.out.println(result);
			}
		}
    }
}