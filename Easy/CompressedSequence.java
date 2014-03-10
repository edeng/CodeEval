// Eden Ghirmai, 3/10/2014, www.codeeval.com
// Assuming that someone dictates you a sequence of numbers and you need to write it down.
// For brevity, he dictates it as follows: first says the number of consecutive identical numbers and then
// says the number itself. E.g. The sequence 1 1 3 3 3 2 2 2 2 14 14 14 11 11 11 2 will be dictated as 
// "Two times one, three times three, four times two, three times fourteen, three times eleven, one time two", 
// so you will write down the sequence 2 1 3 3 4 2 3 14 3 11 1 2.
// Compresses a given sequence using this approach 

import java.io.*;
import java.util.*; 

public class CompressedSequence {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] split = in.nextLine().split("[ \t]+"); 
			int temp = 1;
			int prev = Integer.parseInt(split[0]);
			String result = ""; 
			for (int i = 1; i < split.length; i++) {
				int num = Integer.parseInt(split[i]);
				if (prev != num) {
					result += temp + " " + prev + " "; 
					prev = num; 
					temp = 1; 
				} else {
					temp++; 
				}
			}
			
			result += temp + " " + prev; 
			
			System.out.println(result);
		}
    }
}