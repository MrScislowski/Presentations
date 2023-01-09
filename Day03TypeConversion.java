public class Day03TypeConversion {
    public static void main(String[] args) {
        // CASTS

        // converts to int by truncating decimals
        // predict the output
        System.out.println((int) 2.71828);
        System.out.println((int) -2.71828);
        System.out.println();

        System.out.println((int) Math.round(2.71828));
        System.out.println((int) Math.round(-2.71828));
        System.out.println();

        System.out.println(11 * (int) 0.25);
        System.out.println((int) 11 * 0.25);
        System.out.println((int) (11 * 0.25));
    }
}
