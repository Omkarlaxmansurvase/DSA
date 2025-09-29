package com.dsa;

public class ConatinerWithMaxWater {
    public static void main(String[] args) {
        int []arr={1,8,6,2,5,4,8,3,7};
        int ans=MaxWaterContain(arr);
        System.out.println(ans);
    }
    static int MaxWaterContain(int [] arr){
        int n= arr.length;
        int lp=0,rp=n-1,maxWater=0;
        while(lp<rp){
            int width = rp-lp;
            int ht = Math.min(arr[lp],arr[rp]);
            int currentWater=width*ht;
            maxWater=Math.max(maxWater,currentWater);
            if(arr[lp]<arr[rp]){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxWater;
    }
}
