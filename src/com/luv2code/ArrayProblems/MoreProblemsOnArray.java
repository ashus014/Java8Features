package com.luv2code.ArrayProblems;

import java.util.*;
import java.util.stream.Collectors;

public class MoreProblemsOnArray {

    public int thirdMax(int[] nums) {

        /*List<Integer> list = new ArrayList<Integer>();
        for(int i : nums) list.add(i);*/


        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .distinct()
                .sorted(((f1, f2) -> Integer.compare(f2,f1)))
                .collect(Collectors.toList());

                                /*list = list.stream()
                                .distinct()
                                .sorted( ((f1, f2) -> Integer.compare(f2,f1)))
                                .collect(Collectors.toList());*/



        System.out.println(list);

        if(list.size() < 3){

            return list.get(0);
        }
        else{

            return list.get(2);
        }

    }

    //Container with most water problem
    public int maxArea(int[] height) {

        int maxResult=-1;
        int tempResult=0;

        for(int i=0; i<height.length; i++ ){

            for(int j=i+1; j<height.length; j++){

                tempResult = (((j+1)-(i+1))*Integer.min(height[i], height[j]));
                if(tempResult > maxResult){
                    maxResult = tempResult;
                }
            }
        }
        return maxResult;
    }

}
