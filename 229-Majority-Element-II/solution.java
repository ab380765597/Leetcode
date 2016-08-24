public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        int candidate = 0;
        int count=0;
        int length = nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==candidate){
                count++;
            }else if(count==0){
                candidate = nums[i];
            }else{
                count--;
            }
        }
        return candidate;
    }
}