// some comments

/*
 * <initialization>
 * while (<boolean statement>) {
 * <statements to repeat>
 * <increment>
 * }
 * 
 * for(<initialization>; <boolean statement>; <increment>) {
 * <statements to repeat>
 * }
 */
public class Topic03ForLoops {

    private static int rollDie() {
        int result = (int) (Math.random() * 6) + 1;
        return result;
    }

    public static void simulationExample() {
        // rolling two dice... what's the probability that you roll a total of 5?
        // what about 6?

        final int NTRIALS = 100000;

        int fiveCount = 0;
        int sixCount = 0;

        for (int trial = 0; trial < NTRIALS; trial++) {
            int roll1 = rollDie();
            int roll2 = rollDie();
            int rollSum = roll1 + roll2;

            if (rollSum == 5) {
                fiveCount++;
            } else if (rollSum == 6) {
                sixCount++;
            }
        }
        System.out.println("probability of rolling a 5: " + (double) fiveCount / NTRIALS);
        System.out.println("probability of rolling a 6: " + (double) sixCount / NTRIALS);

    }

    public static void printTenHellos() {
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");
    
        for (int num = 4; num <= 10; num = num + 1) {
            System.out.println(num + "th Hello");
        }
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean countingPaused = false;

        for (int index = 0; index < nums.length; index = index + 1) {
            if (nums[index] == 6) {
                countingPaused = true;
            }
            if (!countingPaused) {
                sum += nums[index];
            }
            if (nums[index] == 7) {
                countingPaused = false;
            }
        }
        return sum;
    }

    public static int[] zeroMax(int[] nums) {
        // make a copy of the array
        int[] a = new int[nums.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = nums[i];
        }
        
        int largestOddValueSoFar = 0;
        for (int index=a.length-1; index >= 0; index = index - 1) {
            if (a[index] == 0) {
                a[index] = largestOddValueSoFar;
            }
            if (a[index] % 2 == 1 && a[index] > largestOddValueSoFar) {
                largestOddValueSoFar = a[index];
            }
        }
        return a;
    }
    
    

    public static void main(String[] args) {
        simulationExample();
    }
}
// javac .\Topic03ForLoops.java; java Topic03ForLoops