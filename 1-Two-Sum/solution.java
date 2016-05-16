public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return new int[] {-1, -1};
        }
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}