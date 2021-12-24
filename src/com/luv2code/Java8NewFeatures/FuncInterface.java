package com.luv2code.Java8NewFeatures;

public interface FuncInterface {

    void abstractFun(int x);
    default void normalFun()
    {
        System.out.println("Hello");
    }
}
