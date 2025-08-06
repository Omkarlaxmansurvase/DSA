package com.omkar;
import java.util.Scanner;
import java.util.Arrays;


public class Array {
    public static void main(String[] args) {
//        int[] arr=new int[3];
//        Scanner in = new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//          System.out.println(arr[i]);
//
//        }
//        for(int num:arr){
//            System.out.println(num + "");
//        }
        String[] str = new String[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
