import java.util.Arrays;

public class SupermarketQueue {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] tills = new int[n];
        for (int customer : customers) {
            tills[0] += customer;
            Arrays.sort(tills);
        }
        return tills[n - 1];
    }
}
