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

    public static void printPowersOfTwoUpToSomeNumber(int maxResult) {
        int result = 1;
        while (result <= maxResult) {
            System.out.println(result);
            result *= 2;
        }
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        int index = 0;

        while (index < nums.length) {
            sum = sum + nums[index];

            if (nums[index] == 13) {
                sum -= nums[index];

                if (index < nums.length - 1) {
                    sum -= nums[index + 1];
                }
            }

            index = index + 1;
        }

        return sum;
    }


    public static void main(String[] args) {
        int maxPowerOfTwo = Integer.parseInt(args[0]);
        int maxResult = Integer.parseInt(args[1]);


        // printTenHellos();

        // last line of printPowersOfTwo(31) is:
        // 2^31 = -2147483648
        // due to overflow
        // printPowersOfTwo(maxPowerOfTwo);

        // printPowersOfTwoUpToSomeNumber(maxResult);
        
        System.out.println(sum13(new int[] {1, 2, 2, 1, 13}));
    }
}

// javac .\Topic02WhileLoops.java; java Topic02WhileLoops 28 20
