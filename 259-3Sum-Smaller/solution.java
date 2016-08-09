public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length = nums.length;
        int count = 0;
        for(int i=0; i<length-2; i++){
            int start = i+1;
            int end = length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum<target){
                    count = count+(end-start);
                    start++;
                }else{
                    end--;
                }
            }
        }
        return count;
    }
}