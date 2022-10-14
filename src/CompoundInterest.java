import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        double principal = 0.0, rate = 0.0, time = 0.0;
        int number = 0;
        double totalAmount = 0.0, com_intrest = 0.0;
        // object of scanner class
        Scanner in = new Scanner(System.in);
        // read numbers
        System.out.println("enter priincipal input ");
        principal = in.nextDouble();
        System.out.println("enter the annual compound ");
        rate = in.nextDouble();
        rate /= 100;
        System.out.println("enter time (in years) ");
        time = in.nextDouble();
        System.out.println("enter the no.of lines that intrest is compounded year");
        number = in.nextInt();
        // total amount calculate
        totalAmount = principal * Math.pow(1 + (rate / number), number * time);
        // compund intrest
        com_intrest = totalAmount - principal;
        // display result
        System.out.println("compound intrest= " + com_intrest);
        System.out.println("total amount" + totalAmount);
        // close scanner calss object
        in.close();
    }
}
