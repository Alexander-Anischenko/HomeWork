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
        long startTime = System.currentTimeMillis();
        int[] array = HomeWork9.createRandomArray(100_000, 100);
        //int[] array = HomeWork9.createRandomArray(100_000_000, 100);
        System.out.println("Array creation time: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.linearSearch(array, 45));
        HomeWork12.linearSearch(array, 45);
        System.out.println("Linear search time: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        HomeWork12.selectionSort(array);
        System.out.println("Selection sort time: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.binarySearch(array, 45));
        HomeWork12.binarySearch(array, 45);
        System.out.println((System.currentTimeMillis() - startTime) + "ms");
    }
}
