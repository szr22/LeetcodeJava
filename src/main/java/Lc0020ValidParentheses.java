import java.util.Stack;

public class Lc0020ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean res = isValid(s);
        System.out.println(res);
        s = "([)]";
        res = isValid(s);
        System.out.println(res);
        s = "{[]}";
        res = isValid(s);
        System.out.println(res);
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c==')' && stack.peek()!='(') {
                return false;
            } else if (c==']' && stack.peek()!='[') {
                return false;
            } else if (c=='}' && stack.peek()!='{') {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
