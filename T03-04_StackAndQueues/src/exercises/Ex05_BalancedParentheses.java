package exercises;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        boolean isBalanced = true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                char previous = ' ';
                if (!stack.isEmpty()) {
                    previous = stack.pop();
                    if (    !((previous == '(' && c == ')') ||
                            (previous == '{' && c == '}') ||
                            (previous == '[' && c == ']') )) {
                        isBalanced = false;
                        break;
                    }
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
