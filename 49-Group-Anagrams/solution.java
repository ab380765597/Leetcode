public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        if(strs==null||strs.length==0){
            return res;
        }
        int length = strs.length;
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0; i<length; i++){
            String temp = strs[i];
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            String key = Strings.valueOf(arr);
            if(map.containsKey(key)){
                map.get(key).add(temp);
            }else{
                map.put(key, new ArrayList<String>());
                map.get(key).add(temp);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}