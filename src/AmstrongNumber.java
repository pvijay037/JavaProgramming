import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vijay = in.nextInt();
        // boolean ans = funtio(vijay);
        System.out.println(funtio(vijay));
    }

    static boolean funtio(int vijay) {
        int q = vijay;
        int total = 0;
        while (vijay > 0) {
            int rem = vijay % 10;
            vijay = vijay / 10;
            total = total + rem * rem * rem;
        }
        return total == q;
        // 153
        // rem=n%10;
        // sum=sum+rem*rem*rem;
        // sout("sum")
        // original_number=n/10;
        // if sum== original_number
        // return true
    }
}