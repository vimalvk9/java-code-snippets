public class ShuffleArray {
    public static void main(String args[]){
        shuffle(new int[]{1,2,3,4,4,3,2,1}, 4);
    }

    public static int[] shuffle(int[] nums, int n) {

        int result[] = new int[nums.length];
        int idx = 1, x_idx = 0, y_idx = n;

        for(idx=1; idx<=nums.length; idx++){
            System.out.println(idx + " " + x_idx + " " + y_idx);
            if (idx % 2 == 0) {
                result[idx - 1] = nums[y_idx];
                y_idx++;
            } else {
                result[idx - 1] = nums[x_idx];
                x_idx++;
            }
        }

        for(int num: result){
            System.out.println(num);
        }

    return result;
    }

}
