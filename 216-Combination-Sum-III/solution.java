public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(k<1||n<1){
            return res;
        }
        List<Integer> sol = new ArrayList<Integer>();
        helper(k, n, 1, res, sol);
        return res;
    }
    private void helper(int k, int n, int pos, List<List<Integer>> res, List<Integer>sol){
        if(n==0 && sol.size()==k){
            res.add(new ArrayList<Integer>(sol));
            return;
        }
        for(int i=pos; i<=9; i++){
            if(i>n){
                break;
            }
            sol.add(i);
            helper(k, n-i; i+1; res, sol);
            sol.remove(sol.size()-1);
        }
    }
}