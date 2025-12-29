import java.util.Stack;
import java.util.Scanner;   

public class PrefixToInfix {

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + op1 + c + op2 + ")");
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter prefix expression: ");
        String prefix = sc.nextLine();

        System.out.println("Infix Expression: " + prefixToInfix(prefix));
        sc.close();
    }
}
