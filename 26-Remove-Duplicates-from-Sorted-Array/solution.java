public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length<2){
            return 0;
        }
        int length = nums.length;
        int slow = 0;
        int fast = 1;
        Arrays.sort(nums);
        while(fast<length){
            if(nums[slow]==nums[fast]){
                int temp = nums[fast];
                while(fast<length && nums[fast]==temp){
                    fast++;
                }
                nums[slow]=nums[fast];
            }
            slow++;
            fast++;
        }
        return slow+1;
    }
}