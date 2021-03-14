import java.util.HashSet;
import java.util.Set;

public class NumIdenticalPairs {

    public static void main(String args[]) {

        int nums [] = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        Set<Integer> uniqNums = new HashSet<>();

        for(int num: nums) {
            uniqNums.add(num);
        }

        if (uniqNums.size() == 1) {
            return (nums.length * (nums.length-1))/2;
        }
        if (uniqNums.size() == nums.length) {
            return 0;
        }

        int goodCt = 0;
        for(int first=0; first<nums.length; first++){
            for(int second=first+1; second<nums.length; second++){
                if (nums[first] == nums[second]){
                    goodCt++;
                }
            }
        }

        return goodCt;
    }
}


