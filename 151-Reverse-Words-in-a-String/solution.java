public class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        int length = s.length();
        int end = length;
        int start = end-1;
        StringBuilder sb = new StringBuilder();
        while(start>=0){
            if(start==0||s.charAt(start-1)==' '){
                String temp = s.substring(start, end);
                if(sb.length()!=0){
                    sb.append(' ');
                }
                sb.append(temp);
            }else if(s.charAt(start)==' '){
                end = start;
            }
            start++;
        }
        return new String(sb);
    }
}