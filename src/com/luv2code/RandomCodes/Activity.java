package com.luv2code.RandomCodes;

public interface Activity {

    public void Show();

    //Java 8 new feature is to declare an interface inside a method

    //You need to add default in front of your method

    default public void shineNow(){
        System.out.println("AshuSingh");


    }

    //protected  short stop=23;
    //public static  short stop=23;
    //transient short stop=23;


}
