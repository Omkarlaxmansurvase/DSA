package com.omkar;
import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {


        int[][] arr= new int[3][3];

        Scanner in = new Scanner(System.in);

        //input

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
//        //output
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // this is to string method
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }


        // this is enhanced for loops
        for(int[] a :arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
