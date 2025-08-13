package com.dsa;

public class countDigits {
    public static void main(String[] args) {
        System.out.println(count(568));
    }
    static int count(int n){
        if (n<=9 && n>=0){
            return 1;
        }

        return count(n/10)+1;
    }
}
