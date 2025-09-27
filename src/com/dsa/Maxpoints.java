package com.dsa;

public class Maxpoints {
    public static void main(String[] args) {
        int []arr={6,2,3,4,7,2,1,7,1};
        int k=4;
        int ans=obtainPoints(arr,k);
        System.out.println(ans);
    }
    static int obtainPoints(int [] arr, int k){
        int n = arr.length-1;
        int lSum=0,rSum=0,maxSum=0;
        for(int i=0;i<=k-1;i++){
            lSum=lSum+arr[i];
            maxSum=lSum;
        }

        int rIndex=n;
        for(int i =k-1;i>=0;i--){
            lSum = lSum-arr[i];
            rSum=rSum+arr[rIndex];
            rIndex=rIndex-1;
            maxSum=Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
}
