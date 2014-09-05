import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
  		File file = new File(args[0]);
  		Scanner in = new Scanner(file);
  		
  		while(in.hasNextLine()) {
  			String line = in.nextLine();
  			System.out.println(toRollerCoaster(line));
		  }
    }

    public static String toRollerCoaster(String line) {
    	line = line.toLowerCase(); 
    	String result = ""; 
    	boolean cap = true; 
    	for (int i = 0; i < line.length(); i++) {
    		char c = line.charAt(i); 
    		String letter = c + ""; 
    		if (isLetter(c) && cap) {
    			result += letter.toUpperCase(); 
    			cap = false; 
    		} else if (isLetter(c)) {
    			result += letter.toLowerCase(); 
    			cap = true; 
    		} else {
    		    result += letter; 
    		}
    	}

    	return result; 
    }
    
    public static boolean isLetter(char c) {
        return c <= 'z' && c >= 'a'; 
    }
}
