import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.print("Tell me your name ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());
        System.out.println(input.nextLine());

    }

}
