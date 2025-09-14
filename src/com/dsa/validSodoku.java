package com.dsa;

import java.util.HashSet;

public class validSodoku {
    public static void main(String[] args) {

    }
    static boolean isValidSodoku(char[][] board){
        int n=9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for(int i=0;i<n;i++){
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }

        for (int r = 0;r<board.length;r++){
            for(int c=0; c<board[r].length;c++){
                char cell = board[r][c];

                if(cell =='.'){
                    continue;
                }

                if(rows[r].contains(cell)){
                    return false;
                }

                rows[r].add(cell);

                if(cols[c].contains(cell)){
                    return false;
                }

                cols[c].add(cell);

                int boxIndex = 3*(r/3)+(c/3);

                if(boxes[boxIndex].contains(cell)){
                    return false;
                }

                boxes[boxIndex].add(cell);
            }
        }
        return true;
    }

}
