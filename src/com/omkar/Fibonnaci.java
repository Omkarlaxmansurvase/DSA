package com.omkar;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println("enter nth number");
        Scanner in = new Scanner(System.in);
        int a= 0;
        int b = 1;
        int n = in.nextInt();
        int count=2;

        while(count<=n){
          int temp=b;
          b=b+a;
          a=temp;
          count++;

        }
        System.out.println(b);
    }
}
