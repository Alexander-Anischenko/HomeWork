package lesson6;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #6
 *
 * @version 26. 01. 24
 */

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2 or 3:");
        int n = 1;//scanner.nextInt();
        switch (n){
            case  1:
                System.out.println("One");
                break;
            case  2:
                System.out.println("Two");
                break;
            case  3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong number!");

        }
        //loop while
        System.out.println("while i--");
        int i = 5;
        while (i > 0){
            System.out.println(i);
            i--;
        }
        System.out.println("while i++");
        int i1 = 1;
        while (i1 <= 10) {
            System.out.println(i);
            i1++;
        }
        //while with String
        String str = "4317";
        System.out.println(str);
        int p = 0;
        do {
            System.out.println(str.charAt(p));
            p++;
        }while (p < str.length());
    }
}
