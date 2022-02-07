package com.aditya.Backtracking;

public class NKnights {
    public static void main(String[] args) {

    }
    static int knights(boolean[][] board,int row,int col, int k){
        if (k == 0){
            display(board);
            System.out.println();
            return 1;
        }

    }

    private static void display(boolean[][] board) {
        for (boolean[] row :board){
            for (boolean element : row){
                if (element){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
