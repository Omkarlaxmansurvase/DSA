package com.omkar;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner in = new Scanner(System.in);
        int min=0;
        int profit=0;
        int minIndex=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                 min=arr[i];
                 minIndex=i;
//                 for(int j=minIndex;j<arr.length;j++){
//                     while(j<arr.length){
//                         profit=arr[j+1]-min;
//                     }
//                 }

            }
        }
//        System.out.println(minIndex);
//        System.out.println(profit);
        System.out.println(min);
    }
}
