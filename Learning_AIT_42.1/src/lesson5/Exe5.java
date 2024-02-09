package lesson5;

public class Exe5 {
    public static void main(String[] args) {
        int t = 32;
        if (t > 28){
            System.out.println("It's hot");
        } else {
            System.out.println("It's NOT hot");
        }
        System.out.println((t > 28)? "It's hot" : "it's NOT hot");
    }
}
