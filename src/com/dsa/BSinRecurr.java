package com.dsa;

public class BSinRecurr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target= 8;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int start,int end){

        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
           return search(arr,target,mid+1,end);
        }
        if(target<arr[mid]){
            return search(arr,target,start,mid-1);
        }
        return -1;
    }
}
