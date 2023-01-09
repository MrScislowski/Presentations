public class Day03TypeConversion {
    public static void main(String[] args) {
        // take an integer as a command line argument, and generate (then print) a random
        // number (integer) between 0 and the supplied number

        int maxVal = Integer.parseInt(args[0]);
        int randomInt = (int) (Math.random() * maxVal);

        System.out.println(randomInt);
    }
}
