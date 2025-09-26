package com.dsa;

public class LargestSubArray {
    public static void main(String[] args) {
        int [] arr={2,5,1,10,10};
        int k=14;
        LSA(arr,k);
    }
    static void LSA(int [] arr,int k){
        int l = 0,sum=0,maxlen=0,r=0;
        int n= arr.length;

        while(r<n){
            sum=sum+arr[r];

            while(sum>k && l<=r){
                sum = sum-arr[l];
                l=l+1;

            }
            if (sum<=k){
                maxlen=Math.max(maxlen,r-l+1);
                r=r+1;
            }
        }
        System.out.println(maxlen);
    }
}
