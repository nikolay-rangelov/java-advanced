package lab;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex05_PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        ArrayDeque<String> waitingDocs = new ArrayDeque<String>();
        ArrayDeque<String> finalPipeline = new ArrayDeque<String>();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                // cancel command
                if (waitingDocs.isEmpty()) {
                    finalPipeline.offer("Printer is on standby");
                } else {
                    finalPipeline.offer("Canceled " + waitingDocs.poll());
                }
            } else {
                // file name for printing
                waitingDocs.offer(input);
            }
            input = sc.nextLine();
        }
        while (!waitingDocs.isEmpty()) {
            finalPipeline.offer(waitingDocs.poll());
        }
        while (!finalPipeline.isEmpty()) {
            System.out.println(finalPipeline.poll());
        }
    }
}