// Eden Ghirmai, 2/18/2016, www.codeeval.com
// Given two integers N and M, calculates N Mod M
// (without using any inbuilt modulus operator).

import java.io.*;
import java.util.*; 

public class NModN {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			String[] nums = line.split(",");
			int first = Integer.parseInt(nums[0]);
			int second = Integer.parseInt(nums[1]);
			int divided = first / second;
			int result = first - (divided * second);
			System.out.println(result); 
		}
    }
}