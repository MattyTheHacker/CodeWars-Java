public class CamelCaseMethod {
    // Simple .camelCase method that returns a string formatted into camel case
    public static String camelCase(String str) {
        String input = str.trim();
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(word.substring(0, 1).toUpperCase());
                sb.append(word.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }

    public static String Alternative(String str) {
        // your code here
        String[] strings = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            if (string.length() > 0) {
                stringBuilder.append(string.replaceFirst(string.substring(0, 1), string.substring(0, 1).toUpperCase()));
            }
        }
        return new String(stringBuilder);

    }
}
