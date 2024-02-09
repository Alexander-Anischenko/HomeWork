package lesson10;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #10
 *
 * @version 05. 02. 24
 */
public class Lesson10 {
    public static void main(String[] args) {

        //variables simpl types == 8
        int a = 25;
        int b = 12 * 3 + a;

        //logics
        boolean f = true; // false;
        boolean l = f && true; // && (and) || (or ! (not)

        //if-else
        if (a == 3) {
            System.out.println("a = 3");
        } else {
            System.out.println("a 1=3");
        }
        String s = a == 3? "a = 3" : "a != 3"; //ternary operator

        // switch
        switch (a) {
            case 1, 2, 3:
                System.out.println("a == 1 or 2 or 3");
                break;
                //cace N;
            default:
                System.out.println("Alternative reality");

        }

        // loops while, do-while
        while (a < 10){
            //TODO write loop body
            a++;
        }
    }
}
