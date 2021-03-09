
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReorderDataInLogFiles {
    public static void main(String[] args){
        String logs[] = new String[]{"j mo", "5 m w", "g 07", "o 2 0", "t q h"};
        reorderLogFiles(logs);
    }

    public static String[] reorderLogFiles(String[] logs){

        List<String> allLogs = Arrays.asList(logs);
        List<String> digitLogs = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();

        for (String log : allLogs) {
            String [] eachLogs = log.split(" ");

            if (isNumeric(eachLogs[1])){
                digitLogs.add(log);
            }
            else{
                letterLogs.add(log);
            }
        }

        Collections.sort(letterLogs, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {

                        String[] splitArr1 = s1.split( " ");
                        String[] splitArr2 = s2.split(" ");

                        String[] subArr1 = Arrays.copyOfRange(splitArr1, 1, splitArr1.length);
                        String[] subArr2 = Arrays.copyOfRange(splitArr2, 1, splitArr2.length);

                        String str1 = String.join(" ", subArr1);
                        String str2 = String.join(" ", subArr2);

                        if (str1.compareTo(str2) == 0) {
                            return splitArr1[0].compareTo(splitArr2[0]);
                        }

                        return str1.compareTo(str2);
                    }
                });


        letterLogs.addAll(digitLogs);

        letterLogs.stream().forEach(System.out::println);

        return letterLogs.toArray(new String[0]);
    }

    public static boolean isNumeric(String log) {
        if (log.isEmpty()) {
            return false;
        }

        return log.chars().allMatch(Character::isDigit);
    }
}
