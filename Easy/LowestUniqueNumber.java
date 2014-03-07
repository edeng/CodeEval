// Eden Ghirmai, 3/07/2014, www.codeeval.com
// There is a game where each player picks a number from 1 to 9, writes it on a paper 
// and gives to a guide. A player wins if his number is the lowest unique. 
// We may have 10-20 players in our game.

import java.io.*;
import java.util.*; 

public class LowestUniqueNumber {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			Map<Integer, Integer> counts = new HashMap<Integer, Integer>(); 
			String[] allNums = in.nextLine().split("[ \t]+");
			for (int i = 0; i < allNums.length; i++) {
				int num = Integer.parseInt(allNums[i]);
				if (counts.containsKey(num)) {
					counts.put(num, counts.get(num) + 1);
				} else {
					counts.put(num,  1);
				}
			}
			
			int min = Integer.MAX_VALUE;
			boolean found = false;
			for (int unique : counts.keySet()) {
				if (counts.get(unique) == 1) {
					found = true; 
					min = Math.min(min,  unique);
				}
			}
			
			if (found) {
				System.out.println(find(allNums, min) + 1);
			} else {
				System.out.println("0");
			}
		}
    }
    
    // finds and returns indexOf a given number in a given array 
    public static int find(String[] nums, int min) {
    	for (int i = 0; i < nums.length; i++) {
    		if (Integer.parseInt(nums[i]) == min) {
    			return i;
    		}
    	}
    	
    	return -1;
    }
}