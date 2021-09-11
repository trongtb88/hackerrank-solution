package DEA.problem2;

import java.util.Map;
import java.util.TreeMap;

public class MainProblem2 {
    static Map<Woman, Integer> womanMap = new TreeMap();


    static boolean doesWomenExist(Woman woman) {
        return womanMap.containsKey(woman);
    }

    static void printWomanAgeByIncreasingOrder() {
        System.out.println("Now we can print Woman age by increasing order without sorting");
        for (Map.Entry<Woman, Integer> entry : womanMap.entrySet()) {
            System.out.println("Key : " + entry.getKey().getAge()
                    + " Value : " + entry.getValue());
        }
    }

    public static void main(String args[]) {
        Woman person0 = new Woman(60);
        Woman person1 = new Woman(25);
        Woman person2 = new Woman(35);
        Woman person3 = new Woman(25);
        Woman person4 = new Woman(27);

        womanMap.put(person0, 1);
        womanMap.put(person1, 1);
        womanMap.put(person2, 1);
        //womanMap.put(person3, 1);
        womanMap.put(person4, 1);

        //printWomanAgeByIncreasingOrder();
        System.out.println("Person 3 in map ? : " + doesWomenExist(person3));
        System.out.println("Person 4 in map ? : " + doesWomenExist(person4));


    }


}
