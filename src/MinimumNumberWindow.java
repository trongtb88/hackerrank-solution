public class MinimumNumberWindow {
    public int[] slidingWindowMin(final int[] in, final int w) {
        final int[] min_left = new int[in.length];
        final int[] min_right = new int[in.length];

        min_left[0] = in[0];
        min_right[in.length - 1] = in[in.length - 1];

        for (int i = 1; i < in.length; i++) {
            min_left[i] = (i % w == 0) ? in[i] : Math.min(min_left[i - 1], in[i]);

            final int j = in.length - i - 1;
            min_right[j] = (j % w == 0) ? in[j] : Math.min(min_right[j + 1], in[j]);
        }

        final int[] sliding_max = new int[in.length - w + 1];
        for (int i = 0, j = 0; i + w <= in.length; i++) {
            sliding_max[j++] = Math.min(min_right[i], min_left[i + w - 1]);
        }

        return sliding_max;
    }
    public static void main(String []args) {
        int [] a = {2,1,3,4,-6,3,8,9,10,12,56};
        MinimumNumberWindow maxNumberWindow_v3 = new MinimumNumberWindow();
        int [] b = maxNumberWindow_v3.slidingWindowMin(a,4 );
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
