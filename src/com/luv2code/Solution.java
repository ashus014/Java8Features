package com.luv2code;

import java.util.*;

public class Solution {

    public int finalValueAfterOperations(String[] operations) {

        int total=0;

        for(int i=0; i<operations.length; i++){

            if(operations[i].equals("X++") || operations[i].equals("++X")){
                total+=1;
            }
            if(operations[i].equals("X--") || operations[i].equals("--X")){
                total-=1;
            }

        }

        return total;

    }

    public String defangIPaddr(String address) {

        return address.replace(".","[.]");
    }

    public int numJewelsInStones(String jewels, String stones) {

        int result = 0;

        for(int i=0;i<jewels.length();i++){

            for(int j=0; j<stones.length();j++){

                if( jewels.charAt(i) == stones.charAt(j)){

                    result+=1;
                }
            }

        }

        return result;
    }

    public String restoreString(String s, int[] indices) {

        String str = new String(s);

        for(int i=0; i<indices.length;i++){

            str = str.substring(0,indices[i]) + s.charAt(i)
                    + str.substring(indices[i]+1);

        }
/////////////////////////////////////////////
        System.out.println("H"+"a");
        System.out.println('H'+'a');

        String ashu = "akash";

        "ashu".equals(ashu);


        return str;
    }

    public String solution(String S) {
        int[] occurrences = new int[26];

        for (char ch : S.toCharArray()) {

            occurrences[ch - 'a']++;
            System.out.print(ch - 'a' + " - ");
            System.out.println(occurrences[ch - 'a']);
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);

    }

    public int countValidWords(String sentence) {

        String[] splitStr = sentence.split("\\s+");

        for(String s : splitStr){
            System.out.println(s);
        }
        return 0;
    }

}

/////////////////////////////////////////////
 class X{

    public static void main(String[] args) {
        try{
            badMethod();
            System.out.println("A");
        }
        catch(Exception ex){
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public  static void badMethod(){
        throw new Error();
    }
}

class I{

    public static void main(String[] args) {

        Object i= new ArrayList<>().iterator();
        System.out.println((i instanceof List)+ ",");
        System.out.println((i instanceof Iterator)+ ",");
        System.out.println((i instanceof ListIterator)+ ",");



        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();

        while(it.hasNext()){
            System.out.println(it.next()+ " " );
        }

    }
}

interface A{
    public void method1();
}

class One implements A{

    public void method1(){
        System.out.println("One............");
    }
}

class Two extends One{
    public void method1(){
        System.out.println("Two..............");
    }
}

class Test extends Two{

    public static void main(String[] args) {
        A a= new Two();
        a.method1();
    }
}



