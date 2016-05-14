public class Solution {
    public int countPrimes(int n) {
        int counter = 0;
        for(int i=0; i<n; i++){
            if(ifPrime(i)){
                counter++;
            }
        }
        return counter;
    }
    private boolean ifPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i*i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}