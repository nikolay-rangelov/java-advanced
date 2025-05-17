package lab;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex03_DecimalToBinaryConverter_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int inputNumber = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> binaryNum = new ArrayDeque<Integer>();
        while (inputNumber != 0) {
            int digit = inputNumber % 2;
            inputNumber = inputNumber / 2;
            binaryNum.push(digit);
        }
        if (binaryNum.isEmpty()) {
            System.out.println(0);
        } else {
            while (!binaryNum.isEmpty()) {
                System.out.print(binaryNum.pop());
            }
        }
    }
}
