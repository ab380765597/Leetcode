public class Solution {
    public String reverseString(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        int length = s.length();
        char[] res = s.toCharArray();
        int start = 0;
        int end = length-1;
        while(start<end){
            char temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }
        return new String(res);
    }
}