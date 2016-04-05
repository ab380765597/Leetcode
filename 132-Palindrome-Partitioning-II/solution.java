public class Solution {
    public int minCut(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int length = s.length();
        int[] f = new int[length+1];
        f[0] = 0;
        for(int i=1; i<=length; i++){
            f[i] = i-1;
        }
        
        for(int i=1;i<=length; i++){
            for(int j=0; j<i; j++){
                String temp = s.substring(j, i);
                if(ifPalid(temp)){
                    f[i] = Math.min(f[j]+1, f[i]);
                }
            }
        }
        return f[length];
    }
    private boolean ifPalid(String s){
        int length = s.length();
        int start = 0;
        int end = length-1;
        while(start<end){
            if(s.charAt(end)!=s.charAt(start)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}