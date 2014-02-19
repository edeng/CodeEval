// Eden Ghirmai, 2/18/14, www.codeeval.com

import java.io.*;
import java.util.*; 

public class FirstNonRepeat {
    public static void main(String[] args) throws FileNotFoundException {
		//File file = new File(args[0]);
    	String file = "yellow\ntooth";
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String result = ""; 
			String line = in.nextLine(); 
			for (int i = 0; i < line.length(); i++) {
				String c = line.charAt(i) + ""; 
				if (!line.substring(0, i).contains(c) && !line.substring(i + 1).contains(c)) {
					result = c; 
					break;
				}
			}
			
			System.out.println(result); 
		}
    }
}