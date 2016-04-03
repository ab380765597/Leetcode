public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length = nums.length;
        int[] res = new int[length];
        for(int i=0; i<length; i++){
            res[i] = 1;
        }
        for(int i=1; i<length; i++){
            for(int j=0; j<i; j++){
                if(nums[j]<=nums[i]){
                    res[i] = Math.max(res[i], res[j]+1);
                }
            }
        }
        int max = 0;
        for(int i=0; i<length; i++){
            max = Math.max(res[i], max);
        }
        return max;
    }
}