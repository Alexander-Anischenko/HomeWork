package lesson5;


import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #5
 *
 * @autor Alexander Anischenko
 * @version 27-01-24
 */
public class HomeWork5 {
    public static void main(String[] args) {

        // Task #1
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        boolean a = num % 2 == 0;
        boolean b = num % 3 == 0;
        boolean c = a && b;
        System.out.println("Number:" + num + ", div by 2:" + a + ", div by 3:" + b + ", and div by 3:" + c + ".");

        //Task #2
        System.out.println("Enter the number: 1, 2, or 3");
        int n = scanner.nextInt();
        n = 3;
        if (n == 1){
            System.out.println("Your choise" + n);
        }else if (n == 2){
            System.out.println("Your choise" + n);
        }else if (n == 3) {
            System.out.println("Your choise" + n);
        }else System.out.println("Wrong number.");

        //Task #3
        Random random = new Random();
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);
        System.out.println("Number 1: " + num1 + " ; Number 2: " + num2 +" ; Number 3: " + num3 + " ; Number 4: " + num4 + " .");
        int maxNum =Math.max(Math.max(num1, num2), Math.max(num3, num4));
        System.out.println("The MAX number is : " + maxNum + " !!!");
    }
}
