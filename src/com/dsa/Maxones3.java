package com.dsa;

import java.util.List;

public class Maxones3 {
    public static void main(String[] args) {
        int []nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
       int ans= findMaxones(nums,k);
        System.out.println(ans);

    }
    static int findMaxones(int [] nums ,int k ){
        int maxLength = 0, l=0,r=0,zeros=0;

        while(r<nums.length){
            if(nums[r] ==0) zeros++;
            while(zeros>k) {
                if (nums[l] == 0) {
                    zeros--;

                }
                l++;
            }
            if(zeros<=k){
                int length = r-l+1;
                maxLength=Math.max(maxLength,length);
            }
            r++;
        }
        return maxLength;
    }
}
