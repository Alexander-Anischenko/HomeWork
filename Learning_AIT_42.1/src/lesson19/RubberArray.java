package lesson19;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #19
 *
 * @autor Alexander Anischenko
 * @version 28-02-24
 */

public class RubberArray {

    private final int INIT_DATA_SIZE = 10;

    private final float RESIZE_KOEF = 1.5f;
    private int[] data;

    private  int length;

    public RubberArray() {
        data = new int[INIT_DATA_SIZE];
        length = 0;
    }

    public int get(int idx) {
        return data[idx];
    }

    private void extendArrayIfNeed() {
        if (length == data.length) {

            int[] neuData = new int[(int) (data.length * RESIZE_KOEF)];
            for (int i = 0; i < data.length; i++) {
                neuData[i] = data[i];
            }
            data = neuData;
        }
    }

    public void add(int value) {
    extendArrayIfNeed();
        data[length] = value;
        length++;
    }

    public void add(int value, int idx) {
        extendArrayIfNeed();
        for (int i = length; i > idx; i--) {
            data[i] = data[i - 1];

        }
        data[idx] = value;
        length++;
    }

    public void remove(int idx) {
        for (int i = idx; i < data.length -1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int indexOf(int value) {
        for (int i = 0; i < length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
           sb.append ((data[i]));
           if (i <length -1) {
               sb.append(", ");
           }
        }
        return sb.append("]").toString();
    }
}
