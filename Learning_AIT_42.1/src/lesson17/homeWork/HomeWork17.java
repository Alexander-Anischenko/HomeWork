package lesson17.homeWork;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #17
 *
 * @autor Alexander Anischenko
 * @version 23-02-24
 */
public class HomeWork17 {
    public static void main(String[] args) {
        Emloyee[] emloyees = {
                new Emloyee("a1", "b1", "c1", 123, 1000,40),
                new Emloyee("a2", "b2", "c2", 231, 1100,42),
                new Emloyee("a3", "b3", "c3", 456, 1200,30),
                new Emloyee("a4", "b4", "c4", 1654, 1500,35),
                new Emloyee("a5", "b5", "c5", 789, 1250,50)
        };
        for (Emloyee emloyee: emloyees) {
            if (emloyee.getAge()>40) {
                System.out.println(emloyee.getAge() + ", " +
                        emloyee.getPosition() + ", " +
                        emloyee.getEmail() + ", " +
                        emloyee.getPhone() + ", " +
                        emloyee.getSalary() + ", " +
                        emloyee.getName());
                System.out.println(emloyee);
            }
        }
    }

}
