public class BuildingOfCubes {
    public static long findNb(long m) {
        long n = 0;
        long sum = 0;
        while (sum < m) {
            n++;
            sum += n * n * n;
        }
        return sum == m ? n : -1;
    }

    public static long findNbBetter(long m) {
        long mm = 0, n = 0;
        while (mm < m) mm += ++n * n * n;
        return mm == m ? n : -1;
    }
}