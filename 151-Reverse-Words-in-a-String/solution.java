public class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0||s==' '){
            return "";
        }
        int length = s.length();
        int end = length;
        int start = end-1;
        StringBuilder sb = new StringBuilder();
        while(start>=0){
            if(s.charAt(start)==' '){
                end = start;
            }else if(start==0||s.charAt(start-1)==' '){
                
                String temp = s.substring(start, end);
                if(sb.length()!=0){
                    sb.append(' ');
                }
                sb.append(temp);
            }
            start--;
        }
        return new String(sb);
    }
}