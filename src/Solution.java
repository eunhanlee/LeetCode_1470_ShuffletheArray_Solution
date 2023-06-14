public class Solution {
    /**
     * Shuffles an array of integers based on the given number of elements, n.
     *
     * @param nums the input array of integers
     * @param n the number of elements to shuffle
     * @return the shuffled array
     */
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }

        return result;
    }
}
