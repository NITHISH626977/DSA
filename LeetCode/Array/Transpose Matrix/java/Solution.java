class Solution {
    public int[][] transpose(int[][] mat) {
    int row=mat.length;
    int col=mat[0].length;
        int re[][]=new int [col][row];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                re[j][i]=mat[i][j];

            }
        }
        return re;
    }
}