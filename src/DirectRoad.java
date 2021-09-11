import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DirectRoad {


//    T[0] = 9    T[1] = 1    T[2] = 4
//    T[3] = 9    T[4] = 0    T[5] = 4
//    T[6] = 8    T[7] = 9    T[8] = 0
//    T[9] = 1

    public static int[] solution(int[] T) {
        int capital = 0;
        Map<Integer, List<Integer>> mapNodes = new ConcurrentHashMap<>();
        for (int i = 0; i < T.length; i++) {
            if (T[i] == i) {
                capital = i;
            } else {
                List<Integer> a = null;
                if  (mapNodes.containsKey(T[i])) {
                    a = mapNodes.get(T[i]);
                    a.add(i);
                } else {
                    a = new ArrayList<>();
                    a.add(i);
                }
                mapNodes.put(T[i], a);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= T.length-1; i++) {
            System.out.println(calulateDistance(capital, i, mapNodes));
            result.add(calulateDistance(capital, i, mapNodes));
        }
        int[] array = result.stream().mapToInt(i->i).toArray();

        return array;

    }

    /***
     * return distance for city i, not need using recursive function.
     * @param capital
     * @param i
     * @param mapNodes
     * @return
     */
    private static int calulateDistance(int capital, int i, Map<Integer, List<Integer>> mapNodes) {
        int resultDistance = 0;
        if ( i == 1) {
            return mapNodes.get(capital).size();
        } else {
            List<Integer> values = mapNodes.get(capital);
            for (int k = 2; k <= i; k++) {
                List<Integer> loopInsideNodes = new ArrayList<>();
                for (Integer v : values) {
                    if (mapNodes.containsKey(v)) {
                        if (k == i) {
                            resultDistance += mapNodes.get(v).size();
                        }
                        loopInsideNodes.addAll(mapNodes.get(v));
                    }
                }
                values = loopInsideNodes;
            }
        }
        return resultDistance;
    }

}
