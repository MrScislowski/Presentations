import java.util.Arrays;

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

    public static int sum67Enhanced(int[] nums) {
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
    
    // enhanced for loop is not clearly the best choice
    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i+1] == 7) {
                return true;
            } else if (i != nums.length - 2 && nums[i] == 7 && nums[i+2] == 7) {
                return true;
            }
        }
        return false;
    }

    public static boolean has77Enhanced(int[] nums) {
        
        int prevNum = 0;
        int theOneBeforeThePrevious = 0;

        for (int curNum : nums) {
            if (curNum == 7 && prevNum == 7) {
                return true;
            } else if (curNum == 7 && theOneBeforeThePrevious == 7) {
                return true;
            } 
            theOneBeforeThePrevious = prevNum;
            prevNum = curNum;
        }
        return false;

    }

    public static int[] post4(int[] nums) {
        int locationOfLast4 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                locationOfLast4 = i;
            }
        }
        //  0  1  2  3
        // [2, 4, 1, 2]
        // nums.length = 4;
        // locationOfLast4 = 1
        // new array should have size 2
        int[] newArray = new int[nums.length - locationOfLast4 - 1];
        int indexInNewArray = 0;
        for (int i = locationOfLast4 + 1; i < nums.length; i++) {
            newArray[indexInNewArray] = nums[i];
            indexInNewArray++;
        }

        return newArray;
    }
      
    
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("a") || 
            str.substring(i, i+1).equals("e") || 
            str.substring(i, i+1).equals("i") || 
            str.substring(i, i+1).equals("o") || 
            str.substring(i, i+1).equals("u")) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countVowels("inanimate"));
    }
}

// all of these are on codingbat under Array-2
// Practice exercises where enhanced for loops are appropriate:
// sum28, only14, sum13, lucky13

// Practice exercises where it's debatable:
// haveThree, tripleUp, modThree