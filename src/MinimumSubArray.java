//Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
//        Example:
//
//        Input: s = 7, nums = [2,3,1,2,4,3]
//        Output: 2
//        Explanation: the subarray [4,3] has the minimal length under the problem constraint.
//        Follow up:
//        If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).
public class MinimumSubArray {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0, from = 0, win = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                win = Math.min(win, i - from + 1);
                sum = sum - nums[from++];
            }

        }
        return (win == Integer.MAX_VALUE) ? 0 : win;

    }
    public static void main(String [] args) {
        int [] a = {2,3,1,2,4,3};
        MinimumSubArray maximumSubArray = new MinimumSubArray();
        System.out.println(maximumSubArray.minSubArrayLen(7, a));
    }
}
