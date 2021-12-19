package com.luv2code.RandomCodes;

class A1{

    private int id;
    private String name;
    private int marks;

    public A1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

class A2{

    private int id;
    private String name;
    private int marks;

    public A2(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

class aa{

    public void showAA(){
        System.out.println("inside aa");
    }
}

class bb extends  aa{

    public void showAA(){
        System.out.println("inside bb");
    }

    public static void main(String[] args) {

       new bb().showAA();
    }
}

class A3{

    int a;
    int b;
    String str;

    public void setValue(int a, int b, String str){
        a=a;
        b=b;
        str=str;
    }

    public void display(){

        System.out.println("Value of a :: " + a);
        System.out.println("Value of b :: " + b);
        System.out.println("Value of str :: " + str);
    }
}

public class ActivityImpl {

    public static void main(String[] args) {

        A1 a1 = new A1(1, "Ashu", 99);
        A2 a2 = new A2(1, "Ashu", 99);

        System.out.println(a1.equals(a2));
        System.out.println(a1);
        System.out.println(a2);

        String str = "Ashu";

        String str1 = new String("Ashu");

        System.out.println(str);
        System.out.println(str1);

        System.out.println("-------------------");

        A3 a3 = new A3();
        a3.setValue(2,3, "Ashu");
        a3.display();

    }
}
