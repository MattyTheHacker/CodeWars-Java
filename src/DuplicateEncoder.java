public class DuplicateEncoder {
    static String encode(String word){
        String result = "";
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.lastIndexOf(word.charAt(i)) == word.indexOf(word.charAt(i))) {
                result += "(";
            } else {
                result += ")";
            }
        }
        return result;
    }
}