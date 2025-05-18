package exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Ex02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] input = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i < input[0]; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < input[1]; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            if (stack.contains(input[2])) {
                System.out.println("true");
            } else {
                int min = Integer.MAX_VALUE;
                while (!stack.isEmpty()) {
                    int num = stack.pop();
                    min = Math.min(min, num);
                }
                System.out.println(min);
            }
        }
    }
}
