public class Reverse {
    public static void main(String[] args) {
        int num = 124541;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            count = count * 10 + rem;

        }
        System.out.println(count);
    }
}