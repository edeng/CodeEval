import java.util.*;
import java.io.*;

public class ValidParentheses {
    public static void main (String[] args) throws FileNotFoundException {
     File file = new File(args[0]);
     Scanner lines = new Scanner(file); 
     
	 while (lines.hasNextLine()) {
	 	String line = lines.nextLine(); 
        if (isValid(line)) {
            System.out.println("True"); 
        } else {
            System.out.println("False"); 
        }
	 }
  }
  
    public static boolean isValid(String line) {
        Stack<Character> s = new Stack<Character>(); 
        
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i); 
            if (isOpening(c)) {
                s.push(c); 
            } else if (s.isEmpty() || !isPair(s.pop(), c)) {
                return false; 
            }
        }
        
        return s.isEmpty(); 
    }
    
    public static boolean isPair(char open, char closed) {
        if (open == '[') {
            return closed == ']'; 
        } else if (open == '{') {
            return closed == '}';
        } else {
            return closed == ')';
        }
    }
    
    public static boolean isOpening(char c) {
        return c == '(' || c == '[' || c == '{'; 
    }
}
