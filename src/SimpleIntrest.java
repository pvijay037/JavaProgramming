import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        double pricipal_ratio = 0.0;
        double rate = 0.0;
        double time = 0.0;
        double intrest = 0.0;
        // object of scanner calss
        Scanner in = new Scanner(System.in);
        // read inputs
        System.out.println("enter proincipal input ");
        pricipal_ratio = in.nextDouble();
        System.out.println("enter time in months ");
        time = in.nextDouble();
        System.out.println("enter the intrest");
        rate = in.nextDouble();
        // calculate simple intrest
        intrest = (pricipal_ratio * rate * time) / 100;
        // result
        System.out.println("simple intrest " + intrest);
        System.out.println("total amount to pay" + (pricipal_ratio + intrest));

        // close scanner in
        in.close();
    }

}
