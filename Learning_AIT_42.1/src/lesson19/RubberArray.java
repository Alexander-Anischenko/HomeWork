package lesson19;

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

    public void add(int value) {
        if (length == data.length) {

            int[] neuData = new int[(int) (data.length * RESIZE_KOEF)];
            for (int i = 0; i < data.length; i++) {
                neuData[i] = data[i];
            }
            data = neuData;
        }
            data[length] = value;
            length++;
        }

        public void add(int vaiue, int idx) {
            //TODO implement
        }

        public void remove(int idx) {
            for (int i = idx; i < data.length -1; i++) {
                data[i] = data[i + 1];
            }
            length--;
        }

    @Override
    public String toString() {
        //TODO use StringBuilder instead of Sting
        String str = "[";
        for (int i = 0; i < length; i++) {
           str += String.valueOf(data[i]);
           if (i <length -1) {
               str += ", ";
           }
        }
        return str + "]";
    }
}
