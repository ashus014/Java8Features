package com.luv2code.Java8NewFeatures;

@FunctionalInterface
public interface A1 {

    void A1fun();

    default  void A1method(){
        System.out.println("This is A1 method");
    }

    default  void A2method(){
        System.out.println("This is A2 method");
    }

    default  void A3method(){
        System.out.println("This is A3 method");
    }
}
