public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums==null||nums.length==0){
            return res;
        }
        
        int length = nums.length;
        if(length==1){
            res.add(nums[0]);
            return res;
        }
        int candidate1 = 0;
        int candidate2 = 0;
        int counter1 = 0;
        int counter2 = 0;
        for(int i=0; i<length; i++){
            if(candidate1==nums[i]){
                counter1++;
            }else if(candidate2==nums[i]){
                counter2++;
            }else if(counter1==0){
                candidate1 = nums[i];
                counter1++;
            }else if(counter2==0){
                candidate2 = nums[i];
                counter2++;
            }else{
                counter1--;
                counter2--;
            }
        }
        counter1=0;
        counter2=0;
        for(int i=0; i<length; i++){
            if(nums[i]==candidate1){
                counter1++;
            }else if(nums[i]==candidate2){
                counter2++;
            }
        }
        if(counter1>length/3){
            res.add(candidate1);
        }
        if(counter2>length/3){
            res.add(candidate2);
        }
        return res;
    }
}