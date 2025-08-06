package com.dsa;

public class AgnosticSeaarch {
    public static void main(String[] args) {
        int [] arr={3,3,3,3,3,13,56,78,99,108};
        int target=98;
        int ans=Search(arr,target);
        System.out.println(ans);
    }

    static int Search(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

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
