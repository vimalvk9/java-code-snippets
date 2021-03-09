import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String [] args){
        int[] candyType = new int[]{1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }

    private static int distributeCandies(int[] candyType) {
        int canEat = candyType.length / 2;

        Set<Integer> uniqCandyTypes = new HashSet<>();
        for(int idx=0; idx<candyType.length; idx++){
            uniqCandyTypes.add(candyType[idx]);
        }

        if (uniqCandyTypes.size() < canEat){
            canEat = uniqCandyTypes.size();
        }

        return canEat;
    }
}
