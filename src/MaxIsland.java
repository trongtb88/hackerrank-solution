//Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
//
//        Example 1:
//
//        [[0,0,1,0,0,0,0,1,0,0,0,0,0],
//        [0,0,0,0,0,0,0,1,1,1,0,0,0],
//        [0,1,1,0,1,0,0,0,0,0,0,0,0],
//        [0,1,0,0,1,1,0,0,1,0,1,0,0],
//        [0,1,0,0,1,1,0,0,1,1,1,0,0],
//        [0,0,0,0,0,0,0,0,0,0,1,0,0],
//        [0,0,0,0,0,0,0,1,1,1,0,0,0],
//        [0,0,0,0,0,0,0,1,1,0,0,0,0]]
//        Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
//        Example 2:
//
//        [[0,0,0,0,0,0,0,0]]
//        Given the above grid, return 0.
//        Note: The length of each dimension in the given grid does not exceed 50.

import java.util.concurrent.atomic.AtomicInteger;

public class MaxIsland {
    public int solution(int [][] A) {
        int m = A.length;
        int n = A[0].length;

        boolean [][] visitedIslands = new boolean[m][n];
        int maxIsland = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 1 && !visitedIslands[i][j]) {
                    int s = visitOtherIsland(i, j, A, visitedIslands, m, n);
                    if (s > maxIsland) {
                        maxIsland = s;
                    }
                }
            }
        }
        return maxIsland;
    }

    public  int visitOtherIsland(int i, int j, int [][] A, boolean [][]visitedIslands, int m, int n) {
        visitedIslands[i][j] = true;
        Integer sum = 1;
        int [] neightBourIndexRow = {1, 0, -1, 0};
        int [] neightBourIndexCol = {0, 1, 0, -1};
        for (int k = 0; k < 4; k++) {
            if (visitable(i + neightBourIndexRow[k], j + neightBourIndexCol[k], A, visitedIslands, m, n)) {
                sum += visitOtherIsland(i + neightBourIndexRow[k], j + neightBourIndexCol[k], A, visitedIslands, m, n);
            }
        }
        return sum;
    }

    public boolean visitable(int i, int j, int [][] A, boolean [][]visitedIslands, int m, int n) {
        if (i >=0 && j >= 0 && i < m && j < n && A[i][j] == 1 && !visitedIslands[i][j]) {
            return true;
        }
        return  false;
    }
    public static void main(String [] arg) {
        int[][] A = {
                {1,1,0,0,0},
                {1,1,1,0,0},
                {0,0,0,0,0},
                {1,1,1,0,0},
        };
        MaxIsland corner = new MaxIsland();
        System.out.println(corner.solution(A));

    }

}
