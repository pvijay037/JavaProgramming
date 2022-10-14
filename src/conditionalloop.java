import java.util.Scanner;

public class conditionalloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number grater than 2");
        int a = in.nextInt();
        int c = 2;
        while (c * c <= a) {
            if (a % c == 0) {
                System.out.println("it is not a prime number");
                c += 1;
                break;
            }
        }
        System.out.println("it is a prime number");
    }

}
