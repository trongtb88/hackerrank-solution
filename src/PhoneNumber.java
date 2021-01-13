import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PhoneNumber {

    public static long solution(String S) {
        // write your code in Java SE 8
        System.out.println(S);
        long total = 0;
        long maxFee = 0;
        String [] logLines = S.split("\n");
        Map<String, Integer> mapResult = new ConcurrentHashMap<>();
        for (String logLine : logLines) {
            String [] elements = logLine.split(",");
            String duration = elements[0];
            String phoneNumber = elements[1];
            int feeForCall = calculateFee(duration);
            if (mapResult.containsKey(phoneNumber)) {
                Integer totalFeeFor1Call = mapResult.get(phoneNumber);
                mapResult.put(phoneNumber, totalFeeFor1Call+feeForCall);
            } else {
                mapResult.put(phoneNumber, feeForCall);
            }
            total += mapResult.get(phoneNumber);
            if (mapResult.get(phoneNumber) > maxFee) {
                maxFee = mapResult.get(phoneNumber);
            }

            //System.out.println(feeForCall);
        }
//        long total = 0;
//        long maxFee = 0;
//        for (String phoneKey : mapResult.keySet()) {
//            total += mapResult.get(phoneKey);
//            if (mapResult.get(phoneKey) > maxFee) {
//                maxFee = mapResult.get(phoneKey);
//            }
//        }
        return total - maxFee;
    }

    private static int calculateFee(String duration) {
        String [] durationElements =  duration.split(":");

        Integer hours = Integer.valueOf(durationElements[0]);
        Integer minutes = Integer.valueOf(durationElements[1]);
        Integer seconds = Integer.valueOf(durationElements[2]);
        if (hours == 0 && minutes < 5) {
            return (minutes * 60 + seconds) * 3;
        } else {
            if (seconds == 0) {
                return (hours * 60 + minutes) * 150;
            } else {
                return (hours * 60 + minutes + 1) * 150;
            }
        }
    }
}
