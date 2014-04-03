import java.io.*;
import java.util.*; 

public class Main {
    private static int[] storage;
    private static int size; 
    
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while(in.hasNextLine()) {
            storage = new int[10]; 
            Scanner lineScan = new Scanner(in.nextLine()); 
            while (lineScan.hasNextInt()) {
                int num = lineScan.nextInt(); 
                push(num); 
            }
                        
            int i = 0; 
            String result = ""; 
            int original = size; 
            while (i < original) {
                if (i % 2 == 0) {
                    result += pop() + " "; 
                } else {
                    pop(); 
                }
                i++; 
            }
            
            System.out.println(result.trim()); 
		}
    }
    
    public static int pop() {
        size--; 
        return storage[size]; 
    }
    
    public static void push(int num) {
        size++; 
        if (size > storage.length) {
            int[] temp = storage; 
            storage = new int[storage.length * 2]; 
            for (int i = 0; i < temp.length; i++) {
                storage[i] = temp[i];
            }
        }
        
        storage[size - 1] = num; 
    }
}
