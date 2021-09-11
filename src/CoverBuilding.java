import java.util.*;
import java.util.stream.Collectors;

public class CoverBuilding {

    public static int solution(int[] H) {

        // [5, 3, 2, 4] -> 17
        // [1, 3, 2, 4, 6, 2, 3, 7, 7, 8, 3, 2] -> 17




        //[3, 1, 4] -> 10
        //List<Integer> list = Arrays.stream(H).boxed().collect(Collectors.toList());

        //5, 3, 5, 2, 1 -> 19

        if (H.length == 1) {
            return H[0];
        }

        Map<Integer, Integer > m = new HashMap();
        int maxToK  = 0;
        for (int k = H.length-1; k>0 ; k-- ) {
            if (maxToK < H[k]) {
                maxToK = H[k];
            }
            m.put(k, maxToK);
        }


        int maxToI = 0;
        int minResult = Integer.MAX_VALUE;
        for (int i = 0; i < H.length-1; i++) {
            if (maxToI < H[i]) {
                maxToI = H[i];
            }
            Integer maxRemain = m.get(i+1);

            Integer secondPart = maxToI * (i + 1) + maxRemain * (H.length - i - 1);
            if (secondPart < minResult) {
                minResult = secondPart;
            }
        }
        return minResult;

    }
}
