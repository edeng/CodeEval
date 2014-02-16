// Eden Ghirmai, 2/16/2014, www.codeeval.com
// Checks input numbers and determines whether a number is even or not.
// Prints 1 if the number is even or 0 if the number is odd.

import java.util.*;
import java.io.*;
public class EvenNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner in = new Scanner(file);
        
        while (in.hasNextInt()) {
            int n = in.nextInt(); 
            if (n % 2 == 0) {
                System.out.println(1); 
            } else {
                System.out.println(0); 
            }
        }
    }
}