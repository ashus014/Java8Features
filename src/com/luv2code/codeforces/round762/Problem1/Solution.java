package com.luv2code.codeforces.round762.Problem1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tot = scan.nextInt();
        int mid = -1;
        String subStringOne = "";
        String subStringTwo = "";

        while(tot > 0){
            --tot;

            String string = scan.next();
            if(string.length()==1) System.out.println("NO");
            else{

                mid = string.length()/2;
                subStringOne = string.substring(0,mid);
                subStringTwo = string.substring(mid);
                if(subStringOne.equals(subStringTwo)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
