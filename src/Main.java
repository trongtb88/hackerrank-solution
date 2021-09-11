import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;


class Queue {
    private String [] elements;
    private int indexFirstElement;
    private int indexLastElement;
    private int capacity;
    private int count;

    public Queue(int size) {
        elements = new String[size];
        capacity = size;
        indexFirstElement = 0;
        indexLastElement = -1;
        count = 0;
    }

    public String take()
    {
        if (isEmpty())
        {
            return "";
        }
        String firstElement = elements[indexFirstElement];
        indexFirstElement = (indexFirstElement + 1) % capacity;
        count--;
        return firstElement;
    }

    public boolean offer(String str)
    {
        if (isFull())
        {
            return false;
        }

        indexLastElement = (indexLastElement + 1) % capacity;
        elements[indexLastElement] = str;
        count++;
        return true;
    }

    public int size()
    {
        return count;
    }

    public Boolean isFull()
    {
        return (size() == capacity);
    }


    public Boolean isEmpty()
    {
        return (size() == 0);
    }
}



public class Main {

    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    transient int a = 8;

    public static void main(String[] args) throws java.lang.Exception {
//        JumpingNumber jumpingNumber = new JumpingNumber();
//        jumpingNumber.targetNumber = 1000L;
//        jumpingNumber.printResult();

//        Interleaved interleaved = new Interleaved();
//        interleaved.A = "XY";
//        interleaved.B = "X";
//        interleaved.C = "XXY";
//        if (interleaved.isInterleaved()) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
        //System.out.println(PhoneNumber.solution("00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090"));
        //int[] A = {9, 1, 4, 9, 0, 4, 8, 9, 0, 1};
        //DirectRoad.solution(A);
        //System.out.println(NodeCount.solution(A));

//        int[] H = {1000};
//        System.out.println(CoverBuilding.solution(H));


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String firstLine = br.readLine();
//        String lineTarget = br.readLine();
//        ;
//
//        List<String> lines = new ArrayList<>();
//        Map<String, String> mapReversedWords = new HashMap<>();
//
//        Integer targetFirstPair = 0;
//        Integer targetSecondPair = 0;
//        String keyPairResult;
//        Integer sortestLength = Integer.MAX_VALUE;
//        //Queue queue = new Queue(capacity);
//
//
//        List<Integer> numbers = new ArrayList<>();
//        String line;
//        List<Long> numbersStr = new ArrayList<>();
//        while ((line = br.readLine()) != null) {
//            numbersStr.add(Long.valueOf(line));
//        }
//
////            System.out.println(reverseString.toString());


    }
}

