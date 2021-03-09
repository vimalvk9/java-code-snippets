import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMismatch {
    public static void main(String args[]){
        int[] nums = new int[]{2,2};

        int[] res = findErrorNums(nums);
        for(int idx=0;idx<res.length;idx++){
            System.out.println(res[idx]);
        }
    }

    public static int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> frequencyCt = new HashMap<>();

        for(int idx: nums){
            Integer val = frequencyCt.get(idx);
            if (val == null){
                frequencyCt.put(idx,1);
            }
            else{
                frequencyCt.put(idx,++val);
            }
        }

        int dup = -1, missing = -1;
        for(int itr=1; itr<=nums.length; itr++) {
            if (frequencyCt.get(itr) == null){
                missing = itr;
            }
            if (frequencyCt.get(itr) != null && frequencyCt.get(itr) == 2){
                dup = itr;
            }
        }

        return new int[]{dup, missing};
    }
}
