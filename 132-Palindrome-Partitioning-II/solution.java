public class Solution {
    public int minCut(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int length = s.length();
        int[] f = new int[length+1];
        f[0] = 0;
        for(int i=1; i<=length; i++){
            f[i] = Integer.MAX_VALUE;
            for(int j=0; j<=i; j++){
                String temp = s.substring(j, i);
                if(isValid(temp)){
                    f[i] = Math.min(f[i], f[j]+1);
                }
            }
        }
        return f[length];
    }
    private boolean isValid(String s){
        if(s==null||s.length()<2){
            return true;
        }
        int length = s.length();
        for(int i=0, j=length-1; i<j; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}