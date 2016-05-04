class Pair{
    int key;
    int value;
    public Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
}

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums==null||nums.length==0){
            return res;
        }
        int length = nums.length;
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k, pairComparator);
        for(int i=0; i<length; i++){
            int temp = nums[i];
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp)+1);
            }else{
                map.put(temp, 1);
            }
        }
        for(int num: map.keySet()){
            if(pq.size()<k){
                pq.offer(new Pair(num, map.get(num)));
            }else{
                if(map.get(num)>map.get(pq.peek().key)){
                    pq.poll();
                    pq.offer(new Pair(num, map.get(num)));
                }
            }
        }
        while(!pq.isEmpty()){
            res.add(pq.poll().key);
        }
        return res;
    }
    private Comparator<Pair> pairComparator = new Comparator<Pair>(){
        public int compare(Pair left, Pair right){
            if(left.value!=right.value){
                return left.value-right.value;
            }
            return right.key-left.key;
        }
    };
}