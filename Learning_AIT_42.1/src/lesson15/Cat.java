package lesson15;

public class Cat {
    String name; // Field (Поля)
    String color; // Field (Поля)
    String eyeColor ; // Field (Поля)
    int age; // Field (Поля)
    int volume; // Field (Поля)
    int food; // Field (Поля)
    int energie;

    public Cat(String name, String color, String eyeColor, int age, int volume) {  //В скобках () переменные Variables
        this.name = name;
        this.color = color;
        this.eyeColor = eyeColor;
        this.age = age;
        this.volume = volume;

    }

    public Cat() { // Перегрузка конструктора(второй конструктор с таким-же именем)
    }

    public void eat(int food) {
        this.food = food;

    }

    public double satiated() {
        return (double) food / volume * 100; // Первая операция кастомизируется в double, чтобы дальше метод насыщение(satiated) в методе main считался в процентах
    }

    public void voice() {
        System.out.println("Meow!");
    }
}
