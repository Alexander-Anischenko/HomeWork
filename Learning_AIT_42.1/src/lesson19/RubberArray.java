package lesson19;

/**
 * AIT-TR, cohort 42.1, Java Basic, Home work   #19
 *
 * @autor Alexander Anischenko
 * @version 29-02-24
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

    // getting index value получение значения инлекса
    public int getValue(int idx) {
        return data[idx];
    }

    private void extendArrayIfNeed() {
        if (length == data.length) {
            // Create new extendet Array * 1.5 Создание нового  увеличенного массива * 1.5
            int[] neuData = new int[(int) (data.length * RESIZE_KOEF)];
            // Move all items to new Array Перемещение всех элементов из старого в новый массив
            for (int i = 0; i < data.length; i++) {
                neuData[i] = data[i];
            }
            //Chane link to new Array меняем ссылку(связывание, соединение) на новый массив
            data = neuData;
        }
    }
    // Add value to the end of index Добавление значения в конец индекса
    public void add(int value) {
    extendArrayIfNeed();
        data[length] = value;
        length++;
    }


    //Add value to a specified index location Добавление значения в заданное место индекса
    public void add(int value, int idx) {
        extendArrayIfNeed();
        for (int i = length; i > idx; i--) {
            data[i] = data[i - 1];

        }
        data[idx] = value;
        length++;
    }

    //remove(delete) index  удаление индекса
    public void remove(int idx) {
        // Move elements right to left from idx Смещение элементов справа налево начиная с индекса idx
        for (int i = idx; i < data.length -1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    //Value content check Проверка содержания значения
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
