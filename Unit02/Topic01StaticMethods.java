import java.util.Arrays;

public class Topic01StaticMethods {

    // static methods CAN change the values stored in an array
    public static void sort(int[] items) {
        if (items[0] <= items[1]) {
            // do nothing
        } else {
            int temp = items[0];
            items[0] = items[1];
            items[1] = temp;
        }
    }

    // "non-destructive" sort is preferred for multi-core
    // programming, and other applications
    public static int[] sorted(int[] items) {
        int[] result = new int[2];
        if (items[0] < items[1]) {
            result[0] = items[0];
            result[1] = items[1];
        } else {
            result[0] = items[1];
            result[1] = items[0];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[] {5, 2};
        int[] b = sorted(a);
        System.out.println("original array: " + Arrays.toString(a));
        System.out.println("sorted array: " + Arrays.toString(b));
    }
}

// javac Topic01StaticMethods.java;  java Topic01StaticMethods