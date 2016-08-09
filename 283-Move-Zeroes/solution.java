public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        int length = nums.length;
        int i = 0;
        for(int j=0; j<length; j++){
            if(nums[j]==0){
                continue;
            }else{
                nums[i] = nums[j];
                i++;
            }
        }
        while(i<length){
            nums[i] = 0;
            i++;
        }
    }
}