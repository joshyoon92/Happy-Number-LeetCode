package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 19;
        boolean ans = isHappy(19);
        System.out.println(ans);
    }
    public static int next(int n){
        int sum = 0;
        while (n>0){
            int d = n%10;
            n = n/10;
            sum+= d*d;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<>();
        while (n !=1 && !h.contains(n)){
            h.add(n);
            n = next(n);
        }
        return n==1;
    }
}
