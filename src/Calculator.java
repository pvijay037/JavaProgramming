import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.println("enter the operator");
            char ch = scan.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("enter two input numbers ");
                int a = scan.nextInt();
                int b = scan.nextInt();

                if (ch == '+') {
                    ans = a + b;
                }
                if (ch == '-') {
                    ans = a - b;
                }
                if (ch == '*') {
                    ans = a * b;
                }
                if (ch == '/') {
                    ans = a / b;
                }
                if (ch == '%') {
                    ans = a % b;
                } else if (ch == 'X' || ch == 'x') {
                    break;
                }
            } else {
                System.out.println("invalid input");
            }
            System.out.println(ans);

        }
    }
}