import java.util.Random;
import java.util.Scanner;

public class ABTest {
    // Static variables to track the votes for each variation
    private static int votesA = 0;
    private static int votesB = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Simulate assigning users to either variation A or B
        String variation = random.nextBoolean() ? "A" : "B";
        
        // Display the assigned variation
        System.out.println("You have been assigned to variation " + variation);
        if (variation.equals("A")) {
            System.out.println("Welcome to BiotechBeauty (Variation A)");
            System.out.println("This is version A of the landing page.");
        } else {
            System.out.println("Welcome to BiotechBeauty (Variation B)");
            System.out.println("This is version B of the landing page.");
        }
        
        // Simulate user interaction (clicking a button)
        System.out.println("Do you want to click the button to continue? (yes/no)");
        String input = scanner.nextLine();
        
        // Log the interaction based on user input
        if (input.equalsIgnoreCase("yes")) {
            System.out.println("You clicked the button on variation " + variation + ".");
        } else {
            System.out.println("You did not click the button.");
        }

        // Ask the user to vote for their preferred variation
        System.out.println("Which variation do you prefer? (A/B)");
        String vote = scanner.nextLine();
        
        // Update vote counts
        if (vote.equalsIgnoreCase("A")) {
            votesA++;
            System.out.println("Thank you for voting for Variation A.");
        } else if (vote.equalsIgnoreCase("B")) {
            votesB++;
            System.out.println("Thank you for voting for Variation B.");
        } else {
            System.out.println("Invalid vote. Please enter A or B.");
        }

        // Display total votes for each variation
        System.out.println("Total votes for Variation A: " + votesA);
        System.out.println("Total votes for Variation B: " + votesB);

        // Close the scanner
        scanner.close();
    }
}
