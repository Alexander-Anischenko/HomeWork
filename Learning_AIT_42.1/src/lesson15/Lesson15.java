package lesson15;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #15
 *
 * @version 16. 02. 24
 */
public class Lesson15 {
    public static void main(String[] args) {
        Cat cat = new Cat();//"Mursik", "white", 3);
        System.out.println("Cat 0: " + cat.name + ", " + cat.color + ", "  + cat.age);
        cat.voice();

        Cat cat1 = new Cat("Barsik", "black", "blue",  5 , 10);
        System.out.println( "Cat 1: " + cat1.name + ", " + cat1.color + ", " + cat1.eyeColor + ", " + cat1.age);
        cat1.voice();
        cat1.eat(5);
        System.out.println("Satiety level: " + cat1.satiated());
    }
}
