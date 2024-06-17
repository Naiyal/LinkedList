import java.util.Arrays;

/**
 * Array
 */
public class Array {
    private int[] arr;
    private int count = 0;

    public Array(int size) {

        this.arr = new int[size];
    }

    public void insert(int number) {
        if (arr.length == count) {
            int[] newArr = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count++] = number;

    }

    public void remove(int index) {
        for (int i = index; i < count; i++) {

            arr[i] = arr[i + 1];
        }

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == item) {
                return i;
            }

        }
        return -1;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

}