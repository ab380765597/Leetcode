public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return new int[] {-1, -1};
        }
        int length = nums.length;
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0;i<length; i++){
            if(map.containsKey(target-nums[i])){
                res[1] = i ;
                res[0] = map.get(target-nums[i]) ;
                break;
            }else{
                map.put(nums[i], i);
            }
        }
        return res;
    }
}