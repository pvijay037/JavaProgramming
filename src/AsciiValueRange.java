import java.util.Scanner;

public class AsciiValueRange {
    public static void main(String[] args) {
        // declare var
        char maxnum, minnum;
        Scanner in = new Scanner(System.in);
        System.out.println("enter minvalue ");
        minnum = in.next().charAt(0);
        System.out.println("enter max value");
        maxnum = in.next().charAt(0);
        // display ascii value
        System.out.println("the range from" + minnum + "to" + maxnum);

        for (char i = minnum; i < maxnum; i++) {
            System.out.print(i + "=" + (int) i);
            System.out.print(",\t");
        }
        in.close();

    }

}
