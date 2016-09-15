public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return;
        }
       int n = matrix.length;
        int temp = 0;
        for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
        temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    
    for(int i=0; i<n; i++){
      for(int j=0; j<n/2; j++){
        temp = matrix[i][j];
        matrix[i][j] = matrix[i][n-1-j];
        matrix[i][n-1-j] = temp;
      }
    }
    }
}