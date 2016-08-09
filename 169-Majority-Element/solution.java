public class Solution {
    public int majorityElement(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length = nums.length;
        int candidate = 0;
        int count = 0;
        for(int num: nums){
            if(num==candidate && count!=0){
                count++;
            }else if(count==0){
                candidate = num;
                count++;
            }else if(num!=candidate){
                count--;
            }
        }
        return candidate;
    }
}