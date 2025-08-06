package com.dsa;

public class Searchin2D {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        int target=15;
        boolean ans= search(arr,target);
        System.out.println(ans);
    }
    static boolean search(int[][] arr ,int target){
        if(arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
