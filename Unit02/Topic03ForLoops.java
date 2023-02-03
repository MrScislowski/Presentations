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
        printTenHellos();
    }
}
// javac .\Topic03ForLoops.java; java Topic03ForLoops