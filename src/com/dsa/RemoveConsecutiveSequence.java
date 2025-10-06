package com.dsa;

import java.util.Stack;

public class RemoveConsecutiveSequence {
    public static void main(String[] args) {
        int []arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};

        Stack<Integer> st = new Stack<>();

        int n = arr.length;

        for(int i =0;i<n;i++){
            if(st.size()==0){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                if(arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
            else {
                st.push(arr[i]);
            }
        }
        System.out.println(st);
    }
}
