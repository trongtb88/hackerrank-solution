package AdvancedJava;

import java.util.Arrays;

public class JavaStreamPractice {
    public static void main(String[] args) {
        int[] a = {1, 7, 2, 8, 123, 5, 324};
        System.out.println( "Sum all : "  + Arrays.stream(a).sum());
        System.out.println( "Sum using reduce : " + Arrays.stream(a).reduce(0, (e1, e2) -> e1 + e2));
    }
}
