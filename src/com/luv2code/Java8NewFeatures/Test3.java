package com.luv2code.Java8NewFeatures;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
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

        Predicate<Employee> p = i->i.salary>3000;

        for(Employee temp : l){
            if(p.test(temp)) System.out.println(temp.name);
        }


        /*Predicate<Integer> predicate = i -> i%2==0;
        System.out.println(predicate.test(31));
        System.out.println(predicate.test(32));*/

        //Predicate to check the length of String is greater than 5 or not
        /*Predicate<String> pre1 = i-> i.length()>5;
        System.out.println(pre1.test("AshuSingh"));
        System.out.println(pre1.test("Ashu"));*/

    }
}


