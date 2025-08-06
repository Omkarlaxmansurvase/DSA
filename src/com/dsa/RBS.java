package com.dsa;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1692875588/

public class RBS {
    public static void main(String[] args) {

    }
    static int search(int[] arr,int target){
        int pivot=pivot(arr);
        if(pivot==-1){
            // so the array is not rotated just do the normal bs
           return binary(arr,target,0,arr.length-1);
        }
        // if U found pivot then you have to asc sorted array

        //case 1
        if(arr[pivot]==target){
            return pivot;
        }
        //case2
        else if(target>arr[0]){
            return binary(arr,target,0,pivot-1);
        }
        //case3
        else{
            return binary(arr,target,pivot+1,arr.length-1);
        }

    }
    static int binary(int [] arr,int target,int start,int end ){



        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else
                return mid;

        }
        return -1;

    }
    static int pivot(int[] arr){
        if(arr.length==0){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            //case1
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            //case2
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //case3
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }


        }
        return-1;
    }
}
