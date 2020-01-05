package com.own.coursera;

/**
 * @author raihan on 1/4/2020
 */

public class MaxPairwiseProductStressTest {
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
    static long MaxPairwiseProductNaive(long[] numbers) {
        long product = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                product = Math.max(product,
                        numbers[i] * numbers[j]);
            }
        }
        return product;
    }

    public static void main(String[] args) {
        while(true) {
            int n = (int) ((Math.random() * ((9 - 2) + 1)) + 2);
            long[] numbers = new long[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = (int) ((Math.random() * ((100000 - 2) + 1)) + 2);
                System.out.println(numbers[i]);
            }
            long result1 = MaxPairwiseProductFast(numbers);
            long result2 = MaxPairwiseProductNaive(numbers);
            if(result1==result2){
                System.out.println("OK");
            } else {
                System.out.println("Wrong answer");
                break;
            }
        }
    }
}
