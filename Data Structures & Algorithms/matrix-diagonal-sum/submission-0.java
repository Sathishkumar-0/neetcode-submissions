class Solution {
    public int diagonalSum(int[][] mat) {
        int res=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            res+=mat[i][i];
            if(i != (n-i-1)){
                res+=mat[i][n-i-1];
            }
        }
        return res;
    }
}