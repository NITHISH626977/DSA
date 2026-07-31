class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set s=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char number = board[i][j];
                if(number!='.'){
                    if(!s.add(number+"in r"+i)||
                    !s.add(number+"in c"+j)||
                    !s.add(number+"in b"+i/3+"."+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}