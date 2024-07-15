package src;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Please enter a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                win = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }
        scanner.close();
    }
}

