public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates==null||candidates.length()==0){
            return res;
        }
        List<Integer> sol = new ArrayList<Integer>();
        helper(candidates, target, sol, res, 0);
        return res;
    }
    private void helper(int[] candidates, int target, List<Integer> sol, List<List<Integer>> res, int pos){
        if(target==0){
            res.add(new ArrayList<Integer>(sol));
        }
        for(int i=pos; i<candidates.length; i++){
            if(candidates[i]>target){
                return;
            }
            sol.add(candidates[i]);
            helper(candidates, target-candidates[i], sol, res, i);
            sol.remove(sol.size()-1);
        }
    }
}