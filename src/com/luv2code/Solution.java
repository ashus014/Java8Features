package com.luv2code;

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
        return str;
    }


   // Throwable
}
