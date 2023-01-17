public class Day05Arrays {
    public static void main(String[] args) {
        // firstLast6
        // Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        
        int[] nums = {4, 6, 1, 2, 6};
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
