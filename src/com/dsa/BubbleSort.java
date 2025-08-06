package com.dsa;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int [] arr){


        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                //swaping
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

            }
        }
    }
}
