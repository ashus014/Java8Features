package com.luv2code;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

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

    public int maxProfit(final List<Integer> A) {

        /*
        * Say you have an array, A, for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit.

You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

Input Format:

The first and the only argument is an array of integer, A.

Output Format:

Return an integer, representing the maximum possible profit.

Constraints:

0 <= len(A) <= 1e5
1 <= A[i] <= 1e7

Example:

Input 1:
    A = [1, 2, 3]


Output 1:
    2



Explanation 1:
    => Buy a stock on day 0.
    => Sell the stock on day 1. (Profit +1)
    => Buy a stock on day 1.
    => Sell the stock on day 2. (Profit +1)



Overall profit = 2
        * */
        if(A.size()==0){
            return 0;
        }
        Integer[] tempList = A.toArray(new Integer[0]);

        Integer[] diffList = new Integer[A.size()-1];
        int totalSum = 0;

        for(int i=0;i<A.size()-1;i++){
            diffList[i] = tempList[i+1] - tempList[i];
            if(diffList[i] > 0){
                totalSum+=diffList[i];
            }
        }

        return totalSum;
    }

    //still workig on this logic...
    public int majorityElement(final List<Integer> A) {

        // Insert all elements in hash
        Map<Integer, Integer> hp =
                new HashMap<Integer, Integer>();

        for(int i = 0; i < A.size(); i++)
        {
            int key = A.get(i);
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }

        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

            return res;
    }

    public void collectionDemo(){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);

        Integer[] ashu = new Integer[arrayList.size()];

        //ashu = arrayList.toArray(ashu);
        ashu = arrayList.toArray(new Integer[0]);

        System.out.println("<--- Before");
        for(Integer temp : ashu){
            System.out.println(temp);
        }

        arrayList.removeIf(n->(n%2==0));

        //Java 8 foreach method
        System.out.println("<--- After");
        arrayList.forEach(n-> System.out.println(n));

        System.out.println("<-----------");
        List<Integer> al = Arrays.asList(10,20,30,40);

        for(Object temp : al){
            System.out.println(temp);
        }

        System.out.println("<-----------");
        List<Integer> linkedList = Arrays.asList(11,22,33,44,55,66,77,88);

        linkedList.stream()
                .filter(x-> x>50)
                .filter(x-> x%2==0)
                .forEach(System.out::println);

        System.out.println("<-----------");
        int[] ashu2 = {55,33,44,22,11};

        Arrays.sort(ashu2);

        for(int x: ashu2){
            System.out.println(x);
        }


    }

    public void streamExamples(){

        //Using Stream printing numbers which has '5'
        Stream.iterate(1, x->x+1)
                .filter(x->x.toString().contains("5"))
                .limit(10)
                .forEach(x-> System.out.println(x));


        /*
        * using Stream to sort chars which begin with 'a' and end with 'c'
        * */

        String arr[] = {"abc", "cde", "acd", "aec", "xyz", "aac"};

        Arrays.stream(arr)
                .filter(x -> x.startsWith("a"))
                .filter(x -> x.endsWith("c"))
                .sorted()
                .forEach(x -> System.out.println(x));

        /*
        *
        *
        * */

    }

    public void searchSmaller(List<Integer> I){

        int benchMark = 10;
        I.stream()
                .filter(x-> x<benchMark)
                .forEach(x-> System.out.println(x));
    }

    //working with sets
    public void setsWorking(){

        List<Integer> linkedList = Arrays.asList(11,22,11,44,55,44,77);

        Set<Integer> hashSet = new HashSet<>(linkedList);
        //Using HashSet
        System.out.println("-> Using HashSet");
        hashSet.stream()
                .sorted()
                .forEach(System.out::println);

        //Using Treeset
        System.out.println("-> Using TreeSet");
        Set<Integer> treeSet = new TreeSet<>(linkedList);
        treeSet.forEach(x-> System.out.println(x));

        System.out.println("---->");
        Integer[] ashuArray = {11,22,33,44,33,22};
        Set<Integer> hashSet2 = new HashSet<>(List.of(ashuArray));
        hashSet2.forEach(System.out::println);


    }

    //take array as an argument and print repeating elemnt
    public void printRepeating(final int[]yourArray){

        Set<Integer> hashSet = new HashSet<>();
        for(int i=0;i<yourArray.length;i++){

            if(!hashSet.add(yourArray[i])){

                System.out.println(yourArray[i]);
            }

        }

    }

    //print common elements of two arrays
    public void printCommon(final int[]array1,final int[]array2){

        Set<Integer> hs2 = new HashSet<Integer>();

        for(int i=0;i<array2.length;i++){
            hs2.add(array2[i]);
        }

        for(int i=0;i<array1.length;i++){

            if(hs2.contains(array1[i])){
                System.out.println(array1[i]);
            }
        }


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

//Example with Predicate Interface to filter records
class GfG{

    static void printCond(Collection<Integer> C, Predicate<Integer> p){

        for(Integer x: C){
            if(p.test(x)) {
                System.out.println(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al = Arrays.asList(10,5,20,7,30);
        printCond(al,x->x%2==0);
    }


}

//More stream examples
class Student{
    int roll;
    int marks;
    String name;

    public Student(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}

class GfG2{

    public static void main(String[] args) {

        List<Student> listStudent = Arrays.asList
                                (new Student(110,70,"abc"),
                                (new Student(101,80,"bcd")),
                                (new Student(120,60,"xyz")));

        double result = listStudent.stream()
                .mapToInt(x -> x.getMarks())
                .average()
                .getAsDouble();

        Collections.sort(listStudent, (x,y)-> x.getRoll() - y.getRoll() );

        listStudent.forEach(System.out::println);

    }


}


