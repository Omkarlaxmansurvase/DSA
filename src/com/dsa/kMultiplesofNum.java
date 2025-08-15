package com.dsa;



public class kMultiplesofNum {
    public static void main(String[] args) {
        KMN(5,4);
    }
    static void KMN(int num,int k){

        if(k==1){
            System.out.println(num);
            return;
        }
        KMN(num,k-1);
        System.out.println(num*k);
    }
}
