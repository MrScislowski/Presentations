public class Topic02WhileLoops {

    public static void printTenHellos() {
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");

        int num = 4;
        while (num <= 10) {
            System.out.println(num + "th Hello");
            num = num + 1;
        }
    }

    public static void printPowersOfTwo(int maxPower) {
        int curPower = 0;
        int result = 1;

        while (curPower <= maxPower) {
            System.out.println("2^" + curPower + " = " + result);
            result = result * 2;
            curPower = curPower + 1;
        }
    }

    public static void main(String[] args) {
        int maxPowerOfTwo = Integer.parseInt(args[0]);

        // printTenHellos();

        // last line of printPowersOfTwo(31) is:
        // 2^31 = -2147483648
        // due to overflow
        printPowersOfTwo(maxPowerOfTwo);
    }
}

// javac .\Topic02WhileLoops.java; java Topic02WhileLoops 28
