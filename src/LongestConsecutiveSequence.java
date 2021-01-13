import java.util.*;

//Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//
//        Your algorithm should run in O(n) complexity.
//
//        Example:
//
//        Input: [100, 4, 200, 1, 3, 2]
//        Output: 4
//        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class LongestConsecutiveSequence {
    public int solution(int []a) {
        Map<Integer, Integer> map = new HashMap();
        int i = 0;
        if (a.length == 0) return 0;
        Set<Integer> s = new TreeSet();
        for (i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        Integer [] temp = new Integer[a.length+1];
        s.toArray(temp);
        int maxCount = 1;
        int result =0;
        for (i = 0; i < temp.length-1; i++) {
            if (temp[i+1] != null && temp[i] + 1 == temp[i+1]) {
                maxCount++;
            } else {
                if (result < maxCount){
                    result  = maxCount;
                }
                maxCount = 1;
            }

        }
        return result;

    }

    public static void main(String []args) {
        int [] a = {1,2,5,3, -3, 6,7,8};
        LongestConsecutiveSequence firstMissingNumber = new LongestConsecutiveSequence();
        System.out.println(firstMissingNumber.solution(a));
    }

}
