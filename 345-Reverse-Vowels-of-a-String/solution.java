public class Solution {
    public String reverseVowels(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        int length = s.length();
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int start = 0;
        int end = length-1;
        while(start<end){
            if(!set.contains(arr[start])){
                start++;
                continue;
            }
            if(!set.contains(arr[end])){
                end--;
                continue;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}