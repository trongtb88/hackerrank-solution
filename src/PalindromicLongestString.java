public class PalindromicLongestString {
    public static String longestPalindromicSubstring(String str) {
        if (str.length() <= 1) {
            return str;
        }
        int [][] mark = new int[str.length()][str.length()];
        int ROWS = str.length();
        int COLS = str.length();
        int maxLength = 1;
        int start = 0;

        for (int i = 0 ; i < ROWS; i++) {
            mark[i][i] = 1;
            if (i + 1 < COLS) {
                if (str.charAt(i) == str.charAt(i+1)) {
                    mark[i][i+1] = 1;
                    start = i;
                    maxLength = 2;
                }
            }
        }
        for (int k = 3; k <= ROWS; k ++) {
            for (int i = 0 ; i < ROWS - k + 1; i++) {
                int j = i + k -1;
                if (mark[i+1][j-1] == 1 && str.charAt(i) == str.charAt(j)) {
                    mark[i][j] = 1;
                    if (k > maxLength) {
                        maxLength = k;
                        start = i;
                    }
                }
            }
        }
        System.out.println("Max palindromic substring length is " + maxLength);
        return str.substring(start, start + maxLength);
    }

    public static void main(String [] args) {
        String s = "abcdefghfedcbaa";
        System.out.println("Max palindromic substring of abcdeffabccbaff  is " + longestPalindromicSubstring(s));

    }
}
