//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//        Example 1:
//
//        Input:
//        [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//        ]
//        Output: [1,2,3,6,9,8,7,4,5]
//        Example 2:
//
//        Input:
//        [
//        [1, 2, 3, 4],
//        [5, 6, 7, 8],
//        [9,10,11,12]
//        ]
//        Output: [1,2,3,4,8,12,11,10,9,5,6,7]

import java.util.ArrayList;
import java.util.List;

public class SpiralModel {
    public void solution(int [][] a) {
        List<Integer> result = new ArrayList<>();

        int m = a.length;
        int n = a[0].length;

        int x0 = 0; int y0 = 0;
        int x1 = m-1; int y1= n-1;

        int x = 0;
        int y = 0;

        while (x0 < x1 && y0 < y1) {
            x = x0;
            y = y0;
            while (y < y1) {
                result.add(a[x][y++]);
            }
            while (x < x1) {
                result.add(a[x++][y]);
            }
            while (y > y0) {
                result.add(a[x][y--]);
            }
            while (x > x0) {
                result.add(a[x--][y]);
            }
            x0++;
            y0++;
            x1--;
            y1--;
        }

        if (x0 == x1 && y0 <= y1) {
            while (y <= y1) result.add(a[x][y++]);
        } else if (y0 == y1 && x0 <= x1) {
            while (x <= x1) result.add(a[x++][y]);
        }



    }
    public static void main(String [] arg) {
        int[][] A = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16},
        };
        SpiralModel corner = new SpiralModel();
        corner.solution(A);

    }
}
