// Eden Ghirmai, 2/18/2016, www.codeeval.com
// Removes specific characters from a string.

import java.io.*;
import java.util.*; 

public class RemoveCharacters {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] split = in.nextLine().split(",");
			String phrase = split[0].trim();
			String characters = split[1].trim();
			String result = ""; 
			for (int i = 0; i < phrase.length(); i++) {
				String c = "" + phrase.charAt(i); 
				if(!characters.contains(c)) 
					result += c; 
			}
			
			System.out.println(result.trim()); 
		}
    }
}
