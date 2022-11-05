import java.util.Arrays;

public class EnoughIsEnough {
    // Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int[] result = new int[elements.length];
        int[] counts = new int[100];
        int index = 0;
        for (int element : elements) {
            if (counts[element] < maxOccurrences) {
                result[index++] = element;
                counts[element]++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}