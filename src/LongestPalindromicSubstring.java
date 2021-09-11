//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
//        Example 1:
//
//        Input: "babad"
//        Output: "bab"
//        Note: "aba" is also a valid answer.
//        Example 2:
//
//        Input: "cbbd"
//        Output: "bb"

public class LongestPalindromicSubstring {

    public String solution(String s) {
        int n = s.length();
        int maxLength = 1;
        boolean [][] table = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            table[i][i] = true;
        }


        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                start = i;
                table[i][i+1] = true;
                maxLength = 2;
            }
        }

        for (int k = 3; k <=n ; k++) {
            for (int i = 0; i < n-k-1; i++) {
                int j = i + k - 1;
                if (table[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    maxLength = k;
                    table[i][j] = true;
                    start = i;
                }
            }
        }

        System.out.print("Longest palindrome substring is; ");
        return printSubStr(s, start, start + maxLength - 1);

    }

    static String printSubStr(String str, int low, int high) {
        return str.substring(low, high + 1);
    }

    public static void main(String [] s) {
        LongestPalindromicSubstring palindromicSubstring = new LongestPalindromicSubstring();
        System.out.println(palindromicSubstring.solution("babad"));
    }

}
