import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Base room rent
        double baseRent = 100.0; // You can change this value as needed

        // Prompt user for the month of stay
        System.out.println("Enter the month of stay (1-12): ");
        int month = scanner.nextInt();

        double totalRent;

        // Determine if it's peak season and calculate the total rent
        switch (month) {
            case 4: // April
            case 5: // May
            case 6: // June
            case 11: // November
            case 12: // December
                totalRent = baseRent * 1.2; // 20% increase
                System.out.println("Peak season detected. Total rent: $" + totalRent);
                break;
            case 1: // January
            case 2: // February
            case 3: // March
            case 7: // July
            case 8: // August
            case 9: // September
            case 10: // October
                totalRent = baseRent; // No increase
                System.out.println("Off-peak season detected. Total rent: $" + totalRent);
                break;
            default:
                System.out.println("Invalid month entered. Please enter a month between 1 and 12.");
                return; // Exit the program
        }

        // Close the scanner
        scanner.close();
    }
}

         
         
	


	
	
	



	
	
	





	





		 
		