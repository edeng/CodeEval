// Eden Ghirmai, 3/05/2014, www.codeeval.com
// Prints out the sum of integers read from a file.

import java.io.*;
import java.util.*; 

public class SumOfIntegersFromFile {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		int sum = 0; 
		while(in.hasNextLine()) {
			sum += Integer.parseInt(in.nextLine());
		}
		System.out.println(sum);
    }
}