// Eden Ghirmai, 3/10/2014, www.codeeval.com
// Given a number N and a pattern. The pattern consists of lowercase latin letters 
// and one operation "+" or "-". Splits the number and evaluate it according to
// this pattern e.g. 1232 ab+cd -> a:1, b:2, c:3, d:2 -> 12+32 -> 44

import java.io.*;
import java.util.*; 

public class SplitTheNumber {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String[] split = in.nextLine().split("[ \t]+");
			String number = split[0]; 
			String equation = split[1]; 
			
			int sum = 0; 
			if (equation.indexOf("+") != -1) {
				int index = equation.indexOf("+"); 
				int first = Integer.parseInt(number.substring(0, index));
				int second = Integer.parseInt(number.substring(index));
				sum = first + second; 
			} else {
				int index = split[1].indexOf("-"); 
				int first = Integer.parseInt(number.substring(0, index));
				int second = Integer.parseInt(number.substring(index));
				sum = first - second; 
			}
			
			System.out.println(sum);
			
		}
    }
}