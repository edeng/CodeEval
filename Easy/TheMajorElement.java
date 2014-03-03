// Eden Ghirmai, 3/03/2014, www.codeeval.com
// The major element in a sequence with the length of L is the element 
// which appears in a sequence more than L/2 times. 
// The challenge is to find that element in a sequence.

import java.io.*;
import java.util.*; 

public class TheMajorElement {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] nums = in.nextLine().split(","); 
			int length = nums.length / 2;
			Map<Integer, Integer> store = new TreeMap<Integer, Integer>(); 
			for (int i = 0; i < nums.length; i++) {
				int num = Integer.parseInt(nums[i]);
				if (store.containsKey(num)) {
					store.put(num, store.get(num) + 1);
				} else {
					store.put(num, 1); 
				}
			}
			
			System.out.println(search(store, length));
		}
    }
    
    public static String search(Map<Integer, Integer> map, int length) {
    	for (int key : map.keySet()) {
    		if (map.get(key) > length) {
    			return key + ""; 
    		}
    	}
    	
    	return "None";
    }
}