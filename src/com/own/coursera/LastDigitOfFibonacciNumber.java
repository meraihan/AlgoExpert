package com.own.coursera;

import java.util.Scanner;

public class LastDigitOfFibonacciNumber {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current)%10;
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int n1=(int)n%60;
        int c = getFibonacciLastDigitNaive(n1);
        System.out.println(c);
    }
}
