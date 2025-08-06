package com.dsa;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num={34,432,43,55,23,54,22};
        int target=55;
        Scanner in=new Scanner(System.in);
        int ans=Search(num,target);
        System.out.println(ans);



    }
    static int Search(int[] arr, int target){
        System.out.println("enter the range of the array");
        Scanner in=new Scanner(System.in);
        int range1=in.nextInt();
        int range2=in.nextInt();
        if (arr.length == 0){
            return -1;
        }

        for (int i = range1; i <range2; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }

        return -1;
    }
}
