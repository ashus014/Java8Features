package com.luv2code;

import java.util.ArrayList;
import java.util.List;

public class ActivityImpl implements Activity{

    @Override
    public void Show() {

    }

    public static void main(String[] args) {


        //Activity activity = new ActivityImpl();
        //activity.shineNow();

        //foreach loop in Collections
        //using lambda expression

        List list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.forEach(i -> System.out.println(i));

    }
}
