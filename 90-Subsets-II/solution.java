public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        List<Integer> sol = new ArrayList<Integer>();
        int length = nums.length;
        helper(nums, 0, res, sol, visited);
        return res;
    }
    private void helper(int[] nums, int pos, List<List<Integer>>res, List<Integer>sol){
        res.add(new ArrayList<Integer>(sol));
        for(int i=pos; i<nums.length; i++){
            if(i!=pos && nums[i]==nums[i-1] ){
                continue;
            }
            sol.add(nums[i]);
            helper(nums, i+1, res, sol, visited);
            sol.remove(sol.size()-1);
        }
    }
}