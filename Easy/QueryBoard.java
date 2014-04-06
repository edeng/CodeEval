import java.io.*;
import java.util.*; 

public class QueryBoard {
	public static final int BOARD_SIZE = 256; 
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
		Scanner in = new Scanner(file);
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			Scanner lineScan = new Scanner(line); 
			String method = lineScan.next(); 
			if (method.equalsIgnoreCase("SetCol")) {
				setCol(lineScan.nextInt(), lineScan.nextInt(), board);
			} else if (method.equalsIgnoreCase("SetRow")) {
				setRow(lineScan.nextInt(), lineScan.nextInt(), board);
			} else if (method.equalsIgnoreCase("QueryRow")) {
				queryRow(lineScan.nextInt(), board);
			} else {
				queryCol(lineScan.nextInt(), board);
			}
			
		}
    }
    
    public static void setCol(int col, int value, int[][] board) {
    	for (int i = 0; i < BOARD_SIZE; i++) {
    		board[col][i] = value; 
    	}
    }
    
    public static void setRow(int row, int value, int[][] board) {
    	for (int i  = 0; i < BOARD_SIZE; i++) {
    		board[i][row] = value; 
    	}
    }
    
    public static void queryRow(int row, int[][] board) {
    	int sum = 0; 
    	for (int i = 0; i < BOARD_SIZE; i++) {
    		sum += board[i][row];
    	}
    	System.out.println(sum); 
    }
    
    public static void queryCol(int col, int[][] board) {
    	int sum = 0; 
    	for (int i = 0; i < BOARD_SIZE; i++) {
    		sum += board[col][i]; 
    	}
    	System.out.println(sum); 
    }
}