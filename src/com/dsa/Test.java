package com.dsa;

public class Test {
    public static void main(String[] args) {
        int [] nums={3,4,5,1,2};
        int ans=findMin(nums);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {
        int pivot=pivot(nums);

        if(nums[nums.length-1]==pivot){
            return nums[0];

        }
        else{
            return nums[pivot+1];

        }

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
