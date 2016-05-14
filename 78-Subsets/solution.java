public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        List<Integer> sol = new ArrayList<Integer>();
        helper(nums, res, sol, 0);
        return res;
    }
    private void helper(int[] nums, List<List<Integer>> res, List<Integer> sol, int pos){
        res.add(new ArrayList<Integer>(sol));
        for(int i=pos; i<nums.length; i++){
            sol.add(nums[i]);
            helper(nums, res, sol, i+1);
            sol.remove(sol.size()-1);
        }
    }
}