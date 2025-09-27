package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class lenghtOfLongestSubstring {
    public static void main(String[] args) {

    }
    static int findLength(String s){
        Set<Character> charSet = new HashSet<>();
        int maxLength=0,left=0;

        for(int right=0;right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

}
