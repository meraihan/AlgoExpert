package com.own.coursera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author raihan on 1/5/2020
 */
public class MaxPairwiseProduct {
    static long MaxPairwiseProductFast(long[] numbers) {
        int index1 = -1, n = numbers.length;
        for (int i=0;i<n;i++){
            if ((index1==-1) || numbers[i]>numbers[index1]){
                index1 = i;
            }
        }
        int index2 = -1;
        for(int i=0;i<n;i++){
            if(i!=index1 && ((index2==-1) || numbers[i]>numbers[index2])){
                index2=i;
            }
        }
        return (long) numbers[index1] * numbers[index2];
    }
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(MaxPairwiseProductFast(numbers));
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {

                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
