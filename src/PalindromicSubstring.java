public class PalindromicSubstring {
    public int countSubstrings(String s) {
        int count = 0;
        int [][] a = new int[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++) {
            a[i][i] = 1;
            count++;

        }

        for(int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                a[i][i+1] = 1;
                count++;
            }
        }

        for (int k = 3; k <= s.length();k++) {
            for (int i = 0; i <= s.length()-k; i++) {
                int j = i + k - 1;
                if (a[i+1][j-1] == 1 && s.charAt(i) == s.charAt(j)) {
                    count++;
                    a[i][j] = 1;
                }
            }
        }
        return count;
    }
    public static void main(String []args) {
        PalindromicSubstring palindromicSubstring = new PalindromicSubstring();
        System.out.println(palindromicSubstring.countSubstrings("abcded"));
    }
}
