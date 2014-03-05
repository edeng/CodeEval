// Eden Ghirmai, 3/05/2014, www.codeeval.com
// Give the coordinates of 2 points, finds the distance between them.

import java.io.*;
import java.util.*; 

public class CalculateDistance {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			Scanner lineScan = new Scanner(in.nextLine()); 
			String point1 = lineScan.next() + " " + lineScan.next(); 
			String point2 = lineScan.next() + " " + lineScan.next(); 
			
			int x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
			int y1 = Integer.parseInt(point1.substring(point1.indexOf(",") + 2, point1.length() - 1)); 
			
			int x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
			int y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 2, point2.length() - 1));
			
			double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			
			System.out.println(((int)distance));
		}
    }
}