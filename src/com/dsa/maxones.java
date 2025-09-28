package com.dsa;

public class maxones {
    public static void main(String[] args) {
        int [] arr={1,1,0,1,1,1};
        int ans=findmMaxOnes(arr);
        System.out.println(ans);
    }
    static int findmMaxOnes(int [] arr){
        int result =0;
        int count=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                count=0;
            }
            else{
                count++;
            }
            if(result<count){
                result=count;
            }
        }
        return result;
    }
}
