import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your salary input");
        int a = input.nextInt();
        if (a >= 5000) {
            a += 3000;
        } else if (a >= 3000) {
            a += 1500;
        } else {
            a += 750;
        }
        System.out.println("you salary increased" + a);
    }
}
