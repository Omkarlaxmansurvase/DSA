package com.dsa;

public class AlternatingSigns {
    public static void main(String[] args) {
        System.out.println(add(5));
    }
    static int add(int n ){
        if (n==0){
            return 0;
        }
        if(n%2==0){
            return add(n-1)-n;
        }
        return add(n-1)+n;
    }
}
