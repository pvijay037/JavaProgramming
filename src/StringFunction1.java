import java.util.Scanner;

public class StringFunction1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String msg = greet(name);
        System.out.println(msg);

    }

    static String greet(String name) {
        String message = "how are you " + name;
        return message;
    }
}