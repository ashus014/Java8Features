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

        /*
        * A sentence consists of lowercase letters ('a' to 'z'), digits ('0' to '9'), hyphens ('-'), punctuation marks ('!', '.', and ','), and spaces (' ') only. Each sentence can be broken down into one or more tokens separated by one or more spaces ' '.

A token is a valid word if all three of the following are true:

It only contains lowercase letters, hyphens, and/or punctuation (no digits).
There is at most one hyphen '-'. If present, it must be surrounded by lowercase characters ("a-b" is valid, but "-ab" and "ab-" are not valid).
There is at most one punctuation mark. If present, it must be at the end of the token ("ab,", "cd!", and "." are valid, but "a!b" and "c.," are not valid).
Examples of valid words include "a-b.", "afad", "ba-c", "a!", and "!".

Given a string sentence, return the number of valid words in sentence.



Example 1:

Input: sentence = "cat and  dog"
Output: 3
Explanation: The valid words in the sentence are "cat", "and", and "dog".
*
* */

        String[] splitStr = sentence.trim().split("\\s+");
        int validWord = splitStr.length;
        //int numCheck = splitStr.length;

        /*for(String s: splitStr){
            System.out.println("->" + s + " ");
        }*/


        //Check Number
        for (int i=0;i<splitStr.length;i++){

            int hyphen_count=0;
            int punch_count=0;
            String temp = splitStr[i];

            for(int j=0;j<temp.length();j++){


                if(temp.charAt(j) >= '0' && temp.charAt(j)<='9'){

                    --validWord;
                    break;
                }

                if((temp.charAt(j) >='a' && temp.charAt(j) <='z')
                        || temp.charAt(j) == '-' || temp.charAt(j) == '.'
                        || temp.charAt(j) == '!' || temp.charAt(j) == ','){

                        //"-" hyphen count
                        if(temp.charAt(0) == '-' || temp.charAt(temp.length()-1) == '-'){

                            --validWord;
                            break;
                        }

                        if(temp.charAt(j)=='-' && ((temp.charAt(j-1) <'a' || temp.charAt(j-1) >'z') ||
                                (temp.charAt(j+1) <'a' || temp.charAt(j+1) >'z'))){
                            --validWord;

                            break;
                        }

                      if(temp.charAt(j) == '-'){

                          hyphen_count++;
                      }

                      if (hyphen_count>1){
                          --validWord;
                          break;
                      }

                      if( j!=(temp.length()-1)){

                          if(temp.charAt(j) == '!' || temp.charAt(j) == ',' || temp.charAt(j) == '.' ){

                              --validWord;
                              break;
                          }
                      }

                    if(temp.charAt(j) == '!' || temp.charAt(j) == ',' || temp.charAt(j) == '.'){

                        punch_count++;
                    }

                    if (punch_count>1){
                        --validWord;
                        break;
                    }
                }
            }
        }



        return validWord;
    }

}


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



