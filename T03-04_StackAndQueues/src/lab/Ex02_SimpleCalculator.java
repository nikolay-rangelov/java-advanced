package lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Ex02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        ArrayDeque<String> stack = Arrays.stream(input.split(" "))
                .collect(Collectors.toCollection(ArrayDeque::new));
        int sum = Integer.parseInt(stack.pop());
        while (!stack.isEmpty()) {
            String operation = stack.pop();
            int num = Integer.parseInt(stack.pop());
            if (operation.equals("+")) {
                //+ operation
                sum += num;
            } else {
                //- operation
                sum -= num;
            }
        }
        System.out.println(sum);
    }
}
