import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        boolean same = false;
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;
        for (int i : a) {
            i = i * i;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i : a) {
            if (i != b[i]) {
                break;
            } else {
                same = true;
            }
        }
        return same;
    }
}
