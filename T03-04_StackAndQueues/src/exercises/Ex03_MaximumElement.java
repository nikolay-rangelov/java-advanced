package exercises;

import java.util.*;

import static java.lang.System.in;

public class Ex03_MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int commandsNum = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i < commandsNum; i++) {
            int[] input = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if (input[0] == 1) {
                stack.push(input[1]);
            } else if (input[0] == 2) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (input[0] == 3) {
                if (!stack.isEmpty()) {
                    System.out.println(Collections.max(stack));
                }
            }
        }
    }
}
