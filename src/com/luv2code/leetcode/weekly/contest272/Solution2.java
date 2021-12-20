package com.luv2code.leetcode.weekly.contest272;

public class Solution2 {

    public String addSpaces(String s, int[] spaces) {

        StringBuilder stringBuilder = new StringBuilder(s);
        for(int i=0; i<spaces.length; i++) {
            spaces[i]+=i;
            stringBuilder.insert(spaces[i], ' ');
        }
        return stringBuilder.toString();
    }
}
