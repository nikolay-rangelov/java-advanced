package lab;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class Ex01_BrowserHistory_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String input = sc.nextLine();
        ArrayDeque<String> history = new ArrayDeque<String>();
        while(!input.equals("Home")){
            if(input.equals("back")){
                // back
                if (history.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    history.pop();
                    System.out.println(history.peek());
                }
            } else {
                // URL in entered
                history.push(input);
                System.out.println(input);
            }
            input = sc.nextLine();
        }
    }
}
