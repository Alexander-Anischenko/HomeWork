package lesson6;

import java.util.Scanner;

import static java.lang.System.*;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(in);
        System.out.println("Enter expression, like 4 +/-/*/: 3:");
        int a = scanner.nextInt();
        String s = scanner.next();// Numerical operation
        int b = scanner.nextInt();
        switch (s){
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case ":":
                System.out.println(a + " : " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Error: unknown action: " + s);
        }
        switch (s){
            case "+" -> out.println(a + " + " + b + " = " + (a + b));
            case "-" -> out.println(a + " - " + b + " = " + (a - b));
            case "*" -> out.println(a + " * " + b + " = " + (a * b));
            case ":" -> out.println(a + " : " + b + " = " + (a / b));
            default -> out.println("Error: unknown action: " + s);
        }
    }
}
