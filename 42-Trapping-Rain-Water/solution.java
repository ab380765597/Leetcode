public class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int[] container = new int[height.length];
        int max = 0;
        for(int i=0;i<height.length;i++){
            container[i] = max;
            max = Math.max(max, height[i]);
        }
        max = 0;
        int area = 0;
        for(int i=height.length-1;i>=0;i--){
            container[i] = Math.min(max, container[i]);
            max = Math.max(max, height[i]);
            if(container[i]>height[i]){
                area = area+container[i] - height[i];
            }
        }
        return area;
    }
}