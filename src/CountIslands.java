//Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
// You may assume all four edges of the grid are all surrounded by water.
//
//        Example 1:
//
//        Input:
//        11110
//        11010
//        11000
//        00000
//
//        Output: 1
//        Example 2:
//
//        Input:
//        11000
//        11000
//        00100
//        00011
//
//        Output: 3

public class CountIslands {
    public int solution(int [][] A) {
        int m = A.length;
        int n = A[0].length;

        boolean [][] visitedIslands = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 1 && !visitedIslands[i][j]) {
                    count++;
                    visitOtherIsland(i, j, A, visitedIslands, m, n);
                }
            }
        }
        return count;
    }

    public  void visitOtherIsland(int i, int j, int [][] A, boolean [][]visitedIslands, int m, int n) {
        visitedIslands[i][j] = true;
        int [] neightBourIndexRow = {1, 0, -1, 0};
        int [] neightBourIndexCol = {0, 1, 0, -1};
        for (int k = 0; k < 4; k++) {
            if (isOK(i + neightBourIndexRow[k], j + neightBourIndexCol[k], A, visitedIslands, m, n)) {
                visitOtherIsland(i + neightBourIndexRow[k], j + neightBourIndexCol[k], A, visitedIslands, m, n);
            }
        }
    }

    public boolean isOK(int i, int j, int [][] A, boolean [][]visitedIslands, int m, int n) {
        if (i >=0 && j >= 0 && i < m && j < n && A[i][j] == 1 && !visitedIslands[i][j]) {
            return true;
        }
        return  false;
    }
    public static void main(String [] arg) {
        int[][] A = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,0,0,0},
                {1,1,1,0,0},
        };
        CountIslands corner = new CountIslands();
        System.out.println(corner.solution(A));

    }

}
