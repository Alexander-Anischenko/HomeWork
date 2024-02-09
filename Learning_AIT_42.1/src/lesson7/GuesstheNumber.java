package lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #5
 *
 * @version 25. 01. 24
 */
public class GuesstheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int number = random.nextInt(10);
            int counter = 0;
            int answer = -1;
            while (answer != number && counter < 3) {
                counter++;
                System.out.println("Guess the number [0..9]:");
                answer = scanner.nextInt();
                if (answer < number) {
                    System.out.println("Your number is less");
                } else if (answer > number) {
                    System.out.println("Your number is greater");
                }
            }
            if (answer == number) {
                System.out.println("You WIN!");
            } else {
                System.out.println("You LOSE!");
            }
            System.out.println("Play again [1-yes,0-no]");
        } while (scanner.nextInt() == 1);
    }
}
