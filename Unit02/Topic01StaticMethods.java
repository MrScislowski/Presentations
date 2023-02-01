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

    public static void main(String[] args) {
        int[] a = new int[] {5, 2};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));

    }
}

// javac Topic01StaticMethods.java;  java Topic01StaticMethods