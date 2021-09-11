import java.util.*;

public class MaxSumSubSequence {
    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        List<Integer> l = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i < array.length; i++) {
            if (l.isEmpty()) {
                l.add(i);
                stack.add(i);
            } else {
                Integer top = stack.peek();
                if (array[i] >= array[top]) {
                    stack.push(i);
                    l.add(i);
                } else {
                    List<Integer> tmp = new ArrayList<>();
                    while (!stack.isEmpty()) {
                        Integer top2 = stack.peek();
                        if (array[top2] <= array[i]) {
                            break;
                        } else {
                            stack.pop();
                            tmp.add(top2);
                        }
                    }
                    for (Integer next : tmp) {
                        stack.push(next);
                    }
                    stack.push(i);

                }
            }
        }
        return null;
    }
    public  static  void main(String [] args) {
        int [] a = {10, 70, 20, 30, 50, 11, 100};
        maxSumIncreasingSubsequence(a);
    }
}
