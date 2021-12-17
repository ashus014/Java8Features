package com.luv2code.codeforces.round761.problemB;
import java.util.*;
public class OtherSolutions {

    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int T=fs.nextInt();
        for (int tt=0; tt<T; tt++) {
            int n=fs.nextInt();
            for (int target=2; true; target++) {
                if (gcd(n-1-target, target)!=1)
                    continue;
                System.out.println(n-1-target+" "+target+" "+1);
                if (n-1-target<=1) throw null;
                break;
            }
        }
    }

    static int gcd(int a, int b) {
        return b==0?a:gcd(b, a%b);
    }

    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
}
