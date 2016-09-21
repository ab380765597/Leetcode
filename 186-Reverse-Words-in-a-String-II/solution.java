public class Solution {
    public void reverseWords(char[] s) {
        // 三步翻转法
         if(s==null||s.length==0){
             return;
         }
         int length = s.length;
         partialRev(s, 0, length-1);
         int i = 0;
         for(int j=1; j<length+1; j++){
             if(j==length||s[j]==' '){
                 partialRev(s, i, j);
             }else if(s[j-1]==' '){
                 i = j;
             }
         }
         
    }
    private void partialRev(char[] s, int start, int end){
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}