//Given a non-empty array of integers, return the k most frequent elements.
//
//        Example 1:
//
//        Input: nums = [1,1,1,2,2,3], k = 2
//        Output: [1,2]
//        Example 2:
//
//        Input: nums = [1], k = 1
//        Output: [1]
//        Note:
//
//        You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
//        Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i  = 0 ; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        map = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        Set<Integer> keys = map.keySet();
        List<Integer> keysL = new ArrayList<>(keys);

        for (int i = k; i > 0; i--) {
            result.add(keysL.get(keysL.size() - i));
            //System.out.println(keysL.get(keysL.size() - i));
        }



        return result;
    }
    public static void main(String [] args) {
        // 1 2 3 4 5 6
        // 1  2  3 4  5  6  11 - 6 - 1 = 3 -> 6-3

        //1 2 2 3 3 4 5 5 6 10 - 6 = 4 10 - 3
        int [] a = {1,2};
        TopKFrequentElements firstMissingNumber = new TopKFrequentElements();
        System.out.println(firstMissingNumber.topKFrequent(a, 2));
    }


}
