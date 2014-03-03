// Eden Ghirmai, 3/03/2014, www.codeeval.com
// Given a sorted list of numbers with duplicates, 
// prints out the sorted list with duplicates removed.

import java.io.*;
import java.util.*; 

public class UniqueElements {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] nums = in.nextLine().split(",");
			Set<Integer> sorted = new TreeSet<Integer>(); 
			int last = 0; 
			for (int i = 0; i < nums.length; i++) {
				int num = Integer.parseInt(nums[i]);
				sorted.add(num);
				last = num; 
			}
			
			sorted.remove(last); 
			
			
			for (int num : sorted) {
				System.out.print(num + ",");
			}
			
			System.out.print(last); 
			System.out.println(); 
			
		}
		
    }
}