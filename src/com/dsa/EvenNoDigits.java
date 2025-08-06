package com.dsa;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNoDigits {
    public static void main(String[] args) {
        int [] nums={12,345,2,6,7869,67};
        System.out.println(FindNumber(nums));

    }

    static int FindNumber(int [] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }

        }
        return count;
    }

    // to check the no are even or not
   static boolean even(int num){
        int NOofDigit=digits(num);
        if(NOofDigit%2==0){
            return true;
        }
        return false;
   }


    // to count no of digits in a number
    static int digits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
