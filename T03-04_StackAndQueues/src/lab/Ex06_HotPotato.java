package lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Ex06_HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> queue = Arrays.stream(input.split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is " + queue.poll());
    }
}
