package com.luv2code.Java8NewFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test2 extends Thread
{
    public static void main(String[] args)
    {
        String a = "amazing";
        String b = new String(a);
        int value = 0;
        value = (a==b) ? 1:2;
        if(value == 1)
        {
            System.out.println("great");
        }
        else if(value == 2)
        {
            System.out.println("great achievement");
        }
        else
        {
            System.out.println("GFG");
        }


        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Hi");
        treeSet.add("U");
        treeSet.add("Welcome");
        treeSet.add("Home");

        for (String temp : treeSet)
            System.out.printf(temp + " ");

        System.out.println("\n");

        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> out = number.stream().map(x->x*x).
                collect(Collectors.toList());
        System.out.println(out);


        FuncInterface fun = (x) -> System.out.println(x);
        fun.abstractFun(5);

        TreeSet<Integer> treeSets = new TreeSet<Integer>();
        int[] ashu = {1,2,3,1,5,4,2,3};

        for(int i=0; i<ashu.length; i++) treeSets.add(ashu[i]);

        System.out.println("-----------------------------");
        treeSets.stream()
                .forEach(System.out::println);


    }
}
