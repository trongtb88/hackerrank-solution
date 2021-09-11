import java.util.Scanner;

public class CheckStringReversSame {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int index = 0; index < n; index++) {
            String originalString = s.next();
            StringBuilder tempStr = new StringBuilder();
            StringBuilder reverseStr = tempStr.reverse();
            if (reverseStr.toString().equals(originalString)) {
                System.out.println("OK");
            }
        }
    }
}
