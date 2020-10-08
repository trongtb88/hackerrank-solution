import java.util.Stack;

public class BalancedBrackets {
    public static boolean balancedBrackets(String str) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            String item = String.valueOf(str.charAt(i));
            if (isBracketCharacter(item)) {
                if (stack.empty()) {
                    stack.push(item);
                } else {
                    String top = stack.peek();
                    if (isPairBracket(top, item)) {
                        stack.pop();
                    } else {
                        stack.push(item);
                    }
                }
            }

        }
        return stack.isEmpty();
    }

    private static boolean isBracketCharacter(String item) {
        if ("{".equals(item) || "}".equals(item)
        || "(".equals(item) || ")".equals(item)
        || "[".equals(item) || "]".equals(item)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPairBracket(String left, String right) {
        if ("{".equals(left) && "}".equals(right)) return true;
        if ("(".equals(left) && ")".equals(right)) return true;
        if ("[".equals(left) && "]".equals(right)) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "(a)";
        System.out.println(balancedBrackets(s));
    }
}
