package lesson16.homework;

import lesson16.Cat;
import lesson16.Plate;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #16
 *
 * @autor Alexander Anischenko
 * @version 27-02-24
 */
public class HomeWork16 {
    public static void main(String[] args) {

        // Task #1
        Cat[] cats = {new Cat(12), new Cat(16), new Cat(10), new Cat(9)};
        Plate plate = new Plate(60);
        System.out.println("Cats are hungry!");
        plate.add(45);
        System.out.println("Plate filling: " + plate.food);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Cat: " + ((double)cat.realVolume/cat.maxVolume) * 100 +"%");
        }

        // Task #2
        Car car = new Car(64);
        PetrolStation station = new PetrolStation(1000);
        System.out.println("Car: " + car.fuel);
        System.out.println("Station: " + station.fuel);
        car.refuel(station);
        System.out.println("Car: " + car.fuel);
        System.out.println("Station: " + station.fuel);
    }
}
