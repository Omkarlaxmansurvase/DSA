package com.omkar;

public class PalWithrecurr {
    static int sum=0;
    public static void main(String[] args) {

        System.out.println(isPalindrome(1771));
    }

    static boolean isPalindrome(int n){

        rev(n);
        return n == sum;

    }
    static void rev(int n){
        if(n==0){
            return;
        }

        int rem = n%10;
        sum  = sum * 10 +rem;
        rev(n/10);

    }
}
