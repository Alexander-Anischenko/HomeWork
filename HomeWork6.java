package lesson6;


import java.util.Scanner;

public class HomeWork6 {

    /**
     * AIT-TR, cohort 42.1, Java Basic, Home work   #6
     *
     * @autor Alexander Anischenko
     * @version 29-01-24
     */
    public static void main(String[] args) {

       //Task #1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1, 2, or 3 :");
        int n1 = scanner.nextInt();
        switch (n1) {
            case 1:
                System.out.println("You entred one");
                break;
            case 2:
                System.out.println("You entred two");
                break;
            case 3:
                System.out.println("You entred tre");
                break;
            default:
                System.out.println("Wrong number");
        }

        // Task #2
                scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 and 7");
        int n2 = scanner.nextInt();
        switch (n2) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong data !");
        }

        // Task #3
        int n3 = 1;
        while (n3 <= 10) {
            System.out.println("Task " + n3);
            n3++;
        }
        // Task #4
        int n4 = 5;
        do {
            System.out.println(n4);
            n4 += 5;
        } while (n4 <= 100);
        int num4 = 0;
        do {
            num4++;
            if (num4 % 5 == 0)
                System.out.println(num4);
        }while (num4 <= 100);

         // Task #5
        String hi;
        int n5 = 0;
        String proposal = "Say: Hi, to keep going ";
        do {
             n5++;
            System.out.println(proposal);
            hi = scanner.next();
            proposal = "Try again!";
        }while (!hi.equalsIgnoreCase("Hi"));
        String attempt = (n5 == 1)? "attempt" : "attempts";
        System.out.println("Keep going !");
        System.out.println("You used " + n5 + attempt);

    }
}
