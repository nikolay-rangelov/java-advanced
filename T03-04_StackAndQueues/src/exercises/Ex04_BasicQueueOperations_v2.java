package exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Ex04_BasicQueueOperations_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbersToPush = sc.nextInt();
        int numbersToPop = sc.nextInt();
        int elementToCheck = sc.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i < numbersToPush; i++) {
            queue.offer(sc.nextInt());
        }
        for (int i = 0; i < numbersToPop; i++) {
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }

        if (queue.contains(elementToCheck)) {
            System.out.println("true");
        } else if (!queue.isEmpty()){
            System.out.println(Collections.min(queue));
        } else {
            System.out.println(0);
        }
    }
}
