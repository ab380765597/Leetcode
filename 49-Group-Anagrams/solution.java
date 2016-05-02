public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return null;
        }
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        int length = strs.length;
        for(int i=0; i<length; i++){
            String temp = strs[i];
            Char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            String key = arr.toString();
            if(map.containsKey(key)){
                map.get(key).add(temp);
            }else{
                map.put(key, new ArrayList<String>());
                map.get(key).add(temp);
            }
        }
        for(String key: map.keySet()){
            Collections.sort(map.get(key));
        }
        return new ArrayList<List<String>>(map.values());
    }
}