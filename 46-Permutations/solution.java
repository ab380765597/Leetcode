public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            return res;
        }
        List<Integer> sol = new ArrayList<Integer>();
        Arrays.sort(nums);
        Helper(res, sol, nums);
        return res;
    }
    private void Helper(List<List<Integer>> res, List<Integer> sol, int[] nums){
        if(sol.size()==nums.length){
            res.add(new ArrayList<Integer>(sol));
            return;
        }
        for(int i=0; i<nums.length; i++){
            sol.add(nums[i]]);
            Helper(res, sol, nums);
            sol.remove(sol.size()-1);
        }
    }
}