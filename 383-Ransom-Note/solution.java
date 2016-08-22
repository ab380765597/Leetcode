public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote==null||ransomNote=="" && magazine==""){
            return true;
        }
        int length = magazine.length();
        int i=0;
        int j=0;
        while(i<length){
            if(ransomNote.charAt(j)==magazine.charAt(i)){
                j++;
                if(j==j==ransomNote.length()){
                    return true;
                }
            }
            i++;
        }
        if(j==ransomNote.length()){
            return true;
        }
        return false;
    }
}