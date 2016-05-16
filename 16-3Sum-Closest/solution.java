public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return target;
        }
        int length = nums.length;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int near = 0;
        for(int i=0; i<length-2; i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(minDiff>Math.abs(target-sum)){
                    near = sum;
                    minDiff = Math.abs(target-sum);
                }
                if(sum>target){
                    end--;
                }else if(sum<target){
                    start++;
                }else{
                    return target;
                }
            }
        }
        return near;
    }
}