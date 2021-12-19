package com.luv2code.RandomCodes;

class AA{

    private void showData() throws Exception{

        System.out.println("I am in AA...");
    }
}

public class InheritenceExample extends AA{

    private void showData() throws Exception{

        System.out.println("I am in InheritenceExample...");
    }

    public static void main(String[] args) throws Exception {

        int[] ashu1, ashu2;
        int ashu3[], ashu4[];
        int a=1234;
        int []ashu = {11,22,33,44,55,66,77,88,999,11};

        InheritenceExample ie = new InheritenceExample();
        ie.showData();
    }
}
