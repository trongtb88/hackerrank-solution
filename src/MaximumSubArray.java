//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//        Example:
//
//        Input: [-2,-8,-3,-4,-1,-2,-1,-5,-4],
//        Output: 7
//        Explanation: [-1] has the largest sum = 6.
//        Follow up:
//
//        If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

import org.omg.CORBA.MARSHAL;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1 ; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String []args) {
        int [] a = {-3,-2,-9,-2,-8,-3,-4,-1,-2,-1,-5,-4};
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        System.out.println(maximumSubArray.maxSubArray((a)));
    }
}
