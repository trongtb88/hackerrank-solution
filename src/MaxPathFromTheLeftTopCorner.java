//You are given a matrix A consisting of N rows and M columns, where each cell contains a digit. Your task is to find a continuous sequence of neighbouring cells, starting in the top-left corner and ending in the bottom-right corner (going only down and right), that creates the biggest possible integer by concatenation of digits on the path. By neighbouring cells we mean cells that have exactly one common side.
//
//        Write a function:
//
//class Solution { public String solution(int[][] A); }
//
//that, given matrix A consisting of N rows and M columns, returns a string which represents the sequence of cells that we should pick to obtain the biggest possible integer.
//
//        For example, given the following matrix A:
//
//        [9 9 7]
//        [9 7 2]
//        [6 9 5]
//        [9 1 2]
//
//        the function should return "997952", because you can obtain such a sequence by choosing a path as shown below:

import java.math.BigInteger;

public class MaxPathFromTheLeftTopCorner {
    public String solution(int [][]A) {
        int m = A.length;
        int n = A[0].length;
        String [][] dp = new String[m+1][n+1];
        String s = "";
        for (int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if (dp[i-1][j] == null) {
                    dp[i-1][j] = "0";

                }
                if (dp[i][j-1] == null) {
                    dp[i][j-1] = "0";
                }
                BigInteger left =new BigInteger(dp[i-1][j]);
                BigInteger right =new BigInteger(dp[i][j-1]);
                dp[i][j] = left.max(right) + "" + A[i-1][j-1];
            }
        }
        if (dp[m][n].startsWith("0")) {
            dp[m][n] = dp[m][n].substring(1);
        }
        return dp[m][n];
    }

    public static void main(String [] arg) {
        int[][] A = {
                {1},
                };
        MaxPathFromTheLeftTopCorner corner = new MaxPathFromTheLeftTopCorner();
        System.out.println(corner.solution(A));

    }
}
