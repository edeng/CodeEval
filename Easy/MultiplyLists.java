// Eden Ghirmai, 3/02/2014, www.codeeval.com
// Takes 2 lists of integers and multiplies corresponding elements in the lists

import java.io.*;
import java.util.*; 

public class MultiplyLists {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			String[] both = line.split("\\|");
			String[] left = both[0].trim().split("[ \t]+");
			String[] right = both[1].trim().split("[ \t]+");
			String result = ""; 
			for (int i = 0; i < left.length; i++) {
				int num1 = Integer.parseInt(left[i]);
				int num2 = Integer.parseInt(right[i]);
				result += num1 * num2 + " "; 
			}
			
			System.out.println(result); 	
		}
    }
}