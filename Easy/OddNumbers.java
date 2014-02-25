// Eden Ghirmai, 2/16/2014, www.codeeval.com
// Prints the odd numbers from 1 to 99
// one number per line

public class OddNumbers {
    public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
    }
}
