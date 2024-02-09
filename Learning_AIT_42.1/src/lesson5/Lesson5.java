package lesson5;

        /**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #5
 *
 * @version 25. 01. 24
 */
public class Lesson5 {
    public static void main(String[] args) {
        boolean a = 4 > 5;
        System.out.println(a);
        int t = 4;
        System.out.println(t <= 0);
        if (t <= 0) {
            System.out.println("It's frost.");
        }else {
            System.out.println("it's NO frost.");
        }
        String str = new String("Hello");
        if (str.equals("Hello")) {    //обязательно
            System.out.println("ok");
        }else {
            System.out.println("NOT ok");
        }
        {// область видимости
            int b = 55;
            System.out.println(b * 2);
        }
        int b = 3;
        System.out.println(b);
    }
}
