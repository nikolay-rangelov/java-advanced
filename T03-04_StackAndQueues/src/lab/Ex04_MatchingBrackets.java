package lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        ArrayDeque<Integer> positions = new ArrayDeque<Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                positions.push(i);
            } else if (input.charAt(i) == ')') {
                int startPos = positions.pop();
                int endPos = i;
                System.out.println(input.substring(startPos, endPos + 1));
            }
        }
    }
}
