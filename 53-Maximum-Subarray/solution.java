public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length == 0){
            return 0;
        }
        int length = nums.length;
        int minSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<length;i++){
            sum = sum +nums[i];
            maxSum = Math.max(maxSum, sum-minSum);
            minSum = Math.min(minSum, sum);
        }
        return maxSum;
    }
}