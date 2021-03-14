import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {

    public static void main(String args[]) {

        int [] candies = new int[]{12,1,12};
        int extraCandies = 10;

        kidsWithCandies(candies, extraCandies).forEach(System.out::println);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int  maxCandies = candies[0];

        for(int kidCandies : candies) {
            maxCandies = Math.max(maxCandies, kidCandies);
        }

        List<Boolean> result = new ArrayList<>();
        for(int kidCandies: candies) {

            Boolean canHaveGreatest = kidCandies + extraCandies >= maxCandies ? Boolean.TRUE : Boolean.FALSE;
            result.add(canHaveGreatest);
        }

        return result;
    }
}
