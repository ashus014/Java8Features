package com.luv2code.codechef.decembercookoff;

import java.util.Scanner;

public class ProblemTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String [] result = new String[num];

        for (int i=0;i<num;i++) {

            int x1 = scan.nextInt();
            int y1 = scan.nextInt();

            if(x1 == y1) result[i]="YES";
            else if(x1 < y1) result[i]="NO";
            else{

                for(;y1 < x1;){

                    y1 = y1 + 2;
                    x1 = x1 + 1;

                    if(x1 == y1){
                        result[i]="YES";
                        break;
                    }
                    result[i]="NO";
                }

            }

        }

        for (int i=0;i<num;i++) {

            System.out.println(result[i]);
        }
    }
}
