
public class LargestRectange {
    // method for Maximum size square sub-matrix with all character same.
    static void printMaxSubSquare(int M[][]) {
        int i, j;
        int R = M.length; // no of rows in M[][]
        int C = M[0].length; // no of columns in M[][]
        int S[][] = new int[R][C];

        /* Set first row of S[][]*/
        for (j = 0; j < C; j++) S[0][j] = M[0][j];

        /* Construct other entries of S[][]*/
        for (i = 1; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (M[i][j] == 1)
                    S[i][j] = S[i-1][j] + 1;
                else S[i][j] = 0;
            }
        }


        System.out.println("Histogram matrix is: ");
        int maxArea = 0;
        int [] temp = new int[C];
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                //System.out.print(S[i][j]);
                temp[j] = S[i][j];
            }
            int  maxAreaForCurrentRow = LargestHistogram.getMaxArea(temp, C);
            if (maxArea < maxAreaForCurrentRow) {
                maxArea = maxAreaForCurrentRow;
            }
            System.out.println(maxArea);

        }
    }

    public static void main(String[] args) {
        int M[][] =
                {       {0, 1, 1, 0, 1},
                        {1, 1, 0, 0, 0},
                        {1, 0, 0, 1, 0},
                        {1, 1, 1, 1, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0}};

        printMaxSubSquare(M);
    }


}
