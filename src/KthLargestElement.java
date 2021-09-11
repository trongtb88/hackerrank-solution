import java.util.*;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue s = new PriorityQueue(nums.length);
        for (int i = 0 ; i < nums.length;i++) {
            s.add(nums[i]);
            if (s.size() > k) {
                s.poll();

            }
        }
        return (int) s.poll();
//        Set s = new TreeSet();
//        for (int i = 0 ; i < nums.length;i++) {
//            s.add(nums[i]);
//        }
//        List<Integer> l = new ArrayList(s);
//        int diffSize = nums.length - l.size();
//        return l.get(nums.length-k-diffSize+1);

    }

    public static void main(String [] args) {
        // 1 2 3 4 5 6
        // 1  2  3 4  5  6  11 - 6 - 1 = 3 -> 6-3

        //1 2 2 3 3 4 5 5 6 10 - 6 = 4 10 - 3
        int [] a = {3,2,1,4,5,6};
        KthLargestElement firstMissingNumber = new KthLargestElement();
        System.out.println(firstMissingNumber.findKthLargest(a, 4));
    }
}
