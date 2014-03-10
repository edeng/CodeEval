// Eden Ghirmai, 3/10/2014, www.codeeval.com
// Given a set of rows with names of famous writers encoded inside.
// Each row is divided into 2 parts by pipe char (|). The first part has a writer's name.
// The second part is a "key" to generate a name.
// Goes through each number in the key (numbers are separated by space) left-to-right.
// Each number represents a position in the 1st part of a row.
// Then collects a writer's name then outputs it 

import java.io.*;
import java.util.*; 

public class FindAWriter {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] both = in.nextLine().split("\\|");
			String word = both[0]; 
			String result = ""; 
			String[] code = both[1].trim().split("[ \t]+"); 
			for (int i = 0; i < code.length; i++) {
				int index = Integer.parseInt(code[i]) - 1;
				result += word.charAt(index) + ""; 
			}
			
			System.out.println(result); 
		}
    }
}