import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CountConsistentStrings {

    public static void main(String args[]) {
        String allowed = "abc";
        String [] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int result = 0;

        for(String word: words) {
            if (isConsistent(allowed, word)) {
                result++;
            }
        }
        return result;
    }

    public static boolean isConsistent(String allowed, String word) {

        StringBuilder sb = new StringBuilder();
        word.chars().distinct().forEach(i -> sb.append((char)i));
        String unqWord = sb.toString();

        for (int idx = 0; idx < unqWord.length(); idx++) {
            if (allowed.indexOf(unqWord.charAt(idx)) == -1) {
                return false;
            }
        }
        return true;
    }
}


