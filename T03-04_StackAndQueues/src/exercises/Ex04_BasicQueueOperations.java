package exercises;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Ex04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] input = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        /*
        ArrayDeque<Integer> queue = Arrays.stream(sc.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
         */
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i < input[0]; i++) {
            queue.offer(sc.nextInt());
        }
        for (int i = 0; i < input[1]; i++) {
            queue.poll();
        }
        if (queue.contains(input[2])) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                System.out.println(0);
            }
        }
    }
}
