import java.util.Scanner;
import java.util.Random;

public class NumberSystemGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number System Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Try to guess the number!");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}

