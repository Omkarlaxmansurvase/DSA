package com.dsa;

public class power {
    public static void main(String[] args) {
        System.out.println(square(2,3));
    }
    static int square(int x,int y){
        if(y==0) return 1;
        return square(x,y-1) * x;
    }
}
