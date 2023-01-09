public class Day03TypeConversion {
    public static void main(String[] args) {
        // AUTOMATIC (IMPLICIT) CONVERSIONS

        // int with int operations. Predict value and type of result...
        System.out.println(2 + 3); // 5 (int)
        System.out.println(2 - 3); // -1 (int)
        System.out.println(2 * 3); // 6 (int)
        System.out.println(2 / 3); // 0 (int)

        // int with double operations
        System.out.println(2 + 3.0); // 5.0 (double)
        System.out.println(2 - 3.0); // -1.0 (double)
        System.out.println(2 * 3.0); // 6.0 (double)
        System.out.println(2 / 3.0); // 0.666666... (double)

        // String with number
        System.out.println("2" + 2); // "22" (String)
        System.out.println(2.0 + "2"); // "2.02" (String)

        // multiple operations
        System.out.println((7/2) * 2.0); // 6.0 (double)
        System.out.println((7/2.0) * 2); // 7.0 (double)

    }
}
