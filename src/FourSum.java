import java.util.*;

public class FourSum {
    static class Pair {
        int first, second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static void fourSum(int [] a, int sum) {
        Map<Integer, Pair> mp = new HashMap<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                mp.put(a[i] + a[j], new Pair(i, j));
            }
        }
        List<Map<Integer, Integer>> resultMap  = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sumPair = a[i] + a[j];
                if (mp.containsKey(sum - sumPair)) {
                    Pair p = mp.get(sum - sumPair);
                    if (p.first != i && p.first != j
                            && p.second != i && p.second != j) {
                        if (resultMap.size() == 0) {
                            Map<Integer, Integer> first = new HashMap<>();
                            first.put(i, i);
                            first.put(j, j);
                            first.put(p.first, p.first);
                            first.put(p.second, p.second);
                            resultMap.add(first);

                        } else {
                            Iterator<Map<Integer, Integer>> iterator = resultMap.iterator();
                            HashMap<Integer, Integer> newMap = new HashMap<>();
                            boolean isValid = true;
                            while (iterator.hasNext()) {
                                Map<Integer, Integer> map = iterator.next();
                                if (map.containsKey(i)
                                        && map.containsKey(j)
                                        && map.containsKey(p.first)
                                        && map.containsKey(p.second)) {
                                    isValid = false;
                                }
                            }
                            if (isValid) {
                                newMap.put(i, i);
                                newMap.put(j, j);
                                newMap.put(p.first, p.first);
                                newMap.put(p.second, p.second);
                                resultMap.add(newMap);
                            }
                        }
                    }
                }

            }
        }
        List<Integer[]> finalResult = new ArrayList<>();
        for (Map<Integer, Integer> result : resultMap) {
            Integer[] r = new Integer[result.keySet().size()];
            int i = 0;
            for(Integer k : result.keySet()) {
                r[i++] = a[k];
                System.out.print(a[k] + " ");
            }
            System.out.println();
            finalResult.add(r);
        }

    }
    public static void main(String[] args)
    {
        int arr[] = { 7, 6, 4, -1, 1, 2 };
        int sum = 16;
        fourSum(arr, sum);
    }
}
