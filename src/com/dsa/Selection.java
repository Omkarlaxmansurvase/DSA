package com.dsa;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int [] arr={4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int [] arr){
        for(int i =0; i<arr.length-1;i++){
            int end=arr.length-i-1;
            int maxIndex=getMaxindex(arr,0,end);
            swap(arr,maxIndex,end);

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxindex(int [] arr ,int start,int end){
        int max=start;
        for(int i=start;i<end;i++){

            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
