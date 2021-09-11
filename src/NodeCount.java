public class NodeCount {

    public static int solution(int[] A) {
//        A[0] =  1
//        A[1] =  4
//        A[2] = -1
//        A[3] =  3
//        A[4] =  2

        int count = 1;
        int head = 0;
        while (A[head] != -1 && head <= A.length) {
            count++;
            head = A[head];
        }
        return count;
    }
}
