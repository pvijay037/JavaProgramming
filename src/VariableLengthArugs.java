import java.lang.reflect.Array;
import java.util.Arrays;

public class VariableLengthArugs {
    public static void main(String[] args) {
        // variable length arguments
        fun("vijay", "krishna", "ambica");

    }

    static void fun(String... v) {
        System.out.println(Arrays.toString(v));
    }

}