public class Topic05EnhancedForLoops {
    // enhanced for loop is superior (IMO)
    public static int bigDiff(int[] nums) {
        int minVal = nums[0];
        int maxVal = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
        }
        return maxVal - minVal;
    }

    public static int bigDiffEnhanced(int[] nums) {
        int minVal = nums[0];
        int maxVal = nums[0];

        for (int curVal : nums) {
            if (curVal < minVal) {
                minVal = curVal;
            }
            if (curVal > maxVal) {
                maxVal = curVal;
            }
        }
        return maxVal - minVal;
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean summingPaused = false;

        for (int item : nums) {
            if (item == 6) {
                summingPaused = true;
            } else if (!summingPaused) {
                sum = sum + item;
            } else if (item == 7) {
                summingPaused = false;
            }
        }

        return sum;
    }
    



    public static void main(String[] args) {
        
    }
}
