// Eden Ghirmai, 1/19/2014, www.codeeval.com
// Reads a multiple line text file and write the 'N' longest lines to stdout.
// Where the file to be read is specified on the command line.


import java.util.*;
import java.io.*;

public class LongestLines {
    public static void main (String[] args) throws FileNotFoundException {
    File file = new File(args[0]);
     Scanner lines = new Scanner(file); 
	 int max = lines.nextInt(); 
	 String first = lines.nextLine(); 
	 List<String> words = new ArrayList<String>();
	 words.add(first);  
	 
	 while (lines.hasNextLine()) {
	 	String current = lines.nextLine(); 
		for (int i = 0; i < words.size(); i++) {
			if (current.length() > words.get(i).length()) {
				words.add(i, current); 
				break;
			}
			
			if (current.length() <= words.get(words.size() - 1).length()) {
				words.add(current); 
				break;
			}
			
		}
	 }
	 
	 for (int j = 0; j < max; j++) {
	 	System.out.println(words.get(j));
	 }
  }
}
