package com.own.coursera;

import java.util.Scanner;

/**
 * @author raihan on 1/7/2020
 */
public class Fibonacci {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;
        long a = 0;
        long b = 1;
        long sum = 0;
        for (int i = 2 ; i <= n ;i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(calc_fib(i));
        }
    }
}
