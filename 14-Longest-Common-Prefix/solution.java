public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = strs.length;
        int point = 0;
        while(point<=strs[0].length){
            String temp = sb.toString();
            sb.append(strs[0].charAt(point));
            for(int i=1; i<length; i++){
                if(!strs[i].substring(0, point).equals(sb.toString())){
                    return temp;
                }
            }
            point++;
        }
        return sb.toString();
    }
}