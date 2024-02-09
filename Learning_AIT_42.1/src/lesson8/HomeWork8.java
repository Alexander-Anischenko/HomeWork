package lesson8;

import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #8
 *
 * @autor Alexander Anischenko
 * @version 02-02-24
 */
public class HomeWork8 {
    public static void main(String[] args) {

        //Task #1 (Что успел, зато сам :))
        //for (int i1 = 1; i1<=10; i1++) {
         //   System.out.println("Task" + i
        //}

        //Task #2
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i =0; i < array.length; i++) {
            int n = array[i];
            if (n % 5 == 0) {
                System.out.println(n);
            }
        }

        // Task #3
        String[] s = {"One", "Two", "Three", "Four"};
        String strMaxLenght = "";
        for (String str : s) {
            if (str.length() > strMaxLenght.length()){
                strMaxLenght = str;
            }
        }
        for (char chr : strMaxLenght.toCharArray()){// char примитивный тип данных для 1 символа в Unicode
            //ChareArray массив символов в формате Unicode
            System.out.println(chr);
        }

        // Task #4
        Random random = new Random();
        int[] n = new int[100];

        int sum = 0;
        // Заполнение массива случайными числами
        for (int i = 0; i < n.length; i++ ) {
            n[i] = random.nextInt(100);
        }
        int max = n[0];
        int min = n[0];
        // Обработка массива
        for (int i: n) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Max = " + max + ", min = " + min + ", average = " + (sum / ( double) n.length));
    }
}
