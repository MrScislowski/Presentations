public class Day03TypeConversion {
    public static void main(String[] args) {
        // CASTS

        // converts to int by truncating decimals
        // predict the output
        System.out.println((int) 2.71828); // 2
        System.out.println((int) -2.71828); // -2
        System.out.println();

        System.out.println((int) Math.round(2.71828)); // 3
        System.out.println((int) Math.round(-2.71828)); // -3
        System.out.println();

        System.out.println(11 * (int) 0.25); // 0 (int)
        System.out.println((int) 11 * 0.25); // 2.75 (double)
        System.out.println((int) (11 * 0.25)); // 2 (int)
    }
}
