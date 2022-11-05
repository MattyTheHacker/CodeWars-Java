import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Substrings {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> list = new ArrayList<>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    list.add(s1);
                    break;
                }
            }
        }
        return list.stream().sorted().toArray(String[]::new);
    }

    public static String[] Alternative(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str ->
                        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
