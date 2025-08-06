package com.omkar;
import java.util.Scanner;

public class cond_loops {
    public static void main(String[] args) {
//        for (int i=0;i<=5;i+=2){
//            System.out.println(i);
//        }
        System.out.println("enter a number");
        Scanner input = new Scanner (System.in);
       int n=input.nextInt();
       for (int i=0;i<=n;i++){
           System.out.print(i);
       }
    }
}
