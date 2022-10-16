import java.util.Arrays;

public class ArrayFunction {

    public static void main(String[] args) {
        int[] Chan = { 1, 3, 4, 6 };
        change(Chan);
        System.out.println(Arrays.toString(Chan));
        // Scanner in = new Scanner(System.in);
    }

    static void change(int[] num) {
        num[0] = 99;
        // in arrays the values will be changed .
        //in string the values can not change.
        //in integer the value can not change.
    }
}