
import java.util.Random;
import java.util.Scanner;

public class GuessingGameApplication {

	public static void main(String[] args) {
		final int limit = 100;

		System.out.println("Welcome to the Guessing game \n");
		System.out.println();
		System.out.println("I'm thinking of a number between 0 and 100, can you guess it?\n");
		System.out.println();
		System.out.println("Enter your guess");
		System.out.println();

		double d = Math.random() * limit;
		int number = (int) d;
		number++;

		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (true) {
			System.out.println("Your guess:");
			int guess = sc.nextInt();

			if (guess < 1 || guess > limit) {
				System.out.println("Invalid guess. Try again.");
				continue;
			}
			if (guess < number) {
				System.out.println("Too low.");
			} else if (guess > number) {
				System.out.println("Too high.");
			} else {
				System.out.println("You guessed it in " + count + " tries.\n");
				break;
			}
			count++;
		}
		System.out.println("Goodbye!");

	}

}
