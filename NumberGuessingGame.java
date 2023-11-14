import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        int guess = 0;

        System.out.println("Guess the number between " + min + " and " + max + ": ");

        while (guess != randomNumber) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low, try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again!");
            }
        }

        System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
    }
}