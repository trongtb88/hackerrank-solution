
import java.io.*;
import java.util.*;
import java.lang.*;

    public class Palin
    {
        public static void main(String args[])
        {
            String s1,s2,snew,sleft,sright,rev;
            int l1,l2;
            Scanner s=new Scanner(System.in);
            int[] arr=new int[20];
            int n = s.nextInt();
            for (int index = 0; index < n; index ++) {

                s1 = s.next();
                s2 = s.next();
                l1 = s1.length();
                l2 = s2.length();
                int count = 0, min = 9999;
                if (l2 > l1) {
                    System.out.print("-1");
                }
                for (int i = 0; i < l1 - l2 + 1; i++) {

                    String temp = s1.substring(0, i) + s2 + s1.substring(i + l2);
                    int cost = 0;
                    // calculate cost to place s2
                    for (int j = i; j < i + l2; j++) {

                        if (s1.charAt(j) != temp.charAt(j))
                            cost++;
                    }
                    int z = 0;
                    // find the cost to convert new string to palindrome
                    for (int j = 0; j < l1 / 2; j++) {

                        if ((j < i || j >= i + l2) && temp.charAt(j) != temp.charAt(l1 - j - 1)) // if s2 is in the first half of new string
                            cost++;
                        else if (temp.charAt(j) != temp.charAt(l1 - j - 1) && (l1 - j - 1 < i || l1 - j - 1 >= i + l2)) // if s2 is in the second half of new string
                            cost++;
                        else if (temp.charAt(j) != temp.charAt(l1 - j - 1)) { // if s2 is in both halves

                            z = 1;
                            break;
                        }
                    }
                    if (z == 0)
                        min = Math.min(min, cost);
                }
                System.out.println(min);

            }

        }
    }

