public class Solution {
    public List<List<String>> solveNQueens(int n) {
        //与permutation有关[2, 4, 1, 3];
        List<List<String>> res = new ArrayList<List<String>>();
        if(n<=0){
            return res;
        }
        List<Integer> cols = new ArrayList<Integer>();
        search(n, cols, res);
        return res;
    }
    private void search(int n, List<Integer> cols, List<List<String>> res){
        if(cols.size()==n){
            res.add(drawChessboard(cols));
            return;
        }
        for( int col = 0; col<n; col++){
            if(!isValid(cols, col)){
                continue;
            }
            cols.add(col);
            search(n, cols, res);
            cols.remove(cols.size()-1);
        }
    }
    private boolean isValid(List<Integer> cols, int col){
        int row = cols.size();
        for(int i=0; i<row; i++){
            if(cols.get(i)==col){
                return false;
            }
            if(i-cols.get(i)==row-col){
                return false;
            }
            if(i+cols.get(i) == row+col){
                return false;
            }
        }
        return true;
    }
    private List<String> drawChessboard(List<Integer> cols) {
        List<String> chessboard = new ArrayList<String>();
        for (int i = 0; i < cols.size(); i++) {
            //chessboard[i] = "";
            for (int j = 0; j < cols.size(); j++) {
                if (j == cols.get(i)) {
                    chessboard.add("Q");
                } else {
                    chessboard.add(".");
                }
            }
        }
        
        return chessboard;
    }
}