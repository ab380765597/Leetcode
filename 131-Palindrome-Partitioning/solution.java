public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        if(s==null){
            return res;
        }
        List<String> sol = new ArrayList<String>();
        int length = s.length();
        helper(s, sol, res, 0);
        return res;
    }
    private boolean isPalind(String s){
        if(s==null){
            return true;
        }
        if(s.length()<2){
            return true;
        }
        for(int i=0, j=s.length()-1; i<j; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    private void helper(String s, List<String> sol, List<List<String>> res, int pos){
        if(pos==s.length()){
            res.add(new ArrayList<String>(sol));
            return;
        }
        for(int i=pos+1; i<=s.length(); i++){
            String temp = s.substring(pos, i);
            if(!isPalind(temp)){
                continue;
            }
            sol.add(temp);
            helper(s, sol, res, i);
            sol.remove(sol.size()-1);
        }
    }
}