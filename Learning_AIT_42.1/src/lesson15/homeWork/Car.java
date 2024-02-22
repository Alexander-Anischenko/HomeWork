package lesson15.homeWork;

public class Car {

    double fuel;

    double maxFuel;

    boolean engineOn;

    public Car(double fuel, double maxFuel) {
        this.fuel = fuel;
        this.maxFuel = maxFuel;
        this.engineOn =false;
    }

    public void refuel(double fuel) {
        if (this.fuel + fuel > maxFuel) {
            this.fuel = maxFuel;
            return;
        }
        this.fuel += fuel;
    }
    public double drive(int distance){
        if (!engineOn){
            return  0;
        }
        fuel -= 0.07 * distance;
        return distance;
    }

    public boolean startEngin() {
        engineOn = fuel > 0;
        return engineOn;
    }
}
