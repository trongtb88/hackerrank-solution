import apple.laf.JRSUIUtils;

import java.util.*;

class MedianFinder {

    /** initialize your data structure here. */
    Set<Integer> a = new TreeSet<>();
    // Adds a number into the data structure.
    public void addNum(int num) {
        a.add(num);
    }

    // Returns the median of current data stream
    public double findMedian() {
        //return a.stream().
        List<Integer> list = new ArrayList<Integer>(a);
        if (list.size() % 2 != 0) {
            return list.get(list.size()/2);
        } else {
            return ((double)list.get(list.size()/2 - 1) + list.get(list.size()/2))/2;
        }
    }

    public static void main(String [] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(3);
        obj.addNum(-1);
        obj.addNum(-3);
        obj.addNum(9);
        //obj.addNum(-1);
        System.out.println(obj.findMedian());
    }
}



/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */