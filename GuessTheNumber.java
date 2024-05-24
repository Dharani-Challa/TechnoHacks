import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Choose your mode:");
        System.out.println("1. Easy Mode (Unlimited guesses)");
        System.out.println("2. Difficult Mode (Only 3 guesses)");

        int modeChoice = scanner.nextInt();

        int maxAttempts;
        if (modeChoice == 1) {
            maxAttempts = 1000;  }
        else {
            maxAttempts = 3;
        }

        int attempts = 0;
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess;
            try {
                guess = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                scanner.next();
                continue;
            }

            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + attempts + " attempts!");
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
        }

        scanner.close();
    }
}
