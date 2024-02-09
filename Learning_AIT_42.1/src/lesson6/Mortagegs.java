package lesson6;

public class Mortagegs {
    public static void main(String[] args) {
        float total = 200000;
        float payment = 1000;
        float precent = 4;
        int montCount = 0;
        do {
            montCount++;
            if (montCount % 12 == 0){
                total = total + total/100*precent;
                System.out.println(total);
            }
            total = total - payment;
        } while (total > 0);
    }
}
