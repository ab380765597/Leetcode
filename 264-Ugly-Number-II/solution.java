public class Solution {
    public int nthUglyNumber(int n) {
        long[] res = new long[n+1];
        res[0] = 1;
        int k2 = 0;
        int k3 = 0;
        int k5 = 0;
        for(int i=1;i<=n;i++){
            res[i] = Math.min(Math.min(res[k2]*2, res[k3]*3), res[k5]*5);
            if(res[i]/res[k2]==2){
                k2++;
            }
            if(res[i]/res[k3]==3){
                k3++;
            }
            if(res[i]/res[k5]==5){
                k5++;
            }
        }
        return (int)res[n-1];
    }
}