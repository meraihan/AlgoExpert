package com.own.geeks;

import java.util.*;
import java.lang.*;

public class LongestString {
    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test --> 0){
            int n = in.nextInt();
            String arr[] = new String[n];
            for(int i=0;i<n;i++){
                arr[i] = in.next();
            }
            System.out.println(getLongestString(arr));
        }
    }
}
