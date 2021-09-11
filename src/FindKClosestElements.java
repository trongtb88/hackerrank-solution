//Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
//
//        Example 1:
//        Input: [1,2,3,4,5], k=4, x=3
//        Output: [1,2,3,4]
//        Example 2:
//        Input: [1,2,3,4,5], k=4, x=-1
//        Output: [1,2,3,4]
//        Note:
//        The value k is positive and will always be smaller than the length of the sorted array.
//        Length of the given array is positive and will not exceed 104
//        Absolute value of elements in the array and x will not exceed 104

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int pos = findPositionToReplace(arr, 0, arr.length, x);
        Set<Integer> result = new HashSet<>();
        int i = pos;

        for (;(i >=0 && result.size() < k); i--) {
            result.add(arr[i]);
        }


        if (result.size() < k) {
            i = pos+1;
            while (result.size() < k && i<arr.length) {
                result.add(arr[i++]);
            }
        }
        System.out.println(pos);
        return new ArrayList<>(result);
    }

    private int findPositionToReplace(int [] a, int low, int high, int x) {
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low)/2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return mid;

    }
    public static void main(String [] args) {
        int [] a = {1,1,1,10,10,10};
        //[1,1,1,10,10,10]


        FindKClosestElements firstMissingNumber = new FindKClosestElements();
        System.out.println(firstMissingNumber.findClosestElements(a, 1, 9));
    }


}
