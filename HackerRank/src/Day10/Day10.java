package Day10;
import java.util.Scanner;


public class Day10 {

//	   static String toBinary(int n) { // 5
//		   
//	       if (n == 0) {
//	           return "0";
//	       }  
//	       String binary = "";
//	       while (n > 0) { // while loop n > 0 --> 5 > 0
//	           int remainder = n % 2; // 1 -> 0 -> 1
//	           binary = remainder + binary; // 1 -> 01 -> 101
//	           n = n / 2; // 5/2 -> 2 -> 1
//	       }
//	       return binary;
//	   }

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        // There are two ways to convert base-10 integer to binary numbers in java
        // Have a method that has algorithm to convert from base-10 integer to binary numbers
        // Use java method called Integer.toBinaryString(); 
        
        String binary = Integer.toBinaryString(n);
        
		int maxConsecutiveOneNum = 0;
		int consecutiveOneNum = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				consecutiveOneNum++;
				maxConsecutiveOneNum = Math.max(maxConsecutiveOneNum, consecutiveOneNum); // This method returns the larger of a and b.
			} else {
				consecutiveOneNum = 0;
			}
		}
		System.out.println(maxConsecutiveOneNum);

		in.close();
        
	}

}
