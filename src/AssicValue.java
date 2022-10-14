import java.util.Scanner;

public class AssicValue {
    public static void main(String[] args) {
        // declare a chart variable
        char ch;
        // declare int variable
        int value;
        // scanner object calss
        Scanner in = new Scanner(System.in);
        // read alphabet
        System.out.println("enter alphabet: ");
        ch = in.next().charAt(0);
        // convert char to ascii
        value = ch;
        // display ascii value
        System.out.println("Ascii value of " + ch + " = " + value);
        // or
        // we can drirectly display ascii value
        // using type casting (int)ch
        System.out.println("ASCII value of " + ch + " = " + (int) ch);
        // close scanner class objeect
        in.close();
    }

}
