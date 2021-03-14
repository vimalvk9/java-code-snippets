public class SumOddLengthArrays {

    public static void main(String args[]) {
        int[] nums = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(nums));
    }

    public static int sumOddLengthSubarrays(int[] nums) {
        int N = nums.length;
        int result = 0;

        for(int win=1; win<=N; win+=2) {
            result += getOddLengthSubarraySumWithWindow(nums, win);
        }

        return result;
    }

    private static int getOddLengthSubarraySumWithWindow(int[] nums, int window) {
        int sum = 0;
        int N = nums.length;

        for(int start=0; start<=N-window; start++) {

            int end = start + window - 1;
            System.out.println(start + "-" + end);
            for(int idx=start; idx<=end; idx++) {
                sum += nums[idx];
            }
        }

        return sum;
    }
}


