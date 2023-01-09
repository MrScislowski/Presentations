public class Day03TypeConversion {
    public static void main(String[] args) {
        // AUTOMATIC (IMPLICIT) CONVERSIONS

        // int with int operations. Predict value and type of result...
        System.out.println(2 + 3);
        System.out.println(2 - 3);
        System.out.println(2 * 3);
        System.out.println(2 / 3);

        // int with double operations
        System.out.println(2 + 3.0);
        System.out.println(2 - 3.0);
        System.out.println(2 * 3.0);
        System.out.println(2 / 3.0);

        // String with number
        System.out.println("2" + 2);
        System.out.println(2.0 + "2");

        // multiple operations
        System.out.println((7/2) * 2.0);
        System.out.println((7/2.0) * 2);

    }
}
