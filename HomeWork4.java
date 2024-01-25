package HomeWork4;



import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #4
 *
 * @autor Alexander Anischenko
 * @version 25. 01. 24
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner a;
        a = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String firstName = a.nextLine();
        System.out.println("Введите вашу фамилию: ");
        String lastName = a.nextLine();
        System.out.println("Введите ваш город: ");
        String city = a.nextLine();
        System.out.println("Введите ваш возраст: ");
        int age = a.nextInt();
        System.out.println("Введите ваш рост (в метрах): ");
        float height = a.nextFloat();
        System.out.printf("Меня зовут " + firstName + ' ' +  lastName +", мне " + age + ", мой город " + city + ", мой рост " + height + " см." );
    }
}
