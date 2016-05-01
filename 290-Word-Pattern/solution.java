public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern==null||pattern.length()==0){
            return true;
        }
        String[] arr = str.split(" ");
        int arrlength = arr.length;
        int plength = pattern.length();
        if(arrlength!=plength){
            return false;
        }
        HashMap<String, Character> map = new HashMap<String, Character>();
        for(int i=0; i<arrlength; i++){
            if(map.containsKey(arr[i])){
                if(!map.get(arr[i])!=pattern.charAt(i)){
                    return false;
                }
            }else{
                map.put(arr[i], pattern.charAt(i));
            }
        }
        return true;
    }
}