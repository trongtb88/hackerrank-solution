import java.util.*;

public class MaxNumberWindow_v2 {
    public static int []  solution(int w, int []a) {
        int[] res = new int[a.length - w + 1];

        for (int i = 0; i <= a.length-w; i++) {
            int max = a[i];
            for (int j = 0; j < w; j++) {
                if (a[i+j] > max) {
                    max = a[i+j];
                }
            }
            res[i] = max;
        }
        return res;
    }
    public static void main(String []args) {
        int [] a = {2, 1, 2, -1, 3};
        int [] b = solution(2,a );
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
