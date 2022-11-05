import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {
    public static String high(String s) {
        String[] words = s.split(" ");
        int max = 0;
        String maxWord = "";
        for (String word : words) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c - 'a' + 1;
            }
            if (score > max) {
                max = score;
                maxWord = word;
            }
        }
        return maxWord;
    }


    public static String Alternative(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(a -> a.chars()
                        .map(i -> i - 96).sum()))
                .get();
    }
}
