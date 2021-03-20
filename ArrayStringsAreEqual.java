import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayStringsAreEqual {

    public static void main(String args[]) {

        String [] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String concatWord1 = String.join("", word1);
        String concatWord2 = String.join("", word2);

        System.out.println(concatWord1 + "\n" + concatWord2);
        return concatWord1.compareTo(concatWord2) == 0;
    }
}


