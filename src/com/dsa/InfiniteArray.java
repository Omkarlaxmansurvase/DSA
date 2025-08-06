package com.dsa;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] arr=new int[13];
        for(int i=0;i<13;i++){
            arr[i]=in.nextInt();
        }
        int target=15;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    public static int search(int[]arr,int target){

        int start=0;
        int end=2;
        for(int i=start;i<=end;i++){
            while(start<=end){
                if(arr[i]!=target){
                    start=end+1;
                    end=end+2;
                }
                else if (arr[i]==target) {

                    while(start<=end){
                        int mid = start +(end-start)/2;
                        if(target<arr[mid]){
                            end=mid-1;
                        }
                        else if(target>arr[mid]){
                            start=mid+1;
                        }
                        else
                            return mid;

                    }

                }
            }

        }
        return -1;
    }
}
