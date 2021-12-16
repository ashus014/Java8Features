package com.luv2code.codeforces.round761.problemB;

import java.util.Scanner;

public class Main {

    public static int findNum3(int num1, int num2){

        int num3=-1;

        if(num1 == num2)
            return 1;

        for(int i=1;i<=num1 && i<=num2;i++){

            if(num1 % i == 0 && num2 % i == 0){

                num3 = i;
            }
        }
        return num3;
    }

    public static void main(String[] args) {

        int numberN, num1, num2, num3=0, max=-1;

        Scanner scan = new Scanner(System.in);
        numberN = scan.nextInt();

        for(int i=0; i<numberN; i++){

            for(int j=0; j<numberN; j++){

                num1 = i+1;
                num2 = j+1;
                max = findNum3(num1, num2);

                if(max > num3){
                    num3 = max;

                    if(num3 > 0 && num1 + num2 + num3 == numberN){
                        System.out.println(num1 + " " + num2 + " " + num3);
                    }

                }


            }
        }
    }
}
