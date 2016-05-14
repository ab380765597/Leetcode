public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates==null||candidates.length==0){
            return res;
        }
        Arrays.sort(candidates);
        List<Integer> sol = new ArrayList<Integer>();
        helper(sol, res, candidates, target, 0);
        return res;
    }
    private void helper(List<Integer> sol, List<List<Integer>> res, int[] candidates, int target, int pos){
        if(target==0){
            res.add(new ArrayList<Integer>(sol));
            return;
        }
        int prev = -1;
        for(int i=pos; i<candidates.length; i++){
            if(target<candidates[i]){
                break;
            }
            if(prev!=-1 && candidates[i]==prev){
                continue;
            }
            prev = candidates[i];
            sol.add(candidates[i]);
            helper(sol, res, candidates, target-candidates[i], i+1);
            sol.remove(sol.size()-1);
        }
    }
}