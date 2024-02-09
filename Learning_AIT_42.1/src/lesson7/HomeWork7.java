package lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #7
 *
 * @autor Alexander Anischenko
 * @version 31-01-24
 */

public class HomeWork7 {

    public static void main(String[] args) {

        //Task #1 GuessTheNumber
        Random random1 = new Random(); //Create class Random and object random1
        Scanner scanner1 = new Scanner(System.in); //Crete class Scanner and object scanner1
        do { //Create loop do...while to repeat
            int number = random1.nextInt(10); //Create variables
            int counter = 0;
            int answer = -1;
            while (answer != number && counter < 3) { //Three-try limit
                counter++;
                System.out.println("Guess the Number[0...9].");
                answer = scanner1.nextInt(); //Entering the expected number
                if (answer < number) {
                    System.out.println("Your number is less");
                } else if (answer > number) {
                    System.out.println("Your number is greater");
                }
            }
            if (answer == number){ //Result and game over
                System.out.println("You WIN! Game over.");
            } else {
                System.out.println("You LOSE! It was " + number);
            }
            System.out.println("Play again [1-yes,0-no]");
        } while (scanner1.nextInt() == 1);

        //Task #2 Cannonshort
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int radius = 15;
        double g = 9.81;
        int angle;
        int speed;
        double differens;
        double distance = random.nextInt(1000) + 100;
        do {
            System.out.println("Enter start speed (m/s): ");
            speed = scanner.nextInt();
            System.out.println("Enter angle (degree)[10...85]: ");
            angle = scanner.nextInt();
            double realDistance = speed * speed * Math.sin(Math.toRadians(angle * 2)) / g;
            differens = distance - realDistance;
            if (Math.abs(differens) < radius) {
                System.out.println("You damage target" + realDistance);
            } else {
                if (differens < 0) {
                    System.out.println("Overflight: " + realDistance + " " + distance);
                } else {
                    System.out.println("underflight; " + realDistance + " " + distance);
                }
            }
        } while (Math.abs(differens) < radius);
    }
}
