package com.omkar;

public class Shadowing {
    static int x=40;

    public static void main(String[] args) {
        System.out.println(x);
        int x=90;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
