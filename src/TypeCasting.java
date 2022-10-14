import java.net.SocketImpl;
import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.serial.SQLOutputImpl;
import javax.xml.transform.SourceLocator;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        int num = input.nextInt();
        System.out.println(num);
        // type casting
        int num = (int) (67.56f);
        System.out.println(num);

        // automatic type promotion in epression
        int a = 257;
        byte b = (byte) (b);
        // 257 %256 = 1

        byte a=40;
        byte b=50;
        byte c=100;
        int d=(a*b)/c;
        System.out.println(d);
    }So
}
