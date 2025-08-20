package com.dsa;

public class UniqueWithXOR {
    public static void main(String[] args) {
        int [] arr = {2,2,4,4,5,5,6,6,7};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique= 0;

        for(int n: arr){
            unique^=n;
        }
        return unique;
    }
}
