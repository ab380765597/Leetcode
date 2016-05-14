public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        if(s==null||s.length()==0){
            return res;
        }
        int length = s.length();
        List<String> path = new ArrayList<String>();
        helper(res, path, 0, s);
        return res;
    }
    private void helper(List<List<String>> res, List<String> path, int pos, String s){
        if(pos==s.length()){
            res.add(new ArrayList<String>(path));
            return;
        }
        for(int i=pos+1; i<=s.length(); i++){
            String temp = s.substring(pos, i);
            if(!isPalindrome(temp)){
                continue;
            }
            path.add(temp);
            helper(res, path, i, s);
            path.remove(path.size()-1);
        }
    }
    private boolean isPalindrome(String s){
        if(s==null||s.length()==0){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}