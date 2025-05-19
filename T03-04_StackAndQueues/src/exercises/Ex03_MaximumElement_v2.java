package exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex03_MaximumElement_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int numberOfCommands = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i < numberOfCommands; i++) {
            String command = sc.nextLine().strip();
            if(command.equals("2")) {

            } else if (command.equals("3")) {

            } else {
                int num = Integer.parseInt(Arrays.stream(command.split("\\s+")[1]);
                int numberToPush = Integer.parseInt(command.split("\\s+")[1]);
            }
        }
    }
}
