public class Solution {
    public String minWindow(String s, String t) {
        if(s==null||s.length()==0){
            return null;
        }
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int len = t.length();
        for(int i=0; i<len; i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        int min = Integer.MAX_VALUE;
        int count = map.size();
        int fast = 0;
        int slow = 0;
        int startIndex = -1;
        while(fast<length){
            if(map.containsKey(s.charAt(fast))){
                int val = map.get(s.charAt(fast));
                val--;
                map.put(s.charAt(fast), val);
                if(val>=0){
                    count--;
                }
            }
            fast++;
            while(count==0){
                if(fast-slow<min){
                    min = fast-slow;
                    startIndex = left;
                }
                Integer exist = map.get(s.charAt(left));
                if(exist!=null){
                    map.put(s.charAt(left), exist+1);
                    if(exist==0){
                        count++;
                    }
                }
                left++;
            }
        }
        return min==Integer.MAX_VALUE? new String(): new String(s.substring(startIndex, startIndex+min));
    }
}