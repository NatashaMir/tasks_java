public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int bestSum = nums[0];
        int currSum = nums[0];


        for (int i = 1; i < nums.length; i++){

            currSum = Math.max(nums[i], currSum + nums[i]);

            bestSum = Math.max(bestSum, currSum);
        }

        return bestSum;

    }
}
