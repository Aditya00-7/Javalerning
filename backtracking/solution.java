package backtracking;
import java.util.ArrayList;

public class solution {
    public void helper(char[][] board, list<list<String>> allBoards, int col) {
        for (int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
            }
        }
    }
        public list<list<String>> solveNQueens ( int n){
            list<list<String>> allBoards = new ArrayList<>();
        }
    }