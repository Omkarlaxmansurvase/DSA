package com.omkar;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        while(n>0){
           int  rem=n%10;
            n=n/10;
            ans= ans*10+rem;

        }
        System.out.println(ans);



    }
}
