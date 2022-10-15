import java.util.Scanner;

public class FunctionProgram {
    public static void main(String[] args) {
        count();
    }

    static void count() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two values");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = a + b;
        System.out.println("addition of two number: " + count);

        /* return_type function()
                body
            end
         */
    }

}
