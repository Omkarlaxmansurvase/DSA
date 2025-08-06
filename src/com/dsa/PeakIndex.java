package com.dsa;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        int ans=PeakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int PeakIndexInMountainArray(int [] arr){
        if(arr.length==0){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start +(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;

            }
        }
        return start;

    }
}
