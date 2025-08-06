package com.omkar;

import java.util.Scanner;

public class MaxinArr {
    public static void main(String[] args) {
        int[]arr = new int[5];
        System.out.println("Enter 5 integers:");
        Scanner sc=new Scanner(System.in);
        int max=0;

        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(int i=1;i<5;i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("your max num is"+max);
    }
}
