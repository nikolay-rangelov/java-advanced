package lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Ex02_SimpleCalculator_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        ArrayDeque<String> expression = Arrays.stream(input.split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));
        while(expression.size() > 1) {
            int firstNum = Integer.parseInt(expression.pop());
            String operation = expression.pop();
            int secondNum = Integer.parseInt(expression.pop());
            int result = 0;
            if(operation.equals("+")) {
                result = firstNum + secondNum;
            } else {
                result = firstNum - secondNum;
            }
            expression.push(String.valueOf(result));
        }
        System.out.println(expression.peek());
    }
}
