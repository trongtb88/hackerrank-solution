//1h 52m
//
//        1
//        Task description
//        Task
//        Java 8
//        C
//        C++
//        C#
//        Go
//        Java 8
//        Java 11
//        JavaScript
//        Kotlin
//        Lua
//        Objective-C
//        Pascal
//        PHP
//        Perl
//        Python
//        Ruby
//        Scala
//        Swift 4
//        Visual Basic
//        Kate was given a birthday gift of three theater tickets. Now she is browsing the theater program for the next N days. On the program, performances are named by integers. Every day, one performance is staged. Kate wants to choose three days (not necessarily consecutive) to go to the theater.
//
//        In how many ways can she use her tickets? Two ways are different if the sequences of watched performances are different. Kate likes the theater, so she may watch one performance more than once. For example, if N = 4 and theater program looks as following: [1, 2, 1, 1], Kate has four possibilities to choose the dates: [1, 2, 1, 1], [1, 2, 1, 1], [1, 2, 1, 1], and [1, 2, 1, 1], but they create only three different sequences: (1, 2, 1), (1, 1, 1) and (2, 1, 1). The correct answer for this example is 3. Notice that the order of performances matters, so the first and the last sequences are considered different.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A consisting of N integers, denoting names of performances for the next N days, returns the number of possible ways to spend the tickets. Since the answer can be very large, provide it modulo 109 + 7 (1,000,000,007).
//
//        For example, given A = [1, 2, 1, 1], the function should return 3 as exmplained above.
//
//        Given A = [1, 2, 3, 4], the function should return 4. There are four ways to spend tickets: (1, 2, 3), (1, 2, 4), (1, 3, 4) and (2, 3, 4).
//
//        Given A = [2, 2, 2, 2], the function should return 1. There is only one way to spend tickets: (2, 2, 2).
//
//        Given A = [2, 2, 1, 2, 2], the function should return 4. There are four ways to spend tickets: (1, 2, 2), (2, 1, 2), (2, 2, 1) and (2, 2, 2).
//
//        Given A = [1, 2], the function should return 0. Kate cannot use all three tickets in only two days.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [0..100,000];
//        each element of array A is an integer within the range [1..N].
//        Copyright 2009–2020 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
//        Solution
//        Files
//        task1
//        solution.java
//        test-input.txt
//        solution.java
//          
//        You will see save status here
//        Test Output
//        Test Output
//
//


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TheaterTicket {











    //2, 2, 1, 2, 2, 2, 3, 2, 4, 4, 4, 2, 2, 2, 2, 2 > 4

//    3 + 1 + 1 = 5
//
//
//    5!
//    3!(5-3)!
//
//    2 2 1
//    2 1 2
//    2 2 2
//    1 2 2
//    1 2 3
//    2 2 3
//    2 3 2
//    1 3 2
//    3 2 2
//    3 2 1

//


//    public int solution(int[] A) {
//        if (A.length < 3) {
//            return 0;
//        }
//        // write your code in Java SE 8
//        Map<Integer, Integer> m = new HashMap<>();
//        for  (int i = 0 ; i < A.length; i++) {
//            int t = 1;
//            if (m.containsKey(A[i])) {
//                t = m.get(A[i]);
//                t++;
//            }
//            m.put(A[i], t);
//        }
//        for (Integer k : m.keySet()) {
//            if (m.get(k) > 3) {
//                m.put(k, 3);
//            }
//        }
//
//
//
//    }
}
