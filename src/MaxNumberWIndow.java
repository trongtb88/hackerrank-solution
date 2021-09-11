import java.util.*;

public class  MaxNumberWIndow {
    public static int []  solution(int w, int []a) {
        if(a.length == 0) return a;//[], 0
        int[] res = new int[a.length - w + 1];
        int cnt = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            while(!q.isEmpty() && q.peek() < i - w + 1) {
                q.poll();
            }
            while(!q.isEmpty() && a[q.peekLast()] < a[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i >= w - 1) {
                res[cnt++] = a[q.peek()];
            }
        }
        return res;
    }
    public static void main(String []args) {
        int [] a = {2, 1, 2, -1, 3, 4, 2, -4, 6, 9};
        int [] b = solution(3,a );
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
