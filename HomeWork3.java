package lesson3;
/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   3
 *  Alexander Anischenko
 * 21. 01. 24
 */

//Task 1
public class HomeWork3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;
        // New variable wit sum value
        double sum = (a + b + c + d + e + f + g + h + i + j) / 10.;
        System.out.println(sum);

        // Task 2
        // Create new variable product A and B
        int a1 = 1000;
        int b1 = 500;
        // Make sum
        int sum1= a1 + b1;
        // Make discount 10%
        int discount = (sum1 / 10) * 9;
        System.out.println(discount);

        //Task 3
        //     d-day
        int d1 = 8;
        int d2 = 8;
        int d3 = 12;
        int d4 = 8;
        int d5 = 10;
        int d6 = 3;
        int d7 = 6;
        int sum3 = (d1 + d2 + d3 + d4 + d5 + d6 + d7);
        double result = sum3 / 7.;
        System.out.println(result);

        // task 4
        int a3 = 9 % 2;
        int b3 = 10 % 2;
        int c3 = 11 % 2;
        System.out.println(a3 + "," + b3 +"," + c3);
        System.out.println((9 % 3) + "," + (10 % 3) + "," + (11 % 3));

        // task 5
        int x = 3;
        x++;
        System.out.println(x);

            }
}
