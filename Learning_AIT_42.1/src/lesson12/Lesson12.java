package lesson12;

import java.util.Arrays;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #12
 *
 * @version 09. 02. 24
 */

public class Lesson12 {
    public static void main(String[] args) {
        int[] array = {5, 9, -14, 7, -4, 2};
        int toSearch = -4;
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toSearch) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
    static void addOne(int n) {
        n++;
        System.out.println("N = " + n);
    }
    static void exchangeSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i + 1];
            int minIdx = i + 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIdx = j;
                }
            }
            if (a[i] > min) {
                a[minIdx] = a[i];
                a[i] = min;
            }
        }
    }
}
