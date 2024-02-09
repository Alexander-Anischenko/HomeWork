package lesson9;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #9
 *
 * @autor Alexander Anischenko
 * @version 07-02-24
 */
public class Overload {
    public static void main(String[] args) {
        System.out.println(write(12));
        System.out.println(write("Twelve"));
        System.out.println(write(4, 16));
    }
    static String write(int num) {
        return ("Transmitted int : " + num);
    }
    static String write(String num) {
        return ("Transmitted string : " + num);
    }
    static String write(int num1, int num2) {
        return ("Result : " + (num1 * num2));
    }
}
