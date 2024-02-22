package lesson15.homeWork;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #15
 *
 * @autor Alexander Anischenko
 * @version 22-02-24
 */

public class HomeWork15 {
    public static void main(String[] args) {

        // Task #1
        Cat cat = new Cat();
        System.out.println(cat.status());
        cat.eat(10);
        System.out.println("Cat ate: " + cat.status());
        cat.walk();
        cat.run();
        System.out.println(cat.status());
        cat.walk();
        System.out.println(cat.status());
        Cat newCat = new Cat();
        System.out.println(newCat.status());

        // Task #2
        Car car = new Car(5, 58);
        if (car.startEngin()) {
            System.out.println("Drive: " + car.drive(30));
            System.out.println("Fuel level: " + car.fuel);
        }
    }
}
