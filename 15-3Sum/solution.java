public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return res;
        }
        int length = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<length-1; i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum > 0){
                    end--;
                }else if(sum<0){
                    start++;
                }else{
                    List<Integer> sol = new ArrayList<Integer>();
                    sol.add(nums[i]);
                    sol.add(nums[start]);
                    sol.add(nums[end]);
                    res.add(sol);
                    start++;
                    end--;
                    while(start<end && nums[start]==nums[start-1] ){
                        start++;
                    }
                    while(start<end && nums[end]==nums[end+1]){
                        end--;
                    }
                }
            }
        }
        return res;
    }
}