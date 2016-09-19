public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return res;
        }
        List<Integer> sol = new ArrayList<Integer>();
        Arrays.sort(nums);
        helper(nums, 0, sol, res);
        return res;
    }
    private void helper(int[] nums, int pos, List<Integer> sol, List<List<Integer>> res){
        res.add(new ArrayList<Integer>(sol));
        for(int i=pos; i<nums.length; i++){
            sol.add(nums[i]);
            helper(nums, i+1, sol, res);
            sol.remove(sol.size()-1);
        }
    }
}