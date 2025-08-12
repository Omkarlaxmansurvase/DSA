package com.dsa;

public class factorial {
    public static void main(String[] args) {
        System.out.println(F(5));
    }
    static int F(int n ){
        if(n==0) return 1;
        return n* F(n-1);
    }
}
