package com.luv2code.Java8NewFeatures;

import java.util.TreeSet;
import java.util.function.Function;

public class Test{

    public static void main(String[] args) {

        Function<Integer, Integer> f = i -> i*i;
        System.out.println("Square of 40 : " + f.apply(40));
        System.out.println("Square of 50 : " + f.apply(50));

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Hi");
        treeSet.add("Singh");
        treeSet.add("Akash");
        treeSet.add("Joshi");

        treeSet.stream()
                .forEach(System.out::println);

    }

}
