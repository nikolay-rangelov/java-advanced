package exercises;

import java.util.Scanner;

import static java.lang.System.in;

public class Demo_NextLineVsNextInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        /*int num = sc.nextInt();
        System.out.println(num);
         */
        while (!sc.hasNextInt()) {
            System.out.println("Not a number, skipping: " + sc.next());
        }
        int x = sc.nextInt();

    }
}
