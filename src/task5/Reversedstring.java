package task5;

import java.util.Scanner;

public class Reversedstring {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize an empty string for the reversed result
        String reversedString = "";

        // Loop through the input string in reverse order
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);

		}
}



	

	
	



	


