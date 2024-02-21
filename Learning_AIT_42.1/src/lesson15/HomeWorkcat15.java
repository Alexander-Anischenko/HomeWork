package lesson15;

public class HomeWorkcat15 {
    int energy;

    public void walk() {
        energy -= 3;
        voice();
        return;
    }
    public void run() {
        energy -= 5;
        voice();
        return;
    }
    public void eat(int food) {
        energy =+ food;
    }
    public void voice() {
        System.out.println("Meow!");
    }
}
