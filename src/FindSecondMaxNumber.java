import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindSecondMaxNumber {

    public static Integer find(int[] array) {
        Integer secondMax = 0;
        Integer max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
        }
        return secondMax;
    }
    public  static  void main(String [] args) {
        int [] a = {10, 70, 20, 30, 50, 11, 100};
        System.out.println(find(a));
    }
}
