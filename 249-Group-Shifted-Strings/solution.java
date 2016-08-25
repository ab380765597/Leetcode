public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        
        /*
        ["eqdf", "qcpr"]。

((‘q’ - 'e') + 26) % 26 = 12, ((‘d’ - 'q') + 26) % 26 = 13, ((‘f’ - 'd') + 26) % 26 = 2

((‘c’ - 'q') + 26) % 26 = 12, ((‘p’ - 'c') + 26) % 26 = 13, ((‘r’ - 'p') + 26) % 26 = 2
        
        
        */
        List<List<String>> res = new ArrayList<List<String>>();
        if(strings==null||strings.length==0){
            return res;
        }
        int length = strings.length;
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str: strings){
            int len = str.length();
            char[] arr = str.toCharArray();
            if(arr.length>0){
                int diff = arr[0]-'a';
                for(int i=0; i<arr.length; i++){
                    if(arr[i]-diff<'a'){
                        arr[i] = (char)(arr[i]-diff+26);
                    }else{
                        arr[i] = (char)(arr[i]-diff);
                    }
                }
            }
            String newString = new String(arr);
            if(map.containsKey(newString)){
                map.get(newString).add(str);
            }else{
                List<String> temp = new ArrayList<String>();
                temp.add(str);
                map.put(newString, temp);
            }
        }
        for(String num: map.keySet()){
            Collections.sort(map.get(num));
        }
        res.addAll(map.values());
        return res;
    }
}