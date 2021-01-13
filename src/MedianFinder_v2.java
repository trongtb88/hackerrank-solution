import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder_v2 {
    // max queue is always larger or equal to min queue
    PriorityQueue<Integer> min = new PriorityQueue();
    PriorityQueue<Integer> max = new PriorityQueue(1000, Collections.reverseOrder());
    // Adds a number into the data structure.
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if (max.size() < min.size()){
            max.offer(min.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (max.size() == min.size()) return (max.peek() + min.peek()) /  2.0;
        else return max.peek();
    }

    public static void main(String [] args) {
        MedianFinder_v2 obj = new MedianFinder_v2();
        obj.addNum(3);
        obj.addNum(-1);
        obj.addNum(-3);
        obj.addNum(9);
        //obj.addNum(-1);
        System.out.println(obj.findMedian());
    }
};