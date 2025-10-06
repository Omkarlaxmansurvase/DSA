package com.dsa;

import java.util.Arrays;
import java.util.Stack;

public class NextgreaterEle {
    public static void main(String[] args) {
    int []arr={1,3,2,1,8,6,3,4};
    int n = arr.length;
    int [] res = new int[n];
    retunArrWithGreater(arr,res);

    }
    static void retunArrWithGreater(int [] arr,int[]res){
        int n = arr.length;
        Stack<Integer> st =new Stack<>();
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i =n-2;i>=0;i--){
//            if(arr[i]<st.peek()){
//                res[i]=st.peek();
//                st.push(arr[i]);
//            }
            while(st.size()>0 && st.peek()<=arr[i] ){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;

            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }

}

