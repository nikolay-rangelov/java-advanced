package exercises;

import java.util.*;

import static java.lang.System.in;

public class Ex03_MaximumElement_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int numberOfCommands = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i < numberOfCommands; i++) {
            String command = sc.nextLine().strip();
            if(command.equals("2")) {
                //delete the element from the stack
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (command.equals("3")) {
                if (!stack.isEmpty()) {
                    System.out.println(Collections.max(stack));
                }
            } else {
                // push element into the stack
                int numToPush = Integer.parseInt(command.split("\\s+")[1]);
                stack.push(numToPush);
            }
        }
    }
}
