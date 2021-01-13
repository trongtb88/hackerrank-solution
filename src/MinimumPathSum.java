//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
//
//        Note: You can only move either down or right at any point in time.
//
//        Example:
//
//        Input:
//        [
//        [1,3,1],
//        [1,5,1],
//        [4,2,1]
//        ]
//        Output: 7
//        Explanation: Because the path 1→3→1→1→1 minimizes the sum.

import java.math.BigInteger;

public class MinimumPathSum {
    public int solution(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        String[][] dp = new String[m + 1][n + 1];
        String s = "";
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (dp[i - 1][j] == null) {
                    dp[i - 1][j] = "B";

                }
                if (dp[i][j - 1] == null) {
                    dp[i][j - 1] = "B";
                }
                dp[i][j] = String.valueOf(getMinInteger(dp[i - 1][j], dp[i][j - 1]).add(BigInteger.valueOf(A[i - 1][j - 1])));
            }
        }
        if (dp[m][n].startsWith("0")) {
            dp[m][n] = dp[m][n].substring(1);
        }
        if (dp[m][n].equals("")) {
            return 0;
        }
        return Integer.valueOf(dp[m][n]);
    }

    private BigInteger getMinInteger(String a, String b) {

        if (a.equals("B") && b.equals("B")) {
            return BigInteger.ZERO;
        }
        if (a.equals("B") && !b.equals("B")) {
            return new BigInteger(b);
        }

        if (!a.equals("B") && b.equals("B")) {
            return new BigInteger(a);
        }

        BigInteger left = new BigInteger(a);
        BigInteger right = new BigInteger(b);

        BigInteger r = left.min(right);
        if (r.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ZERO;
        }
        return left.min(right);
    }

    public static void main(String[] arg) {
        int[][] A = {
                {0}
        };
        MinimumPathSum corner = new MinimumPathSum();
        System.out.println(corner.solution(A));

    }

}