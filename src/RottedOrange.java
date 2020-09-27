import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RottedOrange {
    public int orangesRotting(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int freshCount = 0;
        Queue<String> q = new ArrayDeque();

        for (int i = 0 ; i< ROWS; i++) {
            for (int j = 0; j < COLS; j++ ) {
                if (grid[i][j] == 2) {
                    q.add(i + "x" + j);
                }
                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        int k = 0;
        while (!q.isEmpty()) {
            if (freshCount == 0) {
                break;
            }
            k++;
            List<String> rottedOrange = new ArrayList<>();
            while (!q.isEmpty()) {
                String rotAddress = q.poll();
                int i = Integer.parseInt(rotAddress.substring(0, 1));
                int j = Integer.parseInt(rotAddress.substring(2));
                if (i + 1 < ROWS && grid[i+1][j] == 1) {
                    rottedOrange.add((i+1) + "x" + j);
                    grid[i+1][j] = 2;
                    freshCount--;
                }
                if (i - 1 >= 0 && grid[i-1][j] == 1) {
                    rottedOrange.add((i-1) + "x" + j);
                    grid[i-1][j] = 2;
                    freshCount--;
                }
                if (j + 1 < COLS && grid[i][j+1] == 1) {
                    rottedOrange.add((i) + "x" + (j+1));
                    grid[i][j+1] = 2;
                    freshCount--;
                }
                if (j - 1 >= 0 && grid[i][j-1] == 1) {
                    rottedOrange.add((i) + "x" + (j-1));
                    grid[i][j-1] = 2;
                    freshCount--;
                }
                if (freshCount == 0) {
                    break;
                }

            }
            if (rottedOrange.size() > 0) {
                q.addAll(rottedOrange);
            }
        }
        if (q.isEmpty() && freshCount > 0) {
            return -1;
        }
        return k;
    }

    public static void main(String [] args) {
        int [][] a = new int[1][2];
        a[0][0] = 0;
        a[0][1] = 2;
//        a[0][2] = 1;
//
//        a[1][0] = 0;
//        a[1][1] = 1;
//        a[1][2] = 1;
//
//        a[2][0] = 1;
//        a[2][1] = 0;
//        a[2][2] = 1;
        RottedOrange rotting = new RottedOrange();
        System.out.println(rotting.orangesRotting(a));

    }
}
