package exercises;

import java.util.*;

import static java.lang.System.in;

public class Ex02_BasicStackOperations_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int numbersToRead = sc.nextInt();
        int numbersToPop = sc.nextInt();
        int numberToCheck = sc.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i < numbersToRead; i++) {
            stack.push(sc.nextInt());
        }
        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(numberToCheck)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
