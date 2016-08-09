public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length = nums.length;
        int start = 0;
        int next = 0;
        while(next<length){
            if(nums[next]!=val){
                nums[start] = nums[next];
                start++;
            }
            next++;
        }
        return start;
    }
}