import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // finding the biggest number
        if (a > b && a > c) {
            System.out.println("a is the biggest number");
        } else if (b > a && b > c) {
            System.out.println("b is the biggest number");
        } else if (c > a && c > b) {
            System.out.println("c is the biggest number");
        } else {
            System.out.println("all numbers are equal");
        }

    }

}
