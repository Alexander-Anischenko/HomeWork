package lesson16;

public class Plate {

    int capacity;

    public int food;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.food = 0;
    }

    public void add(int food){
        if ( this.food + food > capacity){
            this.food = capacity;
            return;
        }
        this.food += food;
    }

    public  int amountFood() {
        return food;
    }

    public void feeding(int food) {
        this.food -= food;
    }
}
