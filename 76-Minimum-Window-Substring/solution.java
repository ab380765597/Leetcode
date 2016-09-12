public class Solution {
    int initTargetHash(int[] targethash, String Target){
        int targetnum = 0;
        for(char ch: Traget.toCharArray()){
            targetnum++;
            targethash[ch]++;
        }
        return targetnum;
    }
    boolean vaild(int[] sourceHash, int[] targetHash){
        for(int i=0; i<256; i++){
            if(targetHash[i]>sourceHash[i]){
                rerturn false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int ans = Integer.MAX_VALUE;
        String minStr = "";
        
        int[] sourceHash = new int[256];
        int[] targetHash = new int[256];
        
        initTargetHash(targetHash, Target);
        int j = 0; 
        int i = 0;
        for(i=0; i<length; i++){
            while(!valid(sourceHash, targetHash) && j<length){
                sourceHash[Source.charAt(j)]++;
                if(j<length){
                    j++;
                }else{
                    break;
                }
            }
            if(valid(sourceHash, targetHash)){
                if(ans>j-i){
                    ans = Math.min(ans, j-i);
                    minStr = s.substring(i, j);
                }
            }
            sourceHash[s.charAt(i)]--;
            
        }
        return minStr;
    }
}