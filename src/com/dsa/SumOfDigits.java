package com.dsa;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SOD(1234));
    }
    static int SOD(int n){
        if(n>=0&&n<=9){
            return n;
        }
        return SOD(n/10)+n%10;
    }
}
