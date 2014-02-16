// Eden Ghirmai, 2/16/2015, www.codeeval.com
// Determines the Mth to last element of a list. 

import java.io.*;
import java.util.*; 

public class MthToLast {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String[] all = line.split("[ \t]+");
			String strIndex = all[all.length - 1];
			int index = Integer.parseInt(strIndex); 
			if (index < all.length) {
				String element = all[all.length - index - 1];
				System.out.println(element);
			}
		}
    }
}