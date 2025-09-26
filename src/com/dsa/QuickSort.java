package com.dsa;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int [] arr={7,13,8,5,10,2,4};
        qsort(arr,0,arr.length-1);
        displayarr(arr);
    }

    static void displayarr(int [] arr){
        for(int val:arr){
            System.out.println(val);
        }
    }

    static int partition(int [] arr,int start,int end){
        int pivot = arr[start];
        int eltsLTPivot=0; // eltsLTPivot is basically count of elements smaller than pivot elements
        for(int i = start+1;i<= end;i++){
            if(arr[i]<=pivot) eltsLTPivot++;  // <= coz for the duplicate elements will be on the right side

        }
        int pivotIndex = start+eltsLTPivot;
        swap(arr,start,pivotIndex);

        int i = start, j =end;

        while(i<pivotIndex && j>pivotIndex){
            while (arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            // at this point we are at the position where the elements are in the wrong position;
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void qsort(int []arr,int start, int end){
        if(start>=end) return;
        int pi = partition( arr,start,end);
        qsort(arr,start,pi-1);
        qsort(arr,pi+1,end);
    }
    static void swap(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
