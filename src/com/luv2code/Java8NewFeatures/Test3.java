package com.luv2code.Java8NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Test3 {

    public static void main(String[] args) {

       ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee("Ashu",1000));
        l.add(new Employee("Akash",2000));
        l.add(new Employee("AnuKriti",3000));
        l.add(new Employee("Prashant",4000));
        l.add(new Employee("Subbhi",5000));

        Function<Employee, String> f1 = x -> {
            int salary = x.salary;
            return (salary >= 3000)?"Possible":"not Possible";
        };

        for(int i=0; i<l.size(); i++){
            Employee tempEmp = l.get(i);
            System.out.println(f1.apply(tempEmp));
        }

        /*int[] list = {11,22,33,44,55,66,77,88,99};


        Function<Integer, Integer> function = x -> x*x;
        System.out.println(function.apply(7));*/

        //Employee[] e1

        /*Predicate<Integer> p1 = x -> x%2==0;
        Predicate<Integer> p2 = x -> x>10;

        for(int i=0; i<list.length; i++){

            if(p1.and(p2).test(list[i])) System.out.println(list[i]);
        }*/

        /*ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee("Ashu",1000));
        l.add(new Employee("Akash",2000));
        l.add(new Employee("AnuKriti",3000));
        l.add(new Employee("Prashant",4000));
        l.add(new Employee("Subbhi",5000));

        Predicate<Employee> p = i->i.salary>3000;

        for(Employee temp : l){
            if(p.test(temp)) System.out.println(temp.name);
        }*/

        /*Predicate<Integer> predicate = i -> i%2==0;
        System.out.println(predicate.test(31));
        System.out.println(predicate.test(32));*/

        //Predicate to check the length of String is greater than 5 or not
        /*Predicate<String> pre1 = i-> i.length()>5;
        System.out.println(pre1.test("AshuSingh"));
        System.out.println(pre1.test("Ashu"));*/

    }
}


