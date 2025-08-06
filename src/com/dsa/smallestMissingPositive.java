package com.dsa;

public class smallestMissingPositive {
    public static void main(String[] args) {

    }
    static int firstMissingPositive(int[]arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i]>0 &&  arr[i]<arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else  {
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
