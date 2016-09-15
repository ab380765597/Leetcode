public class Solution {
    public void rotate(int[][] a) {
        if(a==null||a.length==0||a[0].length==0){
            return;
        }
         int temp = 0;
        for( int i =0; i< a.length; i++ ){
            for( int j = i; j< a[0].length; j++ ){
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for( int i =0; i< a.length; i++ ){
            for( int j =0; j < a.length/2; j++ ){
                temp = a[i][j];
                a[i][j] = a[i][a.length - j - 1];
                a[i][a.length - j - 1] = temp;
            }
        }  
    }
}