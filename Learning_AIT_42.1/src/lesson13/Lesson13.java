package lesson13;

import lesson12.HomeWork12;
import lesson9.HomeWork9;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #13
 *
 * @version 12. 02. 24
 */
public class Lesson13 {
    public static void main(String[] args) {
        int[] array = HomeWork9.createRandomArray(1_00_000, 100);


        long stastTime = System.currentTimeMillis();
        System.out.println(HomeWork12.linearSearch(array, 45));
        System.out.println((System.currentTimeMillis() - stastTime) + "ms");

        HomeWork12.selectionSort(array);

        stastTime = System.currentTimeMillis();
        System.out.println(HomeWork12.binarySearch(array, 45));
        System.out.println((System.currentTimeMillis() - stastTime) + "ms");
    }
}
