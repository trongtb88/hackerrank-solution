public class ClimbingStairs {

    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[0] = 1;
        for (int i = 2; i <= n; i ++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }

    public static void main(String [] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.solution(4));

    }
}
