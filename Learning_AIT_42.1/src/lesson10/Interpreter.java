package lesson10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #10 ext
 *
 * @author Sergey Iryupin
 * @version 8-Feb-24
 */
public class Interpreter {

    static int[] values = new int[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("# ");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "print":
                    printValue(tokens[1]);
                    break;
                case "exit":
                    System.out.println("Exit from interpreter.");
                    break;
                default:
                    assignValue(line);
            }
        } while (!line.equals("exit"));
    }

    static void assignValue(String line) {
        String[] tokens = line.split("=");
        String varName = tokens[0].trim();
        String varValue = tokens[1].trim();
        // check variable name lenght
        if(validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value = Integer.valueOf(varValue);
        // assign value
        values[idx] = value;
    }

    static void printValue(String varName) {
        if(validateVarName(varName)) {
            return;
        }
        int idx = varName.charAt(0) - 'a';
        System.out.println(values[idx]);
    }

    static boolean validateVarName(String varName) {
        if(varName.length() > 1) {
            System.out.println("Error, variable name  is too long");
            return false;
        }
        if (varName.isEmpty()) {
            System.out.println("Error, variable name  is empty");
            return false;
        }
        int idx = varName.charAt(0) - 'a';
        if (idx < 0 || idx > values.length - 1) {
            System.out.println("Error: variable name is invalid");
        }
        return true;
    }
}
