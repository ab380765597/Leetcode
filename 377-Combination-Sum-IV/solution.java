public class Solution {
    public int combinationSum4(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length = nums.length;
        Arrays.sort(nums);
        int[] stair = new int[target+1];
        for(int i=0; i<target+1; i++){
            for(int num: nums){
                if(i<num){
                    break;
                }else if(i==num){
                    stair[i]= stair[i]+1;
                }else{
                    stair[i]=stair[i]+stair[i-num];
                }
            }
        }
        return stair[target];
    }
}