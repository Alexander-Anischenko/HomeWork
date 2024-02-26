package lesson18;

public class Robot {

    public static final String COMPANY_NAME ="Boston Dinamics";

    private int countCPU;

    private int sum;

    private static int count;

    public Robot(int countCPU) {
        this.countCPU = countCPU;
        count++;
    }

    public static int getCount() {
        return count;
    }
    public int getSum() {
        return sum;
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public void addAndSave(int a) {
        sum += a;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "countCPU=" + countCPU +
                '}';
    }
}

