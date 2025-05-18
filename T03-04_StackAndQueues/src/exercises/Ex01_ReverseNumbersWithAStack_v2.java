package exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex01_ReverseNumbersWithAStack_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(input.split("\\s+")).map(Integer::parseInt).forEach(stack::push);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
