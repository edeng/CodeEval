// Eden Ghirmai, 3/24/2014, www.codeeval.com
// Given a number n and two integers p1,p2 determines if the bits in position
// p1 and p2 are the same or not. Positions p1 and p2 and 1 based.


import java.io.*;
import java.util.*; 

public class BitPositions {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while(in.hasNextLine()) {
			String[] split = in.nextLine().split(",");
			int n = Integer.parseInt(split[0]);
			int p1 = Integer.parseInt(split[1]);
			int p2 = Integer.parseInt(split[2]);
			
			if (((n >> (p1-1))&1) == ((n >> (p2-1))&1)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
    }
}