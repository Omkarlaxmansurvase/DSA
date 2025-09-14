package com.dsa;

public class KokoEatingBanana {
    public static void main(String[] args) {

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);


        while (low<=high){
            int mid = low + (high-low)/2;

            int tHour= reqHour(piles,mid);
            if(tHour<=h){
                // int ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    public int reqHour(int [] piles,int speed){
        int hrs = 0;
        for(int i=0;i<piles.length;i++){
            hrs +=Math.ceil((double)piles[i]/speed);
        }
        return hrs;
    }
    public int max(int [] piles){
        int max=0;


        max=piles[0];
        for(int i=1;i<piles.length;i++){

            if(piles[i]>max){
                max=piles[i];
            }
        }
        return max;
    }
}
