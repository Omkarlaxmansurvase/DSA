package com.omkar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIst {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> List = new ArrayList<>(10);
        Scanner in  = new Scanner(System.in);
//        List.add(1);
//        List.add(2);
//        System.out.println(List);
//        System.out.println(List.contains(23));

        //input
        for(int i=0;i<5;i++){
            List.add(in.nextInt());
        }


        //to get items
        for(int i=0;i<5;i++){
            System.out.print(List.get(i)); // passing index here
        }
    }
}
