import java.util.Stack;
import java.util.Scanner;

public class PrefixToPostfix {

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static String prefixToPostfix(String prefix) {

        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else if (isOperator(c)) {
                if (stack.size() < 2) {
                    return "Invalid Prefix Expression";
                }

                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push(op1 + op2 + c);
            }
        }

        // Final validation
        if (stack.size() != 1) {
            return "Invalid Prefix Expression";
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = sc.next();
        System.out.println("Postfix Expression: " + prefixToPostfix(prefix));
    }
}
