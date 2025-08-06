package com.dsa;

public class TargetInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr,int target){
        int peak=PeakIndexInMountainArray(arr);
        int firstTry=ASearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return ASearch(arr,target,peak+1,arr.length-1);

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
    static int ASearch(int []arr,int target,int start ,int end){
        if(arr.length==0){
            return -1;
        }


        // to find the arr is asc or desc
        boolean asc = arr[start]<arr[end];

        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]== target){
                return mid;
            }
            if(asc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }
        }
        return arr[start];
    }
}
