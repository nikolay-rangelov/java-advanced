package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex01_BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        ArrayDeque<String> history = new ArrayDeque<String>();
        String currentPage = null;
        String input = sc.nextLine();
        boolean printed = false;
        while(!input.equals("Home")) {
            printed = false;
            if(input.equals("back")) {
                if(!history.isEmpty()) {
                    currentPage = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    printed = true;
                }
            } else {
                if(currentPage != null) {
                    history.push(currentPage);
                    currentPage = input;
                } else {
                    currentPage = input;
                }
            }

            if(!printed) {
                System.out.println(currentPage);
            }
            input = sc.nextLine();
        }
    }
}
