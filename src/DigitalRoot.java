// Digital root is the recursive sum of all the digits in a number.

public class DigitalRoot {
    public static int digital_root(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum > 9) {
            return digital_root(sum);
        }
        return sum;
    }
}
