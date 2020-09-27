import java.util.Stack;

public class LargestHistogram {
    static int getMaxArea(int hist[], int n) {
        // Create an empty stack. The stack holds indexes of hist[] array
        // The bars stored in stack are always in increasing order of their
        // heights.
        Stack<Integer> s = new Stack<>();

        int max_area = 0;
        int topOfStack;
        int area_with_top;

        int i = 0;
        while (i < n) {
            if (s.empty() || hist[s.peek()] <= hist[i])
                s.push(i++);
            else {
                topOfStack = s.peek();
                s.pop();
                area_with_top = hist[topOfStack] * (s.empty() ? i : i - s.peek() - 1);
                 if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        while (s.empty() == false) {
            topOfStack = s.peek();
            s.pop();
            area_with_top = hist[topOfStack] * (s.empty() ? i : i - s.peek() - 1);

            if (max_area < area_with_top)
                max_area = area_with_top;
        }

        return max_area;
    }

    public static void main(String[] args) {
        int hist[] = {6, 2, 5, 4, 5, 1, 6};
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
    }
}
