package com.luv2code.RandomCodes;

public class RandomCheck {

    public static int fact(int number){
        return (number == 0)? 1: number * fact(number-1);

        /*if(number == 0) return 1;
        else return number * fact(number-1);*/
    }

    public static void main(String[] args) {
        int factToFind = 5;
        System.out.println(fact(factToFind));
    }
}
