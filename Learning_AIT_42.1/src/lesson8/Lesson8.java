package lesson8;

import java.util.Arrays;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #
 *
 * @version 31. 01. 24
 */
public class Lesson8 {
    public static void main(String[] args) {
        int[] array = {7,2,-5,11,1};//Массив(в переводе)
        //array[0] = 12;
        System.out.println(array [2]);
        for (int i = 4; i > -1; i -= 2) {
            System.out.println(i);
        }
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i : array) { //Только с массивами и списками
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));//Класс Arrays для отображения  любого массива, количество элементов в массиве не имеет значения
    }
}

