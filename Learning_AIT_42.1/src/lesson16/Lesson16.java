package lesson16;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #16
 *
 * @version 19. 02. 24
 */

public class Lesson16 {
    public static void main(String[] args) {
        Cat cat = new Cat(30);
        Plate plate = new Plate(50);
        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);

        plate.add(25);
        System.out.println("Plate filling: " + plate.food);
        cat.eat(plate);
        //plate.feeding(plate.amountFood());

        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);
    }
}
