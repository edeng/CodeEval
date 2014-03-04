// Eden Ghirmai, 3/04/2014, www.codeeval.com
// Sorts a given list of numbers while maintaining leading zeros

import java.io.*;
import java.util.*; 

public class SimpleSorting {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] all = in.nextLine().trim().split("[ \t]+");
			Map<Double, String> map = new TreeMap<Double, String>(); 
			for (int i = 0; i < all.length; i++) {
				double num = Double.parseDouble(all[i]);
				String numString = all[i]; 
				map.put(num,  numString); 
			}
						
			for (double num : map.keySet()) {
				System.out.print(map.get(num) + " " );
			}
			
			System.out.println(); 
		}
    }
}