package com.luv2code.leetcode.weekly.contest272;

public class Solution1 {

    public String firstPalindrome(String[] words) {


        StringBuilder s = new StringBuilder();
        for(int i=0;i<words.length;i++){
            String temp;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(words[i]);
            stringBuilder.reverse();
            if(words[i].equals(stringBuilder.toString())){
                return words[i];
            }
        }

        return "";
    }

}
