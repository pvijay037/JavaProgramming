import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("enter two values ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int add = num1 + num2;

        System.out.println("sum of two values " + add);
    }

}
