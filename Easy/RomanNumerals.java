// Eden Ghirmai, 3/24/2014, www.codeeval.com
// Converts given cardinal number to Roman numeral form

import java.io.*;
import java.util.*; 

public class RomanNumerals {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String result = ""; 
			int num = Integer.parseInt(in.nextLine());
			while (num >= 1000) {
				result += "M";
				num -= 1000; 
			}
			
			while (num >= 900) {
				result += "CM";
				num -= 900; 
			}
			
			while (num >= 500) {
				result += "D";
				num -= 500; 
			}
			
			while (num >= 400) {
				result += "CD";
				num -= 400; 
			}
			
			while (num >= 100) {
				result += "C";
				num -= 100; 		
			}
			
			while (num >= 90) {
				result += "XC";
				num -= 90; 		
			}
			
			while (num >= 50) {
				result += "L";
				num -= 50; 
			}
			
			while (num >= 40) {
				result += "XL";
				num -= 40; 
			}
			
			while (num >= 10) {
				result += "X";
				num -= 10; 		
			}
			
			while (num >= 9) {
				result += "IX";
				num -= 9;
			}
			
			while (num >= 5) {
				result += "V";
				num -= 5; 
			}
			
			while (num >= 4) {
				result += "IV";
				num -= 4; 		
			}
			
			while (num >= 1) {
				result += "I";
				num--; 
			}
			
			System.out.println(result); 
		}
    }
}