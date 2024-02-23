package lesson16;

public class Cat {

    public int maxVolume;

    public int realVolume;

    public Cat(int maxVolume) {
        this.maxVolume = maxVolume;
        this.realVolume = 0;
    }

    public void eat(Plate plate) {
        int food = plate.amountFood();
        if (food > maxVolume - realVolume) {
            food = maxVolume - realVolume;
        }
        realVolume += food;
        plate.feeding(food);

    }
 }
