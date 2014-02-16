// Eden Ghirmai, 2/16/2014, www.codeeval.com
// Given a positive integer, finds the sum of its constituent digits.

import java.util.*;
import java.io.*;

public class SumOfDigits {
    public static void main (String[] args) throws FileNotFoundException {
    
    File file = new File(args[0]);
    Scanner lines = new Scanner(file); 
     
	 while (lines.hasNextLine()) {
	 	String line = lines.nextLine();
		Scanner lineScan = new Scanner(line); 
		while (lineScan.hasNextInt()) {
			int num = lineScan.nextInt(); 
			int sum = 0; 
			while (num != 0) {
				sum += num % 10; 
				num /= 10; 
			}
			
			System.out.println(sum); 
		}
	 }
  }
}