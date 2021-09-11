//You are given an n x n 2D matrix representing an image.
//
//        Rotate the image by 90 degrees (clockwise).
//
//        Note:
//
//        You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//
//        Example 1:
//
//        Given input matrix =
//        [
//        [1,2,3],
//        [4,5,6],
//        [7,8,9]
//        ],
//
//        rotate the input matrix in-place such that it becomes:
//        [
//        [7,4,1],
//        [8,5,2],
//        [9,6,3]
//        ]
//        Example 2:
//
//        Given input matrix =
//        [
//        [ 5, 1, 9,11],
//        [ 2, 4, 8,10],
//        [13, 3, 6, 7],
//        [15,14,12,16]
//        ],
//
//        rotate the input matrix in-place such that it becomes:
//        [
//        [15,13, 2, 5],
//        [14, 3, 4, 1],
//        [12, 6, 8, 9],
//        [16, 7,10,11]
//        ]

public class RotateImage {
    public void rotate(int[][] matrix, int clockwise) {
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            for(int j = i; j < n-i-1; j++ ) {
                int temp = matrix[i][j];

                if (clockwise == 1) {
                    // move from bottom -> top
                    matrix[i][j] = matrix[n-j-1][i];
                    // move from top -> right
                    matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                    // move from right -> bottom
                    matrix[n-i-1][n-j-1]= matrix[j][n-i-1];
                    matrix[j][n-i-1] = temp;
                }
                // anti-clock wise
                if (clockwise == 2) {
                    // move from right -> top
                    matrix[i][j] = matrix[j][n-i-1];
                    // move from bottom -> right
                    matrix[j][n-i-1] = matrix[n-i-1][n-j-1];
                    // move from left -> bottom
                    matrix[n-i-1][n-j-1] = matrix[n-j-1][i];

                    //move from top -> leftmatrix[n-i-1][n-j-1];
                    matrix[n-j-1][i] = temp;

                }


            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String [] arg) {
        int[][] A = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16},
        };
        RotateImage corner = new RotateImage();
        corner.rotate(A, 2);

    }

}
