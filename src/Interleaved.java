public class Interleaved {
    public static String A = "";
    public static String B = "";
    public static String C = "";

    public static boolean isInterleaved() {
        int indexAinC = C.indexOf(A);
        if (indexAinC == -1) {
            return false;
        } else {
            String remainC = "";
            if (indexAinC > 0) {
                remainC = C.substring(0, indexAinC);
            } else {
                remainC = C.substring(indexAinC+1, C.length());
            }
            if (remainC.equals(B)) {
                return true;
            } else {
                return false;
            }
        }
    }

}
