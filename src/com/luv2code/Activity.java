package com.luv2code;

public interface Activity {

    public void Show();

    //Java 8 new feature is to declare an interface inside a method

    //You need to add default in front of your method

    default public void shineNow(){

    }

}
