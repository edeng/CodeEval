// Eden Ghirmai, 3/05/2014, www.codeeval.com
// Prints the amount of bytes in a given file 

import java.io.*; 

public class FileSize {
    public static void main(String[] args) throws FileNotFoundException {
    	File file = new File(args[0]);
		System.out.println(file.length()); 
    }
}