package com.omkar;

import java.util.Arrays;

public class Vargs {
    public static void main(String[] args) {
        fun("omkar");//impliicitly return an array
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

}
