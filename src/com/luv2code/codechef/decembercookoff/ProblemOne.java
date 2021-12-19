package com.luv2code.codechef.decembercookoff;

import java.util.Scanner;

public class ProblemOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String [] result = new String[num];

        for (int i=0;i<num;i++) {

            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            if(x1 == x2 || y1 == y2) result[i] = "YES";
            else result[i] = "NO";
        }

        for (int i=0;i<num;i++) {

            System.out.println(result[i]);
        }
    }
}
