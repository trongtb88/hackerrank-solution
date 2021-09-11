public class LongestSubstring {
    public String findMaxSubstring(String s) {
        if (s == null || "".equals(s)) {
            return "";
        }
        s = s.trim();
        int n = s.length();
        if (n == 1) {
            return s;
        }

        int maxSubLength = 0;
        int startSubStrIndex = 0;

        // use this to mark substring from i, j is satisfy result
        boolean [][] mark = new boolean[n][n];

        // each char is satisfy
        for(int i = 0; i < n; i++) {
            mark[i][i] = true;
        }

        for (int i = 0 ; i < n - 1 ; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                maxSubLength = 2;
                mark[i][i+1] = true;
                startSubStrIndex = i;
            }
        }

        for (int l = 3; l <= n ; l++) {
            for (int i = 0 ; i < n - l + 1; i++) {
                int j = i + l - 1;
                // abba is satisfy if head char = end char and inside sub string is satisfy.
                if (mark[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    maxSubLength = l;
                    mark[i][j] = true;
                    startSubStrIndex = i;
                }
            }
        }
        if (maxSubLength >= 2) {
            return s.substring(startSubStrIndex, startSubStrIndex + maxSubLength);
        }
        return "";

    }

    public static void main(String [] s) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.findMaxSubstring("abcabcabba"));
    }


}
