// Eden Ghirmai, 2/16/2014, www.codeeval.com
// Given a string of words and digits divided by comma
// Separates words with digits without changing the order elements

import java.io.*;
import java.util.*; 

public class MixedContent {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			List<String> words = new ArrayList<String>();
			List<String> numbers = new ArrayList<String>(); 
			String line = in.nextLine(); 
			String[] all = line.split(",");
			
			for (int i = 0; i < all.length; i++) {
				String s = all[i];
				if(isInteger(s)) {
					numbers.add(s); 
				} else {
					words.add(s); 
				}
			}
			
			if (words.size() > 0) {
				System.out.print(words.get(0));
				for (int i = 1; i < words.size(); i++) {
					System.out.print("," + words.get(i));
				}
			}
			
			if (words.size() > 0 && numbers.size() > 0) {
				System.out.print("|");
			}
			
			if(numbers.size() > 0) {
				System.out.print(numbers.get(0));
				for (int i = 1; i < numbers.size(); i++) {
					System.out.print("," + numbers.get(i));
				}
			}
		}
    }
    
    public static boolean isInteger(String s) {
    	try {
    		Integer.parseInt(s);
    	} catch(NumberFormatException e) {
    		return false;
    	}
    	return true; 
    }
}
