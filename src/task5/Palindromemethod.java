package task5;

import java.util.Scanner;

public class Palindromemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String sanitizedString = inputString.replaceAll("\\s+", "").toLowerCase();
        
        // Initialize a flag to determine if the string is a palindrome
        boolean isPalindrome = true;

        // Check for palindrome using a for loop
        int length = sanitizedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (sanitizedString.charAt(i) !=sanitizedString .charAt(length - 1 - i)) {
                isPalindrome = false; // Not a palindrome
                break; //
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The string \""  + "\" is a palindrome.");
        } else {
            System.out.println("The string \""  + "\" is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
	


