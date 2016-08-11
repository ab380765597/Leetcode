public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length1 = nums1.length;
        int length2 = nums2.length;
        for(int num: nums1){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int j=0; j<length2; j++){
            if(map.containsKey(nums2[j])){
                int frq = map.get(nums2[j]);
                frq--;
                if(frq>0){
                    map.put(nums2[j], frq);
                    
                }else{
                    map.remove(nums2[j]);
                }
                
                arr.add(nums2[j]);
            }
            /*if(map.containsKey(nums2[j])){
                int feq = map.get(nums2[j]);
                if(feq>1){
                    map.put(nums2[j], feq-1);
                }else{
                    map.remove(nums2[j]);
                }
                arr.add(nums2[j]);
            }*/
            
        }
        int[] res = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}