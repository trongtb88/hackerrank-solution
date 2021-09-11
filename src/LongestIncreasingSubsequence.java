//Given an unsorted array of integers, find the length of longest increasing subsequence.
//
//        Example:
//
//        Input: [10,9,2,5,3,7,101,18]
//        Output: 4
//        Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
//        Note:
//
//        There may be more than one LIS combination, it is only necessary for you to return the length.
//        Your algorithm should run in O(n2) complexity.
//        Follow up: Could you improve it to O(n log n) time complexity?

import java.util.*;

public class LongestIncreasingSubsequence {
    Map<Integer, Integer> map = new HashMap<>();

    public static int lengthOfLIS(int[] nums) {
        if (nums == null | nums.length == 0)
            return 0;
        int n = nums.length, len = 0;
        int[] increasingSequence = new int[n];
        increasingSequence[len++] = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > increasingSequence[len - 1])
                increasingSequence[len++] = nums[i];
            else {
                int position = findPositionToReplace(increasingSequence, 0, len - 1, nums[i]);
                increasingSequence[position] = nums[i];
            }
        }
        return len;
    }
    public static int findPositionToReplace(int[] a, int low, int high, int x) {
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (a[mid] == x)
                return mid;
            else if (a[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String []args) {
        int [] a = {10,9,2,5,3,7,101,18};
        LongestIncreasingSubsequence firstMissingNumber = new LongestIncreasingSubsequence();
        System.out.println(firstMissingNumber.lengthOfLIS(a));
    }
}
