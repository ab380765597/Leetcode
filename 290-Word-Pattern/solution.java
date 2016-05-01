public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern==null||pattern.length()==0){
            return true;
        }
        String arr = str.split(" ");
        int arrlength = arr.length;
        int plength = pattern.length();
        if(arrlength!=plength){
            return false;
        }
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<arrlength; i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arr[i])){
                    return false;
                }
            }else{
                map.put(pattern.charAt(i), arr[i]);
            }
        }
        return true;
    }
}