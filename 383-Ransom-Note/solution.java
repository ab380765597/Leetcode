public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote==null||ransomNote=="" && magazine==""){
            return true;
        }
        int length = magazine.length();
        int i=0;
        int j=0;
        for(i=0; i<length-ransomNote.length(); i++){
            for(j=0; j<ransomNote.length(); j++){
                if(ransomNote.charAt(j)!=magazine.charAt(i+j)){
                    break;
                }
            }
            if(j==ransomNote.length()){
                return true;
            }
        }
        return false;
    }
}