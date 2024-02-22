package lesson17;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #17
 *
 * @version 21. 02. 24
 */

public class Lesson17 {
    public static void main(String[] args) {
        Cat cat = new Cat("Mursik", "white", 4);
        cat.setName(null);
        System.out.println("Name: " + cat.getName() + ", color: " + cat.color + ", age: " + cat.age);
        cat.voice();
    }
}
