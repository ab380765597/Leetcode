public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length = nums.length;
        int start = 0;
        for(int j=1; j<length; j++){
            if(nums[j]!=nums[start]){
                start++;
                nums[start] = nums[j];
            }
        }
        return start+1;
    }
}