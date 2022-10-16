import java.util.Scanner;

public class FunctionOverloading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = fun(10, 20);
        System.out.println(ans);

    }

    static int fun(int a, int b) {
        return a + b;
    }

    static int fun(int a, int b, int c) {
        return a + b + c;
    }

}