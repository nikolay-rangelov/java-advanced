package exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        String[] numbers = input.split("\\s+");
        ArrayDeque<Integer> numbersStack = new ArrayDeque<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            numbersStack.push(Integer.parseInt(numbers[i]));
        }
        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() +  " ");
        }
    }
}
