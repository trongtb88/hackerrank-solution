public class JumpingNumber {
        public static Long targetNumber;

    public static void printResult() {
        for (int i = 0; i < targetNumber; i++) {
            if (i <= 10) {
                System.out.println(i + " ");
            } else {
                if (isJump(i)) {
                    System.out.println(i + " ");
                }
            }
        }
    }

    public static boolean isJump(long n) {
        String s = String.valueOf(n);
        for (int i = 0 ; i < s.length()-1; i++) {
            //System.out.println(s.charAt(i));
            int n1 = Integer.valueOf(s.charAt(i));
            int n2 = Integer.valueOf(s.charAt(i+1));
            if (Math.abs(n1-n2) != 1) {
                return false;
            }
        }
        return true;
    }
}
