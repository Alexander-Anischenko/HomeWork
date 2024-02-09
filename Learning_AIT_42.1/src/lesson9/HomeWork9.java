package lesson9;

import java.util.Arrays;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #9
 *
 * @autor Alexander Anischenko
 * @version 05-02-24
 */

public class HomeWork9 {




    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        //Task #1
        task1(10);

        //Task #2
        listArrayBack(array);

        //Task #3
        listArrayBack(new int[]{1, 2, 3, 4, 5, 6}, false);
        listArrayBack(new int[]{1, 2, 3, 4, 5, 6}, true);

        //Task #4
        System.out.println(Arrays.toString(calculateArray(array)));
    }

    // Method task #1
    static void task1(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.println("Task" + i);
        }
    }
    static void listArrayBack(int[] a) {
        for (int i = a.length - 1;i > -1; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void listArrayBack(int[] a, boolean reversDirection){
        if (reversDirection) {
           listArrayBack(a);
        }else {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    //static int[] createRandomArray(int le);
    static double[] calculateArray(int[] a) {
        int max = a[0];
        int min = a[0];
        double average = 0;
        for (int i: a) {
            average += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        double[] result = {min, max, average / a.length};
        return result;
    }
}
