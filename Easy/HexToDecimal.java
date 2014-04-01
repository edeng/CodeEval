// Eden Ghirmai, 3/24/2014, www.codeeval.com
// converts the given hex to decimal form

import java.io.*;
import java.util.*; 

public class HexToDecimal {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while(in.hasNextLine()) {
			String hex = in.nextLine(); 
			System.out.println(Integer.parseInt(hex, 16));
		}
    }
}
