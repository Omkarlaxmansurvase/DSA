package com.dsa;

import java.util.Arrays;
import java.util.Stack;

public class PrevGreaterEle {
    public static void main(String[] args) {
        int []arr={100,80,60,70,60,75,85};
        int n = arr.length;
        int [] res = new int[n];
        retunArrWithprevGreater(arr,res);
    }
    static void retunArrWithprevGreater(int [] arr,int[]res){
        int n = arr.length;
        Stack<Integer> st =new Stack<>();
        res[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){

            while(st.size() > 0 && arr[st.peek()] <= arr[i])
            {
                st.pop();
            }
            if(st.size()==0){
                res[i] =i+1;

            }
            else{
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
