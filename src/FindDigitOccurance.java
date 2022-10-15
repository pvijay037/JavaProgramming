public class FindDigitOccurance {
    public static void main(String[] args) {
        int n = 99999;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 9) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);

    }

}
