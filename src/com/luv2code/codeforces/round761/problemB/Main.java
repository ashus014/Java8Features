package com.luv2code.codeforces.round761.problemB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Number{

    int num1;
    int num2;
    int num3;

    public Number(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

}

public class Main {

    public static int findNum3(int num1, int num2){

        int num3=-1;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1 % i == 0 && num2 % i == 0){
                num3 = i;
            }
        }
        return num3;
    }

    public static void main(String[] args) {

        int numberN, num1, num2, num3=0, max=-1,n=1;
        List<Number> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        numberN = scan.nextInt();
        for(int i=0; i<numberN && n<numberN; i++){
            num1 = i+1;
            num2 = numberN - num1 - n;
            if(i == numberN-1){
                i=0;
                n++;
            }
            if(num1 == num2) continue;
            max = findNum3(num1, num2);
            if(max == num1 || max == num2) continue;
            if(max > num3){
                num3 = max;
                if(num3 > 0 && num1 + num2 + num3 == numberN){
                        Number num = new Number(num1,num2, num3);
                        arrayList.add(num);
                }
            }
        }

        arrayList = arrayList.stream()
                        .sorted((x,y) -> y.num3 - x.num3)
                                .collect(Collectors.toList());


        System.out.println(arrayList.get(0).num1 + " " + arrayList.get(0).num2 + " " + arrayList.get(0).num3);

    }
}
