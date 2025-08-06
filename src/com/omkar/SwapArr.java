package com.omkar;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 integers");

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the indices of the array you want to swap");
        int index1 = in.nextInt();
        int index2 = in.nextInt();
        swap(arr,index1,index2);
    }
    static void swap(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
