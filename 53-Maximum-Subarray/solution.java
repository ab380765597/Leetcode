public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int maxValue = nums[0];
        int sum = 0;
        int minV = Integer.MAX_VALUE;
        for(int num: nums){
            sum = sum+num;
            maxValue = Math.max(maxValue, sum-minV);
            minV = Math.min(minV, sum);
        }
        return maxValue;
    }
}